package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {


    public static void main(String[] args)
    {
      Scanner in = new Scanner(System.in);
      Dog Doggie = new Dog();
      Cat Cattie = new Cat();

      System.out.println("Please enter the dogs name");
      String dogname = in.nextLine();
      Doggie.setName(dogname);
      System.out.println("Please enter the cats name");
      String catname = in.nextLine();
      Cattie.setName(catname);

      System.out.println(Doggie.getName() + " goes ");
      Doggie.speak();
      System.out.println(Cattie.getName() + " goes ");
      Cattie.speak();
    }
}
