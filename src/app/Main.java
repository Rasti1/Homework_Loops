package app;

public class Main {

    static int lineSum;

    static int totalSum;

    public static void main(String[] args) {

        //Оголошуємо масив з 6 значень.
        int [] array = {1, 2, 3 ,4 ,5 ,6};
        lineSum = 0;
        totalSum = 0;
        for (int i: array){
            lineSum += i;
            System.out.println(i + ") " + "Num is " + i + ", "
                    + "sum is " + lineSum);
            totalSum += i;
        }
        System.out.println("Sum of numbers is " + totalSum);
    }
}
