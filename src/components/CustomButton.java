package components;

import config.Config;
import javafx.scene.control.Button;
import javafx.scene.text.Font;

public class CustomButton extends Button {

	public CustomButton(String text) {
		
		this.setText(text);
		this.setPrefHeight(40);
		this.setPrefWidth(340);
		this.setVisible(true);
		this.setStyle(Config.initialButtonStyle);
		this.setFont(Font.font(32));
		
		this.setOnMouseMoved(e -> {
			 this.setStyle(Config.onMouseMoveButtonStyle);
		});
		
		this.setOnMouseExited(e -> {
			this.setStyle(Config.initialButtonStyle);
		});
	}
	

}
