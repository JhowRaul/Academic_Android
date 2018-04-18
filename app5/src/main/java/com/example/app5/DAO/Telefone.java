package com.example.app5.DAO;

/**
 * Created by Jhow on 18/04/2018.
 */

public class Telefone {

    private int id;
    private String tipo;
    private long numero;
    private long id_contato;

    public Telefone(int id, String tipo, long numero) {
        this.id = id;
        this.tipo = tipo;
        this.numero = numero;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public long getId_contato() {
        return id_contato;
    }

    public void setId_contato(long id_contato) {
        this.id_contato = id_contato;
    }
}
