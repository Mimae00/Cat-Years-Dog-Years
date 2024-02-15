package src;

public class CatDogYearsImpl {

    public static void humanYearsCatYearsDogYears(final int humanYears) {

        int humanCatYearsTotal = 0;
        int humanDogYearsTotal = 0;

        int thirdYearAndMore = 3;

        int year1 = 15;
        int year2 = 9;
        int catYearMore = 4;
        int dogYearMore = 5;

        if(humanYears == 1){
            humanCatYearsTotal = year1;
            humanDogYearsTotal = year1;
        } else if (humanYears == 2) {
            humanCatYearsTotal = year1 + year2;
            humanDogYearsTotal = year1 + year2;
        } else if (humanYears >= thirdYearAndMore) {
           humanCatYearsTotal =  (humanYears - 2) * catYearMore + year1 + year2;
           humanDogYearsTotal =  (humanYears - 2) * dogYearMore + year1 + year2;
        }

        int[] total = new int[3];
        total[0] = humanYears;
        total[1] = humanCatYearsTotal;
        total[2] = humanDogYearsTotal;

        System.out.println("Human age: " + total[0] + "\nCat age: " + total[1] + "\nDog age: " + total[2]);

    }

}