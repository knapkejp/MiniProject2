import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

class Pillowcase{
  private int candyNum;
  Random r = new Random();
  private ArrayList<String> candyStore;


//Constructor - Initialize ArrayList & Set number variable to 0
Pillowcase() {
  ArrayList<String> candyStore = new ArrayList<String>();
  candyNum = 0;
}

//Accessor Method
int getCandyNum() {
    return candyNum;
  }

   void getCandy(){
    System.out.println("Trick or Treat!");
    int randomNum = r.nextInt(100)+1;
    System.out.println(randomNum);
    System.out.println(getCandyNum());

    if (randomNum>=1 && randomNum<=10){
      System.out.println("M&M's");
    }
    else if (randomNum>=11 && randomNum<=30){
      System.out.println("Pink Starburst");
    }
    else if (randomNum>=31 && randomNum<=47){
      System.out.println("Hershey's Bar");
    }
    else if (randomNum>=48 && randomNum<=55){
      System.out.println("Milky Way");
    }
    else if (randomNum>=56 && randomNum<=68){
      System.out.println("Twix");
    }
    else if (randomNum>=69 && randomNum<=93){
      System.out.println("Reese's");
    }
    else{
      System.out.println("Kit Kat");
    }

    //To print out all values in ArrayList
    /* 
    for (int i=0; i<candyStore.size(); i++){
      System.out.println(candyStore.get(i));
    }
    */
}   
}