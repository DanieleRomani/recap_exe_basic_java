package it.develhope.SIZE.exe18;

import java.util.ArrayList;

public class Course {
    ArrayList<Students> students = new ArrayList<>();
    String courseName;
    int maxStudent;
    byte qualityRatingOutOf10;


    public Course(String name) {


        this.courseName = name;
    }

    public double average() {
        double sum = 0;

        for (int i = 0; i < students.size(); i ++){
            sum = sum + students.get(i).age;
        }

        double average = sum / students.size();

        return average;
    }
}
