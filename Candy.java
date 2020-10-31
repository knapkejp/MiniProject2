import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
*@author Damandeep Kaur, Jake Knapke, Evan Schroeder
*@version October 31st
*/

class Candy {
public String candyName;

/**
*Constructor that sets name to blank. No Paramaters
*/
  Candy() {
    candyName = "";
  }

/**
*Constructor has one parameter
*@param sets the name of the variable
*/
  Candy(String aCandyName) {
    candyName = aCandyName;
  }

/**
*Accessor method to get candyName
*@return returns the name of the Candy
*/
  String getCandyName() {
    return candyName;
  }

/**
*Mutator method to set candyName to theCandyName
*/
  void setCandyName(String theCandyName) {
    candyName = theCandyName;
  }
  
/**
*This method prints the name of the Candy
*/
  void print() {
    System.out.println(candyName);
  }
}