package com.example.app3;

/**
 * Created by Diego on 14/03/2018.
 */

public class Selecao {
    private String nome;
    private String logo;

    public Selecao(String nome, String logo) {
        this.nome = nome;
        this.logo = logo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }
}
