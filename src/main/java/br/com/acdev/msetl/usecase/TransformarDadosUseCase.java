package br.com.acdev.msetl.usecase;

import br.com.acdev.msetl.entity.Dados;
import br.com.acdev.msetl.entity.DadosTransformados;
import br.com.acdev.msetl.entity.Evento;
import br.com.acdev.msetl.gateways.DestinoDeDados;
import br.com.acdev.msetl.gateways.FonteDeDados;

public class TransformarDadosUseCase implements TransformarDados {


    DestinoDeDados destinoDeDados;
    Fallback fallback;

    @Retry(Exception.class, 3, 1000)
    public void executar(Evento evento, FonteDeDados fonteDeDados) {
        DadosTransformados dadosTransformados = DadosTransformados.builder().algo("algo").build();
        try {
            Dados dados = fonteDeDados.obterDados(evento.getId());
            dadosTransformados.setTeveErro(false);
            destinoDeDados.enviarDados(dadosTransformados);
        } catch (Exception e) {
            this.fallback(dadosTransformados);
        } catch (RuntimeException ry){

        }
    }

    @fallback
    public void fallback(DadosTransformados dadosTransformados) {
        fallback.executar(dadosTransformados);
    }


}
