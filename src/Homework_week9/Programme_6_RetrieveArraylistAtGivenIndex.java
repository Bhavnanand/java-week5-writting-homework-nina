package Homework_week9;

import java.util.ArrayList;
import java.util.Scanner;

/*
Write a Java program to retrieve an element (at a specified index) from a given array list
 */
public class Programme_6_RetrieveArraylistAtGivenIndex {
    public static void main(String[] args) {
        ArrayList<String > vegetablelist = new ArrayList<>();
        vegetablelist.add("CUCUMBER");
        vegetablelist.add("POTATO");
        vegetablelist.add("CAULIFLOWER");
        vegetablelist.add("BRINGLE");
        vegetablelist.add("ONION");
        vegetablelist.add("BEETROOT");
        vegetablelist.add("MUSHROOM");
        vegetablelist.add("BITTER_GROUND");
        System.out.println(vegetablelist);
        Scanner scan = new Scanner(System.in);
        System.out.println("Please ente an index number  :");
        int index = scan.nextInt();
        if(index< vegetablelist.size()){
            System.out.println(vegetablelist.get(index));
        } else {
            System.out.println("Invalid Index !!");
        }
        scan.close();
    }
}
