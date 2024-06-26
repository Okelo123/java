import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class ImageChooser extends Application {
    private VBox root;

    @Override
    public void start(Stage primaryStage) {
        // Initialize the root VBox
        root = new VBox(10);
        root.setPadding(new Insets(10));

        // Create a label to display the image
        Label imageLabel = new Label();
        Image image = new Image(getClass().getResource("/pig.jpeg").toExternalForm());
        ImageView imageView = new ImageView(image);
        imageView.setFitWidth(100);
        imageView.setFitHeight(100);
        imageLabel.setGraphic(imageView);

        // Create a toggle group for the radio buttons
        final ToggleGroup group = new ToggleGroup();

        // Create 4 radio buttons with images
        RadioButton rb1 = new RadioButton("1. Pig");
        rb1.setToggleGroup(group);
        Image option1Image = new Image(getClass().getResource("/pig.jpeg").toExternalForm());
        ImageView option1ImageView = new ImageView(option1Image);
        option1ImageView.setFitWidth(50);
        option1ImageView.setFitHeight(50);
        rb1.setGraphic(option1ImageView);

        RadioButton rb2 = new RadioButton("2. Lion");
        rb2.setToggleGroup(group);
        Image option2Image = new Image(getClass().getResource("/LION.jpeg").toExternalForm());
        ImageView option2ImageView = new ImageView(option2Image);
        option2ImageView.setFitWidth(50);
        option2ImageView.setFitHeight(50);
        rb2.setGraphic(option2ImageView);

        RadioButton rb3 = new RadioButton("3. Dog");
        rb3.setToggleGroup(group);
        Image option3Image = new Image(getClass().getResource("/dog.jpeg").toExternalForm());
        ImageView option3ImageView = new ImageView(option3Image);
        option3ImageView.setFitWidth(50);
        option3ImageView.setFitHeight(50);
        rb3.setGraphic(option3ImageView);

        RadioButton rb4 = new RadioButton("4. Elephant");
        rb4.setToggleGroup(group);
        Image option4Image = new Image(getClass().getResource("/elephant.jpeg").toExternalForm());
        ImageView option4ImageView = new ImageView(option4Image);
        option4ImageView.setFitWidth(50);
        option4ImageView.setFitHeight(50);
        rb4.setGraphic(option4ImageView);

        RadioButton rb5 = new RadioButton("5. Rabbit");
        rb5.setToggleGroup(group);
        Image option5Image = new Image(getClass().getResource("/rabbit.jpeg").toExternalForm());
        ImageView option5ImageView = new ImageView(option5Image);
        option5ImageView.setFitWidth(50);
        option5ImageView.setFitHeight(50);
        rb5.setGraphic(option5ImageView);

        // Create a button to submit the answer
        Button submitButton = new Button("Submit");
        submitButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                RadioButton selectedRadioButton = (RadioButton) group.getSelectedToggle();
                if (selectedRadioButton != null) {
                    String correctAnswer = "1. Pig"; // Replace with the correct answer
                    if (selectedRadioButton.getText().equals(correctAnswer)) {
                        System.out.println("Correct!");
                    } else {
                        System.out.println("Incorrect. Try again!");
                    }
                }
            }
        });

        // Add components to the root VBox
        root.getChildren().addAll(imageLabel, rb1, rb2, rb3, rb4, rb5, submitButton);

        // Create a scene and set the stage
        Scene scene = new Scene(root, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Image Chooser");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
