package gui;

import java.awt.Color;
import java.util.Date;
import java.util.Locale;

import javax.swing.UIManager;

import configuration.ConfigXML;
import domain.Bidaiaria;
import domain.Driver;
import domain.User;
import businessLogic.BLFacade;
import businessLogic.BLFacadeFactory;

public class ApplicationLauncher {

    public static void main(String[] args) {

        ConfigXML c = ConfigXML.getInstance();

        System.out.println(c.getLocale());

        Locale.setDefault(new Locale(c.getLocale()));

        System.out.println("Locale: " + Locale.getDefault());

        Driver driver = new Driver(
                "driver3@gmail.com",
                "Test Driver");

        Date jaiotzeData = new Date();

        User user = new Bidaiaria(
                "U1",
                "abizena",
                jaiotzeData,
                "Gizon",
                "user@gmail.com",
                "pasahitza");

        //MainGUI a = new MainGUI(driver, user);
        //a.setVisible(true);

        try {

            UIManager.setLookAndFeel("avax.swing.plaf.metal.MetalLookAndFeel");
            BLFacade appFacadeInterface =BLFacadeFactory.createBLFacade();
            //MainGUI.setBussinessLogic(appFacadeInterface);

        } catch (Exception e) {

            //a.jLabelSelectOption.setText("Error: " + e.toString());

            //a.jLabelSelectOption.setForeground(Color.RED);

            System.out.println("Error in ApplicationLauncher: " + e.toString());
        }
    }
}