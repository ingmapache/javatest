import java.sql.Array;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.time.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

class OuterClass
{
    int x = 123;

    class InnerClass
    {
        int y = 5;
    }

    private class PrivateInnerClass
    {
        int y = 6;
    }

    static class StaticInnerClass
    {
        int y = 7;
    }

    class InnerMethodClass
    {
        public int myInnerMethod()
        {
            return x;
        }
    }
}

interface IAnimal
{
    public void animalSound();
    public void sleep();
}

class Bear implements IAnimal
{
    public void animalSound()
    {
        System.out.println("ROAAAAAR");
    }
    public void sleep()
    {
        System.out.println("ZzZzZzZzZz");
    }
}

enum Level
{
    LOW,
    MEDIUM,
    HIGH
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
        /*
        Scanner myObj = new Scanner(System.in);
        printThisLn("Enter username:");

        String username = myObj.nextLine();
        printThisLn("Username is: " + username + ".");
        */
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

        /*
            In Java we can nest a class inside a class with the purpose of grouping classes that belong together so that our code is more readable and maintainable.
         */

        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        System.out.println(outerClass.x + innerClass.y);

        //An inner class can be private or protected. If we dont want outside objects to access the inner class, it can be declared as private.

        //OuterClass.PrivateInnerClass privateInnerClass = outerClass.new PrivateInnerClass();

        //An inner class can also be static, which means that you can access it without creating an outer object.

        OuterClass.StaticInnerClass staticInnerClass = new OuterClass.StaticInnerClass();
        System.out.println(staticInnerClass.y);

        //Inner classes can access attributes and methods of outer class.
        OuterClass.InnerMethodClass innerMethodClass = outerClass.new InnerMethodClass();
        System.out.println(innerMethodClass.myInnerMethod());

        //An interface is a fully abstract class that is used to group related methods with empty bodies, it must be implemented onto a class with the implements keyword.

       Bear Pooh = new Bear();
       Pooh.animalSound();
       Pooh.sleep();

       //Interfaces cannot be used to create new objects, do not have a body, when implemented we must override all methods. One class can implement multiple interfaces.

        // An enum is a special class that  represents a group of constants.

        Level myVar = Level.MEDIUM;

        //They are often used in switch cases.

        switch (myVar)
        {
            case LOW:
                System.out.println("Low level");
                break;
            case MEDIUM:
                printThisLn("Medium level");
                break;
            case HIGH:
                printThisLn("High level");
                break;

        }

        //The enum type has a value() method that returns an array of its constants.

        for(Level actualLevel: Level.values())
        {
            printThisLn(String.valueOf(actualLevel));
        }

        //Java doesnt have a built in time class, so we have to import it with import java.time
        LocalDateTime timeNow = LocalDateTime.now();
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("E, MMM dd yyyy");
        String formattedDate = timeNow.format(timeFormatter);


        printThisLn(String.valueOf(formattedDate));

        //In Java you cannot add or remove elements from an array, to do that we can use the class ArrayList from java.util.ArrayList
        ArrayList<String> instruments = new ArrayList<String>();
        instruments.add("Guitar");
        instruments.add("Banjo");
        instruments.add("Kazooh");
        instruments.add("Violin");

        for (String instrument : instruments) {
            printThisLn(instrument);
        }

        //we can change an item with the set method.

        instruments.set(2, "Flute");
        printThisLn(instruments.get(2));

        //We can clear an arraylist with the clear method. And the sort method of collections package sorts the list alphabetically or numerically.

        Collections.sort(instruments);

        printThisLn("Sorted array:");

        for(String instrument: instruments)
        {
            printThisLn(instrument);
        }

        //LinkedList functions the same as arraylist but it uses way more memory, its used best when youre inserting or deleting elements pretty often.
        //We can reverse the order with collections too

        Collections.sort(instruments, Collections.reverseOrder());

        for(String instrument: instruments)
        {
            printThisLn(instrument);
        }

        //An array is an ordered collection that stores elements and we access them with an index. A HashMap on the other hand, stores elements as an
        //pair of Key/Values

        HashMap<String, String> MrHashMap = new HashMap<String, String>();

        //To add items to a hasha map we can use the put method.
        MrHashMap.put("Potato", "Potatoe");
        MrHashMap.put("Tomato", "Tomatoe");
        printThisLn(String.valueOf(MrHashMap));

        //To access a value, we have to use the get method to get the key
        MrHashMap.get("Potato");

        //To remove an item we have to use the remove method with the proper key
        MrHashMap.remove("Potato");
        printThisLn(String.valueOf(MrHashMap));

        //To know how many items an hashmap has we can use the size method
        printThisLn(String.valueOf(MrHashMap.size()));

        //When looping through a hashmap, we can use the keySet() method to loop through keys or values() for values
        for(String i: MrHashMap.keySet())
        {
            printThisLn(i);
        }

        //A hashset is a collection of unique items
        HashSet<String> cars = new HashSet<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ferrari");
        cars.add("Mazda");

        printThisLn(String.valueOf(cars));

        //To check if an item is already inside the hashset we can use the contain method
        printThisLn(String.valueOf(cars.contains("Mazda")));

        cars.add("Volvo"); //Doesn't add it since it already exists in the HashSet
        printThisLn(String.valueOf(cars));

        //Java has an object that can iterate through collections, and thats an iterator.
        Iterator<String> carIterator = cars.iterator();

        printThisLn(carIterator.next());

        //To remove you can also use remove()

        //A wrapper class lets us use a primitive type as an object.
        //Its name is the same as the primitive type but with first letter uppercase and full name. Example:

        //int --> Integer

        //Wrapper classes contains method for conversion, comparation and value manipulations

        int num = Integer.parseInt("123");
        double d = Double.parseDouble("123.23");

        printThisLn("This is string to int: " + num + ". This is string to double: " + d + ".");

        String inte = Integer.toString(456);

        printThisLn("This is integer to string: " + inte + ".");

        Integer obj = 100;
        int nuuum = obj.intValue();

        printThisLn(String.valueOf(nuuum));

        //Java collections only admit objects, so wrapper classes are primarly used to store primitives into collections

        List<Double> doubleList = new ArrayList<>();
        doubleList.add(126.99);
        doubleList.add(164.66);

        for (double number: doubleList)
        {
            printThisLn(String.valueOf(number));
        }

        //finally after try catch, lets us execute code after exception

        int[] numArray = {1,2,3,4,5,6};

        try
        {
            printThisLn(String.valueOf(numArray[10]));
        }
        catch (Exception e)
        {
            printThisLn("ERROR: Index of number 10 doesnt exist in numArray.");
        }
        finally
        {
            printThisLn("End of try-catch.");
        }

        //The throw statement allows us to create a custom error

        /*
        Scanner ageScanner = new Scanner(System.in);

        printThisLn("Please enter your age.");
        int userAge = Integer.parseInt(ageScanner.nextLine());

        if (userAge < 18)
        {
            throw new ArithmeticException("You are not old enough");
        }
        else
        {
            printThisLn("You are old enough.");
        }
         */
        //We can use regex in java with java.util.regex
        //Pattern compiles the regex and Matcher compares the regex vs the string.

        String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        String email = "pepito@gmail.com";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);

        if(matcher.matches())
        {
            printThisLn("Email is valid");
        }
        else
        {
            printThisLn("Email is not valid");
        }

        //Matches method verifies that the whole string matches the regex.

        //Find looks for coincidences in the string
        //split splits a string based of a pattern
        //replaceALL  replaces all coincidences with  another text.

    }
}