package Homework_week9;

import java.util.ArrayList;

public class Programme_7_UnderGroundTubeNames {
public void isempty(){
    ArrayList<String> tubeNames = new ArrayList<>();
    tubeNames.add("Bakerloo_lines");
    tubeNames.add("Central_lines");
    tubeNames.add("Circle_lines");
    tubeNames.add("District_lines");
    tubeNames.add("Hammersmith-and_City_lines");
    tubeNames.add("Jubilee_lines");
    tubeNames.add("Metropolitan_lines");
    tubeNames.add("Northern_lines");
    tubeNames.add("Picaddily_lines");
    tubeNames.add("Victoria_lines");
    tubeNames.add("Waterloo_And_Citt_lines");
    System.out.println("Give ArrayList"+ tubeNames);
    if(tubeNames.isEmpty()) {
        System.out.println("Given Arraylist is Empty !!");
    }else {
        System.out.println("Given ArrayList is not Empty!!");
    }
}

    public static void main(String[] args) {
        Programme_7_UnderGroundTubeNames obj =new Programme_7_UnderGroundTubeNames();
        obj.isempty();
    }
}
