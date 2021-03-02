package application;
//import all required class
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
/**
 * This panel is the basic panel, inside which other panels are placed.  
 * Before beginning to implement, design the structure of your GUI in order to 
 * understand what panels go inside which ones, and what buttons or other components
 * go in which panels.  
 * @author ralexander
 *
 */
//make the main panel's layout be a VBox
public class FXMainPane extends VBox {
     public void start(Stage stage) {     
          HBox hbox1=new HBox();
          HBox hbox2=new HBox();    
          //create object DataManager
          DataManager Dobject=new DataManager();
          //textField create
          TextField textFields = new TextField();     
          //label create
          Label labelVal = new Label("FeedBack:");
          // hello button
          Button b1 = new Button("Hello");
          //implement button b1
          b1.setOnAction(new EventHandler<ActionEvent>()
          {
              @Override public void handle(ActionEvent e)
              {        
                    textFields.setText(Dobject.getHello());    
              }
          });
          // howdy button
          Button b2 = new Button("Howdy");
          //implement button b2
          b2.setOnAction(new EventHandler<ActionEvent>()
          {
              @Override public void handle(ActionEvent e)
              {        
              textFields.setText(Dobject.getHowdy());
              }
          });
          // chinese button
          Button b3 = new Button("Chinese");
          //implement button b3
          b3.setOnAction(new EventHandler<ActionEvent>()
          {
              @Override public void handle(ActionEvent e)
              {
              textFields.setText(Dobject.getChinese());
              }
          });
          // clear button    
          Button b4 = new Button("Clear");
          //implement button b4
          b4.setOnAction(new EventHandler<ActionEvent>()
          {
              @Override public void handle(ActionEvent e)
              {
              textFields.setText(" ");
              }
          });
          // exit button     
          Button b5 = new Button("Exit");
          //implement button b5
          b5.setOnAction(new EventHandler<ActionEvent>()
          {
              @Override public void handle(ActionEvent e)
              {
              System.exit(0);
              }
          });
          
          //Instantiating HBox class
          VBox vBox =new VBox(50);
          vBox.setAlignment(Pos.CENTER);
          Insets inset=new Insets(20, 20, 20, 20);
          
          //set spacing
          vBox.setSpacing(10);
          //sets margin
          VBox.setMargin(textFields, new Insets(20, 20, 20, 20));
          //set b1
          VBox.setMargin(b1, new Insets(20, 20, 20, 20));
          //set b2
          VBox.setMargin(b2, new Insets(20, 20, 20, 20));
          //set b3
          VBox.setMargin(b3, new Insets(20, 20, 20, 20));
          //set b4
          VBox.setMargin(b4, new Insets(20, 20, 20, 20));
          //set b5
          VBox.setMargin(b5, new Insets(20, 20, 20, 20));
          
          hbox1.setAlignment(Pos.CENTER);
          hbox1.getChildren().addAll(labelVal,textFields,hbox2);

          ObservableList<Node> listVal = vBox.getChildren();
          listVal.addAll(textFields, b1,b2,b3,b4,b5,hbox1);     

          //scene object
          Scene scenes = new Scene(vBox);
          
          //set scenes
          stage.setScene(scenes);

          //stage contents
          stage.show();
     }
}  