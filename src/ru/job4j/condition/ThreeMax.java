package ru.job4j.condition;

public class ThreeMax {
    public static int max(int first, int second, int third) {
        int result = second;
        if (first > second && first > third) {
            result = first;
        }
        if (second < first && second < third) {
            result = third;
        }
        return result;
    }
}