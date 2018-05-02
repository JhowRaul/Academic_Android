package com.example.app6;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import com.example.opet.testeapp.AppDatabase;
import com.example.opet.testeapp.Lembrete;
import com.example.opet.testeapp.LembreteDAO;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() throws Exception {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("com.example.app6", appContext.getPackageName());
    }

    @Test
    public void inserirLembrete() throws Exception {
        Context appContext = InstrumentationRegistry.getTargetContext();
        LembreteDAO lembreteDAO = AppDatabase.getINSTANCE(appContext).lembreteDAO();
        Lembrete lembrete = new Lembrete();
        lembrete.setLembrete("Primeira Nota");
        assertTrue(lembreteDAO.insertLembrete(lembrete) > 0);
        List<Lembrete> lembretes = lembreteDAO.findAll();
        assertEquals(1, lembretes.get(0).getID());
    }
}
