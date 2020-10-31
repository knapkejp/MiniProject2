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
    for(int i = 0; i < num; ++i) {
      pillowcase1.getCandy();
    }
    
    candy1.print();

    pillowcase1.getCandy();


    //pillowcase1.printNumCandies();
  }
}