package com.conversor.coordenadas;

import java.awt.*;

import com.conversor.coordenadas.view.MainView;
import org.apache.log4j.BasicConfigurator;

/**
 * @author ccolome
 */
public class Application {

    static {
        BasicConfigurator.configure();
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> new MainView().setVisible(true));
    }


}
