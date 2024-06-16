package com.cenaflix;

import com.cenaflix.view.CadastrarFilme;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import java.awt.EventQueue;

/**
 * Classe principal que inicializa a aplicação.
 */
public class Cenaflix {
    public static void main(String[] args) {
        FlatMacLightLaf.setup();
        EventQueue.invokeLater(() -> new CadastrarFilme().setVisible(true));
    }
}
