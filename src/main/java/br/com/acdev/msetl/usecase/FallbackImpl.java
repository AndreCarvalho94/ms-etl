package br.com.acdev.msetl.usecase;

import br.com.acdev.msetl.entity.DadosTransformados;
import br.com.acdev.msetl.gateways.DeadLetter;

public class FallbackImpl implements Fallback {

    private DeadLetter deadLetter;

    @Override
    public void executar(DadosTransformados dadosTransformados){
        dadosTransformados.setTeveErro(true);
        ///FAZ ALGUM OUTRO PROCESSAMENTO
        deadLetter.enviar(dadosTransformados);
    }

}
