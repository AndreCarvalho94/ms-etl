package br.com.acdev.msetl.usecase;

import br.com.acdev.msetl.entity.DadosTransformados;
import br.com.acdev.msetl.entity.Evento;
import br.com.acdev.msetl.gateways.FonteDeDados;

public interface TransformarDados {
    void executar(Evento evento, FonteDeDados fonteDeDados);
    void fallback(DadosTransformados dadosTransformados);
}
