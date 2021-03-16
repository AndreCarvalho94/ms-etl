package br.com.acdev.msetl.usecase;

import br.com.acdev.msetl.entity.DadosTransformados;

public interface Fallback {
    void executar(DadosTransformados dadosTransformados);
}
