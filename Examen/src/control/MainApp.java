package control;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import view.Vista1Controller;


public class MainApp extends Application {
	private Stage primaryStage;
	private AnchorPane rootLayout;
	
	public MainApp() {}

	public static void main(String[] args) {
		launch(args);

	}
	
	/** se inicia la aplicacion*/
	
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle(" My GitHub Profile");
		//this.primaryStage.getIcons().add(new Image("file:resources/images/AddressApp.png"));

		initRootLayout();
		primaryStage.setMaximized(false);
		
	}
	
	  /**
	    **
	    * Inicializa el diseño de la raíz y trata de cargar el último abierto
	    * .
	    */
	    
	
	public void initRootLayout() throws InvocationTargetException {
		try {
			// Load root layout from fxml file.
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource("/view/Vista1.fxml"));
			rootLayout = (AnchorPane) loader.load();

			// Show the scene containing the root layout.
			Scene scene = new Scene(rootLayout);
			primaryStage.setScene(scene);
			primaryStage.setScene(scene);

			
			// Give the controller access to the main app.
			Vista1Controller controller = loader.getController();
			controller.setMainApp(this);
						
			primaryStage.show();

			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	/**
	 * Carga la pantalla numero 2 y la muestra

	 */
	
	
	
	public void showProfileDetails() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource("/view/Vista2.fxml"));
			AnchorPane page = (AnchorPane) loader.load();

			// Create the dialog Stage.
			Stage dialogStage = new Stage();
			dialogStage.setTitle("Edit Person");
			dialogStage.initModality(Modality.WINDOW_MODAL);
			//dialogStage.initOwner(primaryStage);
			dialogStage.setResizable(false);
			Scene scene = new Scene(page);
			dialogStage.setScene(scene);

			dialogStage.show();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
}