package application;
//import all required class
import java.io.IOException;
import javafx.application.Application;
import javafx.stage.Stage;

//create class extends application
public class FXDriver extends Application {
        /**
         * The main method for the GUI example program JavaFX version
         * @param args not used
         * @throws IOException */
        public static void main(String[] args)
        {
                launch(args);  
        }             
        @Override
        public void start(Stage stage) throws IOException
        {
               //create instance for the FXMainPane class
               FXMainPane fp=new FXMainPane();
               //start the application
               fp.start(stage);
                //student Task #1:
                // instantiate the FXMainPane, name it root
                // set the scene to hold root
                //set stage title
                stage.setTitle("Hello World GUI");
                //display the stage
                stage.show();
     }
}