package com.tts;

import com.tts.lambdasInterface.IntMath;
//import com.tts.lambdasInterface.MathFunctions;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class Main {

    // this is an example of generics
    public static void main(String[] args) {

        IntMath addMethod = (a, b) -> a - b;
        System.out.println(addMethod.operations(4, 5));

        JavaLambdas stuffArr = new JavaLambdas();
        stuffArr.arrayStuff();

        AnotherClass<Integer, String> myClass = new AnotherClass<>(12, "Hello");
        int numVal = myClass.getThingOne();
        String strVal = myClass.getThingTwo();

        AnotherClass<String, String> myClass2 = new AnotherClass<>("12", "45");
        String numVal2 = myClass2.getThingOne();
        String numVal3 = myClass2.getThingTwo();


//         System.out.println("This is helpful and confusing at the same time!");
//         System.out.println("numVal" + numVal);
//         System.out.println("strVal" + strVal);

        Set<String> newSet = new HashSet<>();
        newSet.add("one");
        newSet.add("Two");
        newSet.add("Java");

        Set<String> newSet2 = new HashSet<>();
        newSet2.add("one");
        newSet2.add("Two");
        newSet2.add("Spring");

        Set<String> setResult = printStuff(newSet, newSet2);
        Iterator<String> myItr = setResult.iterator();
        while (myItr.hasNext()) {
            System.out.println(myItr.next());
        }
        // for(String s : setResult) {
        //    System.out.println(s);
    }


    public static <E>Set<E> printStuff(Set<E> setOne, Set<E> setTwo) {
        // I forgot to put setOne in the hashSet
        Set<E> result = new HashSet<>(setOne);
        // then when you get to add all you add the setTwo in the argument.
        result.addAll(setTwo);  // adds all without duplicating
      //  System.out.println("result " + result);
        return result;
    }
}











// we implemented an Integer and String along with empty brackets
// to create and empty string to keep from repeating
// we also created a while loop but changed to a for loop to the String to run
// the type parameter section of a generic class can have one or more parameters(<T>), separated by commas.
// these classes are known as parameterized classes or parameterized types b/c they accept one or more parameters.
// using generics allows for stronger type checks at compile time to generic code and issues errors if the code violates type safety.
// fixing compile-time errors is easier then fixing runtime errors, which can be difficult to find.
// with generics, you can write a single method declaration that can be called with arguments of different types.
// the syntax for a generic method includes a list of type parameters, inside angle brackets<>,which appears before the methods return type.
// you can also add a placeholder in the brackets