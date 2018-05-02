package com.example.opet.testeapp;

/**
 * Created by opet on 02/05/2018.
 */

public class Categoria {

    private String categoria;

    public String escolhe_categoria(int idade) {
        if (idade >= 4 && idade < 12) {
            return "Infantil";
        }

        else if (idade >= 12 && idade < 18) {
            return "Adolescente";
        }

        else if (idade >= 18) {
            return "Adulto";
        }

        else {
            return "Inválido";
        }
    }
}
