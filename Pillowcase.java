import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

class Pillowcase{
  private int candyNum;
  Random r = new Random();
  Candy candy1 = new Candy();
  ArrayList<String> candyStore = new ArrayList<String>();

/**
*Constructor - Initialize ArrayList & Set number variable to 0
*/
Pillowcase() {
  candyNum = 0;
}

/**
*Accessor Method to get number of candies in Pillowcase
*/
int getCandyNum() {
    return candyNum;
  }

/**
*This method creates one new candy and adds it to the Pillowcase ArrayList
*/
   void getCandy(){
    int randomNum = r.nextInt(100)+1;
    candyNum = getCandyNum()+1;

    if (randomNum>=1 && randomNum<=10){
      candy1.setCandyName("M&M's");
      candyStore.add(candy1.getCandyName());
    }
    else if (randomNum>=11 && randomNum<=30){
      candy1.setCandyName("Pink Starburst");
      candyStore.add(candy1.getCandyName());
    }
    else if (randomNum>=31 && randomNum<=47){
      candy1.setCandyName("Hershey's Bar");
      candyStore.add(candy1.getCandyName());
    }
    else if (randomNum>=48 && randomNum<=55){
      candy1.setCandyName("Milky Way");
      candyStore.add(candy1.getCandyName());
    }
    else if (randomNum>=56 && randomNum<=68){
      candy1.setCandyName("Twix");
      candyStore.add(candy1.getCandyName());
    }
    else if (randomNum>=69 && randomNum<=93){
      candy1.setCandyName("Reese's");
      candyStore.add(candy1.getCandyName());
    }
    else{
      candy1.setCandyName("Kit Kat");
      candyStore.add(candy1.getCandyName());
    }
  }

/**  
*This method shows how much of each candy we received
*/ 
    void printNumCandies(){

      //Creates Array to act as a counter
      int numCandies[] = new int[7];
      numCandies[0] = 0;
      numCandies[1] = 0;
      numCandies[2] = 0;
      numCandies[3] = 0;
      numCandies[4] = 0;
      numCandies[5] = 0;
      numCandies[6] = 0;

/**
 *Loop goes through ArrayList to check name of candy at each index.
 *If statement adds to each index the number of each candy
 */
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
      
    /**
    *These statements print out how many of each candy we received
    *If there are 0 of a candy, it will not print
    */
      if(numCandies[0] != 0)
        System.out.println("We got "+numCandies[0]+" M&M's");
      if(numCandies[1] != 0)
        System.out.println("We got "+numCandies[1]+" Pink Starburst");
      if(numCandies[2] != 0)
        System.out.println("We got "+numCandies[2]+" Hershey's Bar");
      if(numCandies[3] != 0)
        System.out.println("We got "+numCandies[3]+" Milky Way");
      if(numCandies[4] != 0)
        System.out.println("We got "+numCandies[4]+" Twix");
      if(numCandies[5] != 0)
        System.out.println("We got "+numCandies[5]+" Reese's");
      if(numCandies[6] != 0)
        System.out.println("We got "+numCandies[6]+" Kit Kat");
    }
}
    

      