package ru.job4j.loop;

public class Prime {

    public static int calc(int finish) {
        int count = 0;
        for (int number = 2; number<=finish; number++) {
            if (CheckPrimeNumber.check(number))  {

                count++;

            }

        }
        return count;
    }
}