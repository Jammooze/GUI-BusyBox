/**
*  @author [Group 6]
*          Nguyen James
*          Jonathan Cortes 
*          Yongkang Liu
*          
*          CS 2012-03
*          GUI - Additional Graphic Elements
*          GuiMain.java
*/

package guiPackage;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class GuiBusyBox extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        try {

            Text messageText = new Text("\n- GUI BUSY BOX -"); // Window Name
            messageText.setFont(new Font(24)); // Increase font size
            Text groupMembers = new Text ("James N. - Johnathan C - Yongkang L.");
            groupMembers.setFont(new Font(12));
            
            StackPane root = new StackPane(); // Initialize new StackPane
     
// New Background for GUI
            Image backgroundImage = new Image("https://pbs.twimg.com/media/FpXN6JaacAApKn0?format=jpg&name=4096x4096");
            // Create an ImageView
            ImageView backgroundImageView = new ImageView(backgroundImage);
            // Set StackPane Background to ImageView
            root.setBackground(new Background(new BackgroundImage(backgroundImage, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, false, false, true, false))));
            root.getChildren().add(backgroundImageView);

// Initialize 1st VBox for Text
            VBox vbox = new VBox();
            vbox.getChildren().addAll(messageText, groupMembers);
            vbox.setSpacing(10);
            vbox.setAlignment(Pos.TOP_CENTER);
            
            // Initialize new GridPane for JavaFX Controls
            GridPane grid = new GridPane();
            grid.setAlignment(Pos.CENTER);
            grid.setHgap(10);
            grid.setVgap(10);
            grid.setPadding(new Insets(25, 25, 25, 25));

            // Create Buttons
            Button button = new Button("Button"); // Button
            ToggleButton toggleButton = new ToggleButton("Toggle Button"); // Toggle Button
            RadioButton radioButton = new RadioButton("Radio Button"); // Radio Button
            
            // Button w/ Graphics
            // Load an image to use as the button's graphic
            Image image = new Image("https://static-cdn.jtvnw.net/emoticons/v2/301171649/static/light/3.0");
            
            // Create an ImageView from the image
            ImageView imageView = new ImageView(image);
            
            // Create a new button with the image view as its graphic
            Button buttonGraphic = new Button();
            buttonGraphic.setGraphic(imageView);
            
            // Create Boxes
            CheckBox checkBox = new CheckBox("Check Box"); // Check Box
            ChoiceBox<String> choiceBox = new ChoiceBox<>(); // Choice Box
            // Adding Options to Choice Box
            choiceBox.getItems().addAll("ChoiceBox 1", "ChoiceBox 2", "ChoiceBox 3");
            
            // Create Other Stuff
            Label label = new Label("Label"); // Label
            TextField textField = new TextField(); // Text Field
            TextArea textArea = new TextArea(); // Text Area
            Slider slider = new Slider(); // Slider
            ProgressBar progressBar = new ProgressBar(); // Progress Bar
            ProgressIndicator progressIndicator = new ProgressIndicator(); // Progress Indicator
            ComboBox<String> comboBox = new ComboBox<>(); // Combo Box
            // Adding Options to Combo Box
            comboBox.getItems().addAll("ComboBox 1", "ComboBox 2", "ComboBox 3");
            ListView<String> listView = new ListView<>(); // List View
            // Adding to List View
            listView.getItems().addAll("ListView 1", "ListView 2", "ListView 3");
            
            /*
            [1] Buttons
            [1] Buttons with graphics
            [1] Buttons with images
            [1] Labels
            [] Labels with graphic
            [] Labels with an image
            [] Use a file picker to select an image for the Label
            [1] TextField
            [] PasswordField
            [1] TextArea as both entry and output.
            [] Scroll Bars on the TextArea
            [1] two or more separate sets of RadioButtons
            [1] two or more separate sets of CheckBoxes
            [1] ComboBox
            [1] ListView
            [1] Sliders
            [0] MenuBar  (not in the text book, here is an example: https://www.geeksforgeeks.org/javafx-menubar-and-menu/ (Links to an external site.))
            [0] Tabs
            [0] Spinners
            [1] Progress bar
            */

            // ADding JFX Controls to Grid
            grid.add(button, 0, 0);
            grid.add(toggleButton, 1, 0);
            grid.add(radioButton, 2, 0);
            grid.add(checkBox, 0, 1);
            grid.add(choiceBox, 1, 1);
            grid.add(label, 2, 1);
            grid.add(textField, 0, 4);
            grid.add(textArea, 1, 2, 2, 1);
            grid.add(slider, 0, 3);
            grid.add(buttonGraphic, 0, 2);
            grid.add(progressBar, 1, 3);
            grid.add(progressIndicator, 2, 3);
            grid.add(comboBox, 0, 5);
            grid.add(listView, 1, 4);
            
            vbox.getChildren().add(grid);

            // Adding VBox to root StackPane
            root.getChildren().add(vbox);

            Scene scene = new Scene(root, 800, 800);
            primaryStage.setTitle("GUI Busy Box");
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}