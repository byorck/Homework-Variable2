public class Main {
    public static void main(String[] args) {
        int four = 2147483647;  //задача № 1
        byte one = 127;
        short two = 32766;
        long eight = 9223372036854775807L;
        float pointFour = 3.4f;
        double pointEight = 1.7;
        System.out.println("Значение переменной с типом " + "int" + " равно " + four);
        System.out.println("Значение переменной с типом " + "byte" + " равно " + one);
        System.out.println("Значение переменной с типом " + "short" + " равно " + two);
        System.out.println("Значение переменной с типом " + "long" + " равно " + eight);
        System.out.println("Значение переменной с типом " + "float" + " равно " + pointFour);
        System.out.println("Значение переменной с типом " + "double" + " равно " + pointEight);
        float first = 27.12f;  //задача № 2
        long second = 987678965549L;
        float third = 2.786f;
        short fourth = 569;
        short five = -159;
        short six = 27897;
        byte seven = 67;
        byte firstTeacher = 23;  //задача № 3
        byte secondTeacher = 27;
        byte thirdTeacher = 30;
        short summarySheets = 480;
        int sheetsPerOneStudent = summarySheets / (firstTeacher + secondTeacher + thirdTeacher);
        System.out.println("На каждого ученика расчитано " + sheetsPerOneStudent + " листов бумаги");
        byte bottlePerMinute = 16 / 2;  //задача № 4
        int bottlePerDay = bottlePerMinute * 1440;
        int bottlePerMonth = bottlePerDay * 30;
        System.out.println("За " + "20 минут" + " машина произвела " + (bottlePerMinute * 20) + " штук бутылок");
        System.out.println("За " + "сутки" + " машина произвела " + bottlePerDay + " штук бутылок");
        System.out.println("За " + "3 дня" + " машина произвела " + (bottlePerDay * 3) + " штук бутылок");
        System.out.println("За " + "месяц" + " машина произвела " + bottlePerMonth + " штук бутылок");
        byte countClassroom = 120 / (2 + 4);  //задача № 5
        int countWhitePaint = countClassroom * 2;
        int countBrownPaint = countClassroom * 4;
        System.out.println("В школе, где " + countClassroom + " классов, нужно " + countWhitePaint + " банок белой краски и " + countBrownPaint + " банок коричневой краски");
        byte banana = 80;  //задача № 6
        byte milk = 105;
        byte iceCream = 100;
        byte egg = 70;
        int summaryWeightInGr = banana * 5 + milk * 2 + iceCream * 2 + egg * 4;
        float summaryWeightInKg = summaryWeightInGr / 1000f;
        System.out.println(summaryWeightInGr);
        System.out.println(summaryWeightInKg);
        byte necessaryWeightInKg = 7;  //задача № 7
        int necessaryWeightInGr = necessaryWeightInKg * 1000;
        int countDay250 = necessaryWeightInGr / 250;
        int countDay500 = necessaryWeightInGr / 500;
        int averageDay = (countDay250 + countDay500) / 2;
        System.out.println(countDay250);
        System.out.println(countDay500);
        System.out.println(averageDay);
        int wagesMasha = 67760;  //задача № 8
        int wagesDenis = 83690;
        int wagesKristin = 76230;
        int increasedWagesMasha = wagesMasha * 110 / 100;
        int increasedWagesDenis = wagesDenis * 110 / 100;
        int increasedWagesKristin = wagesKristin * 110 / 100;
        int differenceWagesMasha = increasedWagesMasha - wagesMasha;
        int differenceWagesDenis = increasedWagesDenis - wagesDenis;
        int differenceWagesKristin = increasedWagesKristin - wagesKristin;
        System.out.println("Маша теперь получает " + increasedWagesMasha + " рублей. Годовой доход вырос на " + differenceWagesMasha + " рублей");
        System.out.println("Денис теперь получает " + increasedWagesDenis + " рублей. Годовой доход вырос на " + differenceWagesDenis + " рублей");
        System.out.println("Кристина теперь получает " + increasedWagesKristin + " рублей. Годовой доход вырос на " + differenceWagesKristin + " рублей");
    }
}