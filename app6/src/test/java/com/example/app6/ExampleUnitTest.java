package com.example.app6;

import com.example.opet.testeapp.Calculo;
import com.example.opet.testeapp.Categoria;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    private Calculo calculo;
    private Categoria categoria;

    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void multiplicar_correto() throws Exception {
        calculo = new Calculo();
        assertNotNull(calculo);
        int resultado = calculo.multiplicacao(2, 5);
        assertEquals(10, resultado);
    }

    @Test
    public void verificar_par() throws Exception {
        calculo = new Calculo();
        assertNotNull(calculo);
        assertTrue(calculo.par(10));
    }

    @Test
    public void verificar_impar() throws Exception {
        calculo = new Calculo();
        assertNotNull(calculo);
        assertFalse(calculo.par(11));
    }

    @Test
    public void verificar_categoria_infantil() throws Exception {
        categoria = new Categoria();
        assertNotNull(categoria);
        assertTrue("Infantil".equals(categoria.escolhe_categoria(4)));
    }

    @Test
    public void verificar_categoria_adolescente() throws Exception {
        categoria = new Categoria();
        assertNotNull(categoria);
        assertTrue("Adolescente".equals(categoria.escolhe_categoria(12)));
    }

    @Test
    public void verificar_categoria_adulto() throws Exception {
        categoria = new Categoria();
        assertNotNull(categoria);
        assertTrue("Adulto".equals(categoria.escolhe_categoria(18)));
    }

    @Test
    public void verificar_categoria_positivo_null() throws Exception {
        categoria = new Categoria();
        assertNotNull(categoria);
        assertTrue("Inválido".equals(categoria.escolhe_categoria(3)));
    }

    @Test
    public void verificar_categoria_negativo_null() throws Exception {
        categoria = new Categoria();
        assertNotNull(categoria);
        assertTrue("Inválido".equals(categoria.escolhe_categoria(-20)));
    }
}