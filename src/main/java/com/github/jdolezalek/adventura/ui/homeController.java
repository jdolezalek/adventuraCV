package com.github.jdolezalek.adventura.ui;

import com.github.jdolezalek.adventura.logika.IHra;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class homeController extends GridPane {
	
	@FXML private TextField textVstup;
	@FXML private TextArea textVypis;
	@FXML private Button odesli;
	private IHra hra;
	
	public void odesliPrikaz() {
		String vstup = textVstup.getText();
		String vypis = hra.zpracujPrikaz(vstup);
		textVypis.appendText("\n"+vstup+"\n"+vypis);
		textVstup.setText("");
		
		if(hra.konecHry()) {
			 textVypis.appendText("\n"+"Konec hry...");
			 textVstup.setDisable(true);
			 odesli.setDisable(true);
			}

	}
	
	public void inicializuj(IHra hra) 
	{
		this.hra = hra;
		textVypis.setText(hra.vratUvitani());
	}
}
