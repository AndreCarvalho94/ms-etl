package br.com.acdev.msetl.gateways;

import br.com.acdev.msetl.entity.DadosTransformados;

public interface DeadLetter {
    void enviar(DadosTransformados dadosTransformados);
}
