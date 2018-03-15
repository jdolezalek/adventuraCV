package com.github.jdolezalek.adventura.ui;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class homeController extends GridPane {
	
	@FXML private TextField textVstup;
	
	public void odesliPrikaz() {
		System.out.println(textVstup.getText());
	}
}
