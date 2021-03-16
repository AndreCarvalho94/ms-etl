package br.com.acdev.msetl.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DadosTransformados {

    private String algo;
    private String todo;
    private boolean teveErro;
    private String terceiro;


}
