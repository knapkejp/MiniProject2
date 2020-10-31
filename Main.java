import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Candy candy1 = new Candy();
    Pillowcase pillowcase1 = new Pillowcase();
    Scanner s = new Scanner(System.in);
    int num;

    System.out.println("Happy Halloween! How many houses should we trick or treat at?");
    num = s.nextInt();
    if(num == 0)
    System.out.println("No trick or treating? Where's the fun in that?");
    else
    for(int i = 0; i < num; ++i) {
      pillowcase1.getCandy();
    }
    if (num ==0)
    System.out.println("You get no candy this Halloween.");
    else
    System.out.println("We have "+pillowcase1.getCandyNum()+" candies in our pillowcase!");

   // pillowcase1.printgetCandy();
    
   // candy1.print();

   //  pillowcase1.getCandy();

    pillowcase1.printNumCandies();
  }
}