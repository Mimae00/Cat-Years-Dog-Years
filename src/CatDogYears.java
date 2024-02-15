package src;

import java.util.Scanner;

public class CatDogYears {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int humanYears = scanner.nextInt();


        CatDogYearsImpl.humanYearsCatYearsDogYears(humanYears);
    }


}

