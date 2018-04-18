package com.example.app5.DAO;

/**
 * Created by Jhow on 04/04/2018.
 */

public class Contato {

    private int id;
    private String nome;
    private String conhecidoDe;

    public Contato() {
    }

    public Contato(int id, String nome, String telefone, String celular, String conhecidoDe) {
        this.id = id;
        this.nome = nome;
        this.conhecidoDe = conhecidoDe;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getConhecidoDe() {
        return conhecidoDe;
    }

    public void setConhecidoDe(String conhecidoDe) {
        this.conhecidoDe = conhecidoDe;
    }


}
