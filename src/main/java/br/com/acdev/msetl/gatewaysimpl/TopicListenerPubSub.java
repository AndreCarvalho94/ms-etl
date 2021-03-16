package br.com.acdev.msetl.gatewaysimpl;

import br.com.acdev.msetl.entity.Evento;
import br.com.acdev.msetl.entity.Fonte;
import br.com.acdev.msetl.gateways.FonteDeDados;
import br.com.acdev.msetl.gateways.TopicListener;
import br.com.acdev.msetl.gatewaysimpl.handler.ResolveDorDeFonteDeDados;
import br.com.acdev.msetl.usecase.TransformarDadosUseCase;

public class TopicListenerPubSub implements TopicListener {

    private TransformarDadosUseCase transformarDadosUseCase;
    private ResolveDorDeFonteDeDados resolveDorDeFonteDeDados;

    //FICA OUVINDO O PUBSUB
    @Override
    public void executar(Evento evento) {
        Fonte fonte = evento.getFonte();
        FonteDeDados fonteDeDados = resolveDorDeFonteDeDados.resolver(fonte);
        transformarDadosUseCase.executar(evento, fonteDeDados);
    }
}
