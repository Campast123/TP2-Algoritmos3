package fiuba.algo3.vistas;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class CajaAlerta {

	public static void mostrar(String titulo, String mensaje){
		Stage window = new Stage();

		window.initModality(Modality.APPLICATION_MODAL);
		window.setTitle(titulo);
		window.setMinWidth(250);

		Label label = new Label();
		label.setText(mensaje);
		Button botonDeCerrar = new Button("Cerrar la ventana");
		botonDeCerrar.setOnAction(e -> window.close());

		VBox layout = new VBox(10);
		layout.getChildren().addAll(label,botonDeCerrar);
		layout.setAlignment(Pos.CENTER);

		Scene scene = new Scene(layout);
		window.setScene(scene);
		window.show();
	}
}
