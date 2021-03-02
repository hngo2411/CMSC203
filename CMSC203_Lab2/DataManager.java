/**
 * The DataManager class should never depend on the GUI, but rather the reverse. 
 * So the DataManager methods should not use the GUI directly.  If you want data
 * to get from the user to the manager, have the GUI get the data, and call the manager 
 * with the data that the GUI got from a text field or other data structure.
 * @author ralexander
 *
 */
package application;
//declare class
public class DataManager {
     String Dtext="";
     DataManager() {}
     
     //implement method getHello()
     public String getHello() {
          return "Hello World";
     }

     //implement method getHowdy()
     public String getHowdy() {
          return "Howdy y'all";
     }

     //implement method getChinese()
     public String getChinese() {
          return "Ni hau";
     }

     //implement method setText(String)
     public void setText(String text) {
          this.Dtext=text;
     }
}