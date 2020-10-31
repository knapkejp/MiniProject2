import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

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
    System.out.println("Trick or Treat!");
    int randomNum = r.nextInt(100)+1;
    System.out.println(randomNum);
    System.out.println(getCandyNum());

    if (randomNum>=1 && randomNum<=10){
      System.out.println("M&M's");
      candy1.setCandyName("M&M's");
      candyStore.add(candy1.getCandyName());
    }
    else if (randomNum>=11 && randomNum<=30){
      System.out.println("Pink Starburst");
      candy1.setCandyName("Pink Starburst");
      candyStore.add(candy1.getCandyName());
    }
    else if (randomNum>=31 && randomNum<=47){
      System.out.println("Hershey's Bar");
      candy1.setCandyName("Hershey's Bar");
      candyStore.add(candy1.getCandyName());
    }
    else if (randomNum>=48 && randomNum<=55){
      System.out.println("Milky Way");
      candy1.setCandyName("Milky Way");
      candyStore.add(candy1.getCandyName());
    }
    else if (randomNum>=56 && randomNum<=68){
      System.out.println("Twix");
      candy1.setCandyName("Twix");
      candyStore.add(candy1.getCandyName());
    }
    else if (randomNum>=69 && randomNum<=93){
      System.out.println("Reese's");
      candy1.setCandyName("Reese's");
      candyStore.add(candy1.getCandyName());
    }
    else{
      System.out.println("Kit Kat");
      candy1.setCandyName("Kit Kat");
      candyStore.add(candy1.getCandyName());
    }

    /*To print out all values in ArrayList
    for (int i=0; i<candyStore.size(); i++){
      System.out.println(candyStore.get(i));
    }
    */ 
    System.out.println(candyStore.get(0));
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
}