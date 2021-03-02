package ru.job4j.loop;

public class Mortgage {
    public static int year(int amount, int salary, double percent) {
        int year = 0;
       double a = amount*1.0;
       double b = salary*1.0;

        while (a  >= b) {
           a = (a+a * percent) - b;
            year++;


        }
        return year;
    }

}
