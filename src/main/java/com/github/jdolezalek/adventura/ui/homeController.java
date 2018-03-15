package com.github.jdolezalek.adventura.ui;

import com.github.jdolezalek.adventura.logika.IHra;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class homeController extends GridPane {
	
	@FXML private TextField textVstup;
	@FXML private TextArea textVypis;
	private IHra hra;
	
	public void odesliPrikaz() {
		System.out.println(textVstup.getText());
	}
	
	public void inicializuj(IHra hra) 
	{
		this.hra = hra;
		textVypis.setText(hra.vratUvitani());
	}
}
