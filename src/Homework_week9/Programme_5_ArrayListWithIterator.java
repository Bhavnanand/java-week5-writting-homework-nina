package Homework_week9;

import java.util.ArrayList;
import java.util.ListIterator;

/*
Write a Java program to iterate through all elements in an array list using Iterator.
 */
public class Programme_5_ArrayListWithIterator {
    public static void main(String[] args) {
        ArrayList<String> FruitList = new ArrayList<>();
        FruitList.add("APPLE");
        FruitList.add("BANANA");
        FruitList.add("GRAPE");
        FruitList.add("MANGO");
        FruitList.add("KIWI");
        FruitList.add("ORANGE");
        FruitList.add("BLACKBERRY");
        FruitList.add("STRAWBERRY");
        FruitList.add("CHERRY");
        ListIterator<String> iterate = FruitList.listIterator();
        while (iterate.hasNext()){
            System.out.println(iterate.next()+ ",");
        }
    }
}
