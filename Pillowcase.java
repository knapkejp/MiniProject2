import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.Collections;

class Pillowcase{
  private int candyNum;
  Random r = new Random();
  Candy candy1 = new Candy();
  ArrayList<String> candyStore = new ArrayList<String>();


//Constructor - Initialize ArrayList & Set number variable to 0
Pillowcase() {
  candyNum = 0;
}

//Accessor Method
int getCandyNum() {
    return candyNum;
  }

   void getCandy(){
    int randomNum = r.nextInt(100)+1;
    //System.out.println(randomNum);
    candyNum = getCandyNum()+1;
   // System.out.println(getCandyNum());

    if (randomNum>=1 && randomNum<=10){
     // System.out.println("M&M's");
      candy1.setCandyName("M&M's");
      candyStore.add(candy1.getCandyName());
    }
    else if (randomNum>=11 && randomNum<=30){
     // System.out.println("Pink Starburst");
      candy1.setCandyName("Pink Starburst");
      candyStore.add(candy1.getCandyName());
    }
    else if (randomNum>=31 && randomNum<=47){
     // System.out.println("Hershey's Bar");
      candy1.setCandyName("Hershey's Bar");
      candyStore.add(candy1.getCandyName());
    }
    else if (randomNum>=48 && randomNum<=55){
     // System.out.println("Milky Way");
      candy1.setCandyName("Milky Way");
      candyStore.add(candy1.getCandyName());
    }
    else if (randomNum>=56 && randomNum<=68){
     // System.out.println("Twix");
      candy1.setCandyName("Twix");
      candyStore.add(candy1.getCandyName());
    }
    else if (randomNum>=69 && randomNum<=93){
    //  System.out.println("Reese's");
      candy1.setCandyName("Reese's");
      candyStore.add(candy1.getCandyName());
    }
    else{
    //  System.out.println("Kit Kat");
      candy1.setCandyName("Kit Kat");
      candyStore.add(candy1.getCandyName());
    }
    
    //System.out.println(candyStore.get(0));
  }
    /* To print out ArrayList of all candies
    void printgetCandy(){
      System.out.println("Trick or Treat!");
      System.out.println(getCandyNum());
    for (int i=0; i<candyStore.size(); i++){
      System.out.println(candyStore.get(i));
    }
    }
    */

    void printNumCandies(){
      int numCandies[] = new int[7];
      numCandies[0] = 0;
      numCandies[1] = 0;
      numCandies[2] = 0;
      numCandies[3] = 0;
      numCandies[4] = 0;
      numCandies[5] = 0;
      numCandies[6] = 0;

    for (int counter = 0; counter <candyStore.size(); counter++) {
      if (candyStore.get(counter).equals("M&M's")) {
          numCandies[0]++;
        }
      else if (candyStore.get(counter).equals("Pink Starburst")) {
          numCandies[1]++;
          }
      else if (candyStore.get(counter).equals("Hershey's Bar")) {
          numCandies[2]++;
          }
      else if (candyStore.get(counter).equals("Milky Way")) {
          numCandies[3]++;
          }
      else if (candyStore.get(counter).equals("Twix")) {
          numCandies[4]++;
          }
      else if (candyStore.get(counter).equals("Reese's")) {
          numCandies[5]++;
          }
      else{
          numCandies[6]++;
          }
      }

      /*print out the array counter
      for(int i=0; i < numCandies.length; i++){
        System.out.println(numCandies[i]); 
      }
      */

      if(numCandies[0] == 0)
        System.out.println(" ");
      else
        System.out.println("We got "+numCandies[0]+" M&M's");

      if(numCandies[1] == 0)
        System.out.println(" ");
      else
        System.out.println("We got "+numCandies[1]+" Pink Starburst");

      if(numCandies[2] == 0)
        System.out.println(" ");
      else
        System.out.println("We got "+numCandies[2]+" Hershey's Bar");

      if(numCandies[3] == 0)
        System.out.println(" ");
      else
        System.out.println("We got "+numCandies[3]+" Milky Way");

      if(numCandies[4] == 0)
        System.out.println(" ");
      else
        System.out.println("We got "+numCandies[4]+" Twix");

      if(numCandies[5] == 0)
        System.out.println(" ");
      else
        System.out.println("We got "+numCandies[5]+" Reese's");

      if(numCandies[6] == 0)
        System.out.println(" ");
      else
        System.out.println("We got "+numCandies[6]+" Kit Kat");

      /*
      
      boolean mm = candyStore.contains("M&M's");
      boolean ps = candyStore.contains("Pink Starburst");
      boolean hb = candyStore.contains("Hershey's Bar");
      boolean mw = candyStore.contains("Milky Way");
      boolean t = candyStore.contains("Twix");
      boolean r = candyStore.contains("Reese's");
      boolean kk = candyStore.contains("Kit Kat");

      if(mm) {
        System.out.println("We got "+Collections.frequency(candyStore,"M&M's")+" M&M's");
      }
      else{
        System.out.println(" ");
      }
      */

      /*
      
      if(mw)
        System.out.println("We got "+Collections.frequency(candyStore,"Milky Way")+" Milky Way");
      if(t)
        System.out.println("We got "+Collections.frequency(candyStore,"Twix")+" Twix");
      if(r)
        System.out.println("We got "+Collections.frequency(candyStore,"Reese's")+" Reese's");
      if(kk)
        System.out.println("We got "+Collections.frequency(candyStore,"Kit Kat")+" Kit Kat");
      */
    

      /*
        if (candyStore.indexOf("M&M's")) {
          numCandies[0]++;
          }
        else if (candyStore.indexOf("Pink Starburst")) {
          numCandies[1]++;
          }
        else if (candyStore.indexOf("Hershey's Bar")) {
          numCandies[2]++;
           }
        else if (candyStore.indexOf("Milky Way")) {
          numCandies[3]++;
          }
        else if (candyStore.indexOf("Twix")) {
          numCandies[4]++;
          }
        else if (candyStore.indexOf("Reese's")) {
          numCandies[5]++;
          }
        else{
          numCandies[6]++;
          }
        */

        // ArrayList Index 0
        /*
        if (candyStore.get(0).equals("M&M's")) {
          numCandies[1]++;
          }
        else if (candyStore.get(0).equals("Pink Starburst")) {
          numCandies[1]++;
          }
        else if (candyStore.get(0).equals("Hershey's Bar")) {
          numCandies[2]++;
          }
        else if (candyStore.get(0).equals("Milky Way")) {
          numCandies[3]++;
          }
        else if (candyStore.get(0).equals("Twix")) {
          numCandies[4]++;
          }
        else if (candyStore.get(0).equals("Reese's")) {
          numCandies[5]++;
          }
        else{
          numCandies[6]++;
          }
        */
      }
    }

    /*
    void printNumCandies(){
      String numCandies[] = new String[7];
      for (int i=0; i < numCandies.length; i++) {
        if (candyStore.get(0).equals("M&M's")) {
          numCandies[0] = 1;
        }

        else if (CandyStore.get(0).equals("Pink Starburst")){
          numCandies[1] = 1;
        }

        else if (CandyStore.get(0).equals("Hershey's Bar")){
          numCandies[2] = 1;
        }

        else if (CandyStore.get(0).equals("Milky Way")){
          numCandies[3] = 1;
        }

        else if (CandyStore.get(0).equals("Twix")){
          numCandies[4] = 1;
        }

        else if (CandyStore.get(0).equals("Reese's")){
          numCandies[5] = 1;
        }

        else{
          numCandies[6] = 1;
        }
      }
    }   
    */