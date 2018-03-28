package com.example.app4;

import java.util.Date;

/**
 * Created by opet on 28/03/2018.
 */

public class Projeto {

    /* Atributos */
    private String Nome;
    private Date DataInicio;
    private Date DataEntrega;
    private boolean Finalizado;

    /* Construtores */
    public Projeto() {
    }

    public Projeto(String nome, Date dataInicio, Date dataEntrega, boolean finalizado) {
        Nome = nome;
        DataInicio = dataInicio;
        DataEntrega = dataEntrega;
        Finalizado = finalizado;
    }

    /* Métodos de acesso */
    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public Date getDataInicio() {
        return DataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        DataInicio = dataInicio;
    }

    public Date getDataEntrega() {
        return DataEntrega;
    }

    public void setDataEntrega(Date dataEntrega) {
        DataEntrega = dataEntrega;
    }

    public boolean isFinalizado() {
        return Finalizado;
    }

    public void setFinalizado(boolean finalizado) {
        Finalizado = finalizado;
    }
}
