package br.com.acdev.msetl.gateways;

import br.com.acdev.msetl.entity.Evento;

public interface TopicListener {

    void executar(Evento evento);

}
