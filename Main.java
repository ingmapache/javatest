import java.util.*;

class Animal
{
    public void animalSound()
    {
        System.out.println("The animal makes a sound.");
    }
}

class Pig extends Animal
{
    public void animalSound()
    {
        System.out.println("The pig says: wee wee!");
    }
}

class Dog extends Animal
{
    public void animalSound()
    {
        System.out.println("The dog says: woof woof!");
    }
}

public class Main {
    static void printThisLn(String stringToPrint)
    {
        System.out.println(stringToPrint);
    }
    static int plusMethod(int x, int y) {
        return x + y;
    }
    static double plusMethod(double x, double y) {
        return x + y;
    }
    static int recursion(int k)
    {
        if(k > 0)
        {
            return k + recursion(k - 1);
        } else
        {
            return 0;
        }
    }
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.print("Hello there, im plain print.");
        System.out.print(" Im printing in the same line as last print.");
        System.out.println("Now we will print some numbers");
        System.out.println("This is the result of 3 + 3: " + (3+3));
        System.out.println("This is the result of 5 * 2: "+ (2 * 5));

        //This is a comment, it's the same as C#
        /*
        This is also a comment, it's the same as a multi comment in angular.
         */

        //To create a variable, we can declare it like we do in c#: type variableName = value;
        String lmao = "This is a string variable.";
        int intVariable = 45;
        System.out.println(lmao);
        System.out.println("This is a concatenated text with an int variable: " + intVariable);

        //We can also declare a variable without its value and assign it later.
        int myAge;
        myAge = 30;
        System.out.println("My current age is: " + myAge + ".");

        /*But we need to remember that if we assign a value to a variable that already has one, we will overwrite it.
        If we want to make a read only variable, so that its value cant be changed, we need to use final keyword*/

        final int myNextAge = 31;

        //Other types can be such as:
        String uwu;
        float myFloatNumber = 223.54f;
        char myFirstLetter = 'R';
        boolean areWeReadyForThis = true;
        if(areWeReadyForThis)
        {
            uwu = " Oingo boingo";
            System.out.print(myFloatNumber+ myFirstLetter + uwu);
        }

        //We can declare multiple variables of the same type with a comma

        int x = 6, y = 7, z = 8;
        System.out.println(x+y+z);

        //We can also assign the same value to multiple variables.
        int a, b, c;
        a = b = c = 10;

        System.out.println(a+b+c);

        //Let's do an exercise
        String charName = "Strohl";
        int charLevel = 15;
        int charAge = 18;
        float charGold = 15.66f;
        char charRank = 'S';

        System.out.println("The character name is: " + charName);
        System.out.println("His level is:  " + charLevel);
        System.out.println("His age is: " + charAge);
        System.out.println("His gold is: " + charGold);
        System.out.println("His ranks is: " + charRank);

        //Heres a real life example
        int items = 487;
        float costPerItem = 19.99f;
        float total = items * costPerItem;
        char currency = '$';

        System.out.println("The total cost for " + items + " items is: " + total + currency + ".");

        //Widening casting is when we convert a smaller size type to a larger one

        int myInt = 9;
        double myDouble = myInt;

        System.out.println(myDouble);

        //Narrowing casting is when we convert a bigger size type to a larger one, we have to specify type with parentheses.
        double yourDouble = 19.69d;
        int yourInt = (int) yourDouble;

        System.out.println(yourInt);

        //This is a real life example for that

        int maxScore = 150;
        int userScore = 120;

        float percentage = (float) userScore / maxScore * 100.0f;
        System.out.println("User's percentage is " + percentage);

        //String methods
        System.out.println("Characters name length is: " + charName.length() + ".");
        System.out.println("Uppercase character name: " + charName.toUpperCase() + ".");
        System.out.println("Lowercase character name: " + charName.toLowerCase() + ".");

        String txt = "Please locate where 'locate' occurs!";
        System.out.println(txt.indexOf("locate"));

        //If statement
        if(maxScore == 150)
        {
            System.out.println("maxScore has a value of 150.");
        }

        if(userScore == 150)
        {
            System.out.println("userScore has a value of 150.");
        } else {
            System.out.println("userScore has a value of " + userScore + '.');
        }

        //Shorthand if else
        int time = 20;
        String result = (time < 18 ) ? "Good day." : "Good evening.";

        System.out.println(result);

        //For loop
        for(int i = 0; i < 10; i++)
        {
            System.out.println(i);
        }

        //For each loop
        String[] videogames = {"Nintendo", "PlayStation", "Xbox", "PC"};

        for(String company : videogames)
        {
            System.out.println(company);
        }

        System.out.println(videogames[2]);

        //to change a value of an item in an array, refer to index value
        videogames[3] = "Lmao";
        for(String company : videogames)
        {
            System.out.println(company);
        }

        //There's also multidimensional arrays

        int [][] myNumbers = { {1,2,3}, {4,5,6} };
        System.out.println(myNumbers[1][2]);

        for (int i = 0; i < myNumbers.length; ++i) {
            for (int j = 0; j < myNumbers[i].length; ++j) {
                System.out.println(myNumbers[i][j]);
            }
        }

        printThisLn(charName);

        //Method overloading. Multiple methods can have the same name as long as the number and/or type of parameters are different.
        int myNum1 = plusMethod(5,4);
        double myNum2 = plusMethod(5,4);

        System.out.println("Variable myNum1: " + myNum1 + '.');
        System.out.println("Variable myNum2: " + myNum2 + '.');

        //This is recursion, a function that calls itself and must have a halting method
        int recursiveInt = recursion(5);

        System.out.println(recursiveInt);

        /*
        final	        Attributes and methods cannot be overridden/modified
        static	        Attributes and methods belongs to the class, rather than an object
        abstract	    Can only be used in an abstract class, and can only be used on methods. The method does not have a body, for example abstract void run();. The body is provided by the subclass (inherited from). You will learn more about inheritance and abstraction in the Inheritance and Abstraction chapters
        transient	    Attributes and methods are skipped when serializing the object containing them
        synchronized	Methods can only be accessed by one thread at a time
        volatile	    The value of an attribute is not cached thread-locally, and is always read from the "main memory"
        */

        Scanner myObj = new Scanner(System.in);
        printThisLn("Enter username:");

        String username = myObj.nextLine();
        printThisLn("Username is: " + username + ".");

        //Access modifiers
        /*
        public	The class is accessible by any other class
        default	The class is only accessible by classes in the same package. This is used when you don't specify a modifier. You will learn more about packages in the Packages chapter
        For attributes, methods and constructors, you can use the one of the following:

        Modifier	Description
        public	    The code is accessible for all classes
        private 	The code is only accessible within the declared class
        default	    The code is only accessible in the same package. This is used when you don't specify a modifier. You will learn more about packages in the Packages chapter
        protected	The code is accessible in the same package and subclasses. You will learn more about subclasses and superclasses in the Inheritance chapter
         */

        Animal pedro = new Animal();
        Animal myPig = new Pig();
        Animal myDog = new Dog();

        pedro.animalSound();
        myPig.animalSound();
        myDog.animalSound();
    }
}