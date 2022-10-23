package ru.job4j.tracker.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Пётр");
        student.setGroup("21");
        student.setStartDate(new Date());

        System.out.println(student.getStartDate() + " - студент " + student.getName() + " зачислен в группу номер " + student.getGroup() + ".");
    }
}
