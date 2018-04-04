package com.example.app5.DAO;

/**
 * Created by opet on 04/04/2018.
 */

public class Contatos {

    private String nome;
    private String telefone;
    private String celular;
    private String conhecidoDe;

    public Contatos() {
    }

    public Contatos(String nome, String telefone, String celular, String conhecidoDe) {
        this.nome = nome;
        this.telefone = telefone;
        this.celular = celular;
        this.conhecidoDe = conhecidoDe;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getConhecidoDe() {
        return conhecidoDe;
    }

    public void setConhecidoDe(String conhecidoDe) {
        this.conhecidoDe = conhecidoDe;
    }
}
