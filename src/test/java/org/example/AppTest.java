package org.example;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.util.Scanner;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    private Cat Catto = new Cat();  // Objects for testing
    private Dog Doggo = new Dog();

    @Test
    public void speakingCat()
    {
        Catto.speak();
    }

    @Test
    public void speakingDog()
    {
        Doggo.speak();
    }

    @Test
    public void setDogName()
    {
        // Test to assign dogs name, tests don't allow user input, scanner fails?
        System.out.println("Please give the dog a name");
        System.out.println ("dogs name is Froggo");
        Doggo.setName("Froggo");

        System.out.println(Doggo.getName() + " is the dogs name");
    }

    @Test
    public void setCatName()
    {
        // Test to assign dogs name, tests don't allow user input, scanner fails?
        System.out.println("Please give the cat a name");
        System.out.println ("cats name is Croggo");
        Catto.setName("Croggo");

        System.out.println(Catto.getName() + " is the dogs name");
    }
}
