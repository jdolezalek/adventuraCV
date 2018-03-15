/* Soubor je ulozen v kodovani UTF-8.
 * Kontrola kódování: Příliš žluťoučký kůň úpěl ďábelské ódy. */
package com.github.jdolezalek.adventura.main;



import com.github.jdolezalek.adventura.logika.*;
import com.github.jdolezalek.adventura.ui.homeController;
import com.github.jdolezalek.adventura.ui.TextoveRozhrani;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/*******************************************************************************
 * Třída {@code Start} je hlavní třídou projektu,
 * který ...
 *
 * @author    jméno autora
 * @version   0.00.000
 */
public class Start extends Application
{
    /***************************************************************************
     * Metoda, prostřednictvím níž se spouští celá aplikace.
     *
     * @param args Parametry příkazového řádku
     */
    public static void main(String[] args)
    {
        
        //IHra hra = new Hra();
        //TextoveRozhrani ui = new TextoveRozhrani(hra);
        //ui.hraj();
    	
    	launch(args);
    }
    
	@Override
	public void start(Stage primaryStage) throws Exception {
		FXMLLoader loader = new FXMLLoader();
    	loader.setLocation(getClass().getResource("../ui/MainWindow.fxml"));    	
    	Parent root = loader.load();

 //		TODO předání hry kontroleru
    	homeController controller = loader.getController();
    	IHra hra = new Hra();
    	controller.inicializuj(hra);
    	
    	primaryStage.setScene(new Scene(root));
    	primaryStage.show();
    	primaryStage.setTitle("Základní adventura");
		
	}
}
