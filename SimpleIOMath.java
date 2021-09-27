/*
 ╭────────────────────────────────────────────────────╮
 │                                                    ╵
 │ File: SimpleIOMath.java
 │ Project: FirstProject
 │
 │ Created by Everett Wilber on 21/09/24 at 08:56 AM.
 │                                                    ╷
 ╰────────────────────────────────────────────────────╯
 */

import java.util.Scanner;

/**
 * <H1>SimpleIOMath</H1>
 * @version 9.27.2021
 * @author 24wilber
 */
public class SimpleIOMath {
    /**
     * The user's name
     */
    private String name;
    /**
     * fail if this is true
     */
    private boolean fail = false;
    /**
     * The user's age
     */
    private int age;
    /**
     * The user's favorite number
     */
    private int favNumber;

    /**
     * <H1>ErrorForFun</H1>
     * <b>This is my extra!</b>
     *
     * <strike>This exception is called when the {@code smallestPrime()}
     * function fails to find and return a prime of a number.</strike>
     * this is thrown when there are args in the main method.
     *
     * @version 9.27.2021
     * @author 24wilber
     * @see java.lang.Exception
     * @see java.lang.Throwable
     * @see SimpleIOMath
     */
    public class ErrorForFun extends Exception {
        @Override
        public String getMessage() {
            return """


                    I eat `String[] args` for breakfast! >:O
                    NOM NOM
                    """;
        }
    }

    /**
     * Ask user questions
     */
    public void promptUser() {
        Scanner scan = new Scanner(System.in);

        // Name
        System.out.print("Question 1: What is your name? ");
        this.name = scan.nextLine();

        // Age
        System.out.print("Question 2: How old are you? ");
        this.age = scan.nextInt();

        // Favorite Number
        System.out.print("Question 3: What is your favorite number? ");
        this.favNumber = scan.nextInt();

        scan.close();
    }

    /**
     * Print info
     */
    public void printInfo() throws ErrorForFun {
        System.out.println("Your name is: "+name);
        System.out.println("Your age is: "+age);
        System.out.println("At your next birthday, you will turn "+(age+1)+".");
        System.out.println("The first prime factor of "+age+" is: "+this.smallestPrime(age));
        System.out.println("Your favorite number is: "+this.favNumber);
        System.out.println("Your favorite number squared is: "+((int) Math.pow(this.favNumber, 2)));
    }
    /**
     * Get the smallest prime of a number (num)
     * @param num this number's smallest prime will be returned
     * @return the {@code num}'s smallest prime
     * @throws ErrorForFun Throws ErrorForFun when there are args supplied to the main method.
     * @author 24wilber
     * @see ErrorForFun
     * @see java.lang.Math
     */
    private int smallestPrime(int num) throws ErrorForFun {
        if (this.fail) {
            throw new ErrorForFun();
        }
        for(int i = 2; i<=num; i++) {
            if (num % i == 0) {
                return i; // comment this out to see the ErrorForFun
            }
        }

        return num; // comment this out to see the ErrorForFun
        // if no prime is returned until now, throw ErrorForFun
    }

    /**
     * init simple io math
     *
     */
    public SimpleIOMath(String[] args) throws ErrorForFun {
        if (args.length != 0) {
            this.fail = true;
        }
        System.out.println("* Sit yourself down, take a seat *\n" +
                "* All you gotta do is repeat after me *");
        this.promptUser();
        System.out.println("""
                I'm gonna teach you how to sing it out
                Come on, come on, come on
                Let me tell you what it's all about
                Reading, writing, arithmetic
                Are the branches of the learning tree""");
        this.printInfo();
    }
    /**
     * The main method
     * @author 24wilber
     * @param args the stuff you put in the program
     */
    public static void main(String[] args) {
        try {
            SimpleIOMath obj = new SimpleIOMath(args);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("* end of program *");
    }

}
