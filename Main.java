import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
*This program is a simple model for trick or treating
*@author Damandeep Kaur, Jake Knapke, Evan Schroeder
*@version October 31st
*/

class Main {
  public static void main(String[] args) {
    Candy candy1 = new Candy();
    Pillowcase pillowcase1 = new Pillowcase();
    Scanner s = new Scanner(System.in);
    int num;

    /**
    *Statement asking how many houses were trick or treated at
    */
    System.out.println("Happy Halloween! How many houses should we trick or treat at?");

    /**
    *Scanner let's user input the number of houses
    */
    num = s.nextInt();

    /**
    *ADDITIONAL FUNCTIONALITY 
    *If user inputs 0 houses, a different statement appears
    */
    if(num == 0)
    System.out.println("No trick or treating? Where's the fun in that?");
    else

    /**
    *For-loop that calls getCandy() on Pillowcase for how many houses were visited
    */ 
    for(int i = 0; i < num; ++i) {
      pillowcase1.getCandy();
    }

    /**
    *ADDITIONAL FUNCTIONALITY 
    *If user inputs 0 houses, a different statement appears
    */
    if (num ==0)
    System.out.println("You get no candy this Halloween.");

    /**
    *Statement saying how many candies are in Pillowcase
    */ 
    else
    System.out.println("We have "+pillowcase1.getCandyNum()+" candies in our pillowcase!");

    /**
    *Prints out how many of each candy is in our Pillowcase
    */ 
    pillowcase1.printNumCandies();
  }
}