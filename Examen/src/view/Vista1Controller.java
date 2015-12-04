package view;


import java.io.IOException;

import control.MainApp;
import javafx.fxml.FXML;
import javafx.stage.Stage;

/**
 * Controlador de la clase Vista1.
 * 
 * @author Jose Augusto Camacho Fernandez
 * @version 1.0
 */



/**
* El controlador para el diseño de la raíz. El diseño proporciona la raíz básica
 * Diseño de la aplicación que contiene una barra de menú y el espacio donde otros JavaFX
 * Elementos se pueden colocar 
 */
public class Vista1Controller  {
	MainApp mainApp;
	private Stage dialogStage;

	@FXML
    private void initialize() {
    	
    }
	
	/**
	 * Abre una nueva ventana con la informacion del perfil antes de ser enviada
	 *  
	 */
	@FXML
    private void handleSend() {
        mainApp.showProfileDetails();     
    }

	
	 /**
     * Es llamado por la aplicación principal para dar una referencia de nuevo a sí mismo.
     * 
     * @param mainApp
     */
    public void setMainApp(MainApp mainApp) {
        this.mainApp = mainApp;
    }
    
    
	/**
	 * Carga la escena (elementos del layout de SceneBuilder) en la stage generada
	 * 
	 * Sets the stage of this dialog.
     * 
	 * @param dialogStage
	 */
    public void setDialogStage(Stage dialogStage){
    	this.dialogStage = dialogStage;
    	this.dialogStage.centerOnScreen();
    	 this.dialogStage.setResizable(false);
    }
}
        