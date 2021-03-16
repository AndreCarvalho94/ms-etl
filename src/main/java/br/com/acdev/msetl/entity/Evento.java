package br.com.acdev.msetl.entity;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Evento {

    private Integer id;
    private LocalDate timestamp;
    private Fonte fonte;
}
