import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class GoogleHomepage extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        BorderPane root = new BorderPane();
        
        // Top bar
        HBox topBar = new HBox();
        topBar.getStyleClass().add("top-bar");
        TextField searchField = new TextField();
        searchField.setPromptText("Search Google");
        Button searchButton = new Button("Google Search");
        topBar.getChildren().addAll(searchField, searchButton);
        
        // Bottom bar
        HBox bottomBar = new HBox();
        bottomBar.getStyleClass().add("bottom-bar");
        Button gmailButton = new Button("Gmail");
        Button imagesButton = new Button("Images");
        bottomBar.getChildren().addAll(gmailButton, imagesButton);
        
        // Combine top and bottom bars
        VBox content = new VBox();
        content.getStyleClass().add("content");
        content.getChildren().addAll(topBar, bottomBar);
        
        root.setCenter(content);
        
        Scene scene = new Scene(root, 800, 600);
        scene.getStylesheets().add(getClass().getResource("styles.css").toExternalForm());
        
        primaryStage.setTitle("Google");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
