public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        int i = 1_248_476;
        System.out.printf("«Значение переменной i с типом int равно %s»\n", i);
        byte b = 79;
        System.out.printf("«Значение переменной b с типом byte равно %s»\n", b);
        short s = 29_999;
        System.out.printf("«Значение переменной s с типом short равно %s»\n", s);
        long l = 76_143_888_760L;
        System.out.printf("«Значение переменной l с типом long равно %s»\n", l);
        float f = 0.98F;
        System.out.printf("«Значение переменной f с типом float равно %s»\n", f);
        double d = 4.294681;
        System.out.printf("«Значение переменной d с типом double равно %s»\n", d);

        System.out.println("\nTask 2");
        float f1 = 27.12F;
        System.out.printf("«Значение переменной f1 с типом float равно %s»\n", f1);
        long l1 = 987_678_965_549L;
        System.out.printf("«Значение переменной l1 с типом long равно %s»\n", l1);
        double d1 = 2.786;
        System.out.printf("«Значение переменной d1 с типом double равно %s»\n", d1);
        short s1 = 569;
        System.out.printf("«Значение переменной s1 с типом short равно %s»\n", s1);
        int i1 = -159;
        System.out.printf("«Значение переменной i1 с типом int равно %s»\n", i1);
        short s2 = 27897;
        System.out.printf("«Значение переменной s2 с типом short равно %s»\n", s2);
        byte b1 = 67;
        System.out.printf("«Значение переменной b1 с типом byte равно %s»\n", b1);

        System.out.println("\nTask 3");
        byte ludmilaStudentAmount = 23;
        byte annaStudentAmount = 27;
        byte ekaterinaStudentAmount = 30;
        short allPaperAmount = 480;
        short allStudentsAmount = (short) (ludmilaStudentAmount + annaStudentAmount + ekaterinaStudentAmount);
        float paperPerStudent = (float) allPaperAmount / allStudentsAmount;
        System.out.printf("«На каждого ученика рассчитано %s листов бумаги».\n", paperPerStudent);

        System.out.println("\nTask 4");
        int machinePerformancePerTwoMinute = 16;
        int machinePerformancePerMinute = machinePerformancePerTwoMinute / 2;
        int machinePerformancePerTwentyMinutes = machinePerformancePerMinute * 20;
        System.out.printf("«За 20 минут машина произвела %s штук бутылок».\n", machinePerformancePerTwentyMinutes);
        int minutePerDay = 60 * 24;
        int machinePerformancePerDay = machinePerformancePerMinute * minutePerDay;
        System.out.printf("«За сутки машина произвела %s штук бутылок».\n", machinePerformancePerDay);
        int machinePerformancePerThreeDays = machinePerformancePerDay * 3;
        System.out.printf("«За 3 дня машина произвела %s штук бутылок».\n", machinePerformancePerThreeDays);
        int machinePerformancePerMouth = machinePerformancePerDay * 31;
        System.out.printf("«За месяц машина произвела %s штук бутылок».\n", machinePerformancePerMouth);

        System.out.println("\nTask 5");
        int allTinAmount = 120;
        int whiteTinPerClass = 2;
        int brownTinPerClass = 4;
        int tinPerClass = whiteTinPerClass + brownTinPerClass;
        double numberOfClasses = (double) allTinAmount / (tinPerClass);
        double whiteTinAmountAll = whiteTinPerClass * numberOfClasses;
        double brownTinAmountAll = brownTinPerClass * numberOfClasses;
        System.out.println("«В школе, где " + numberOfClasses + " классов, нужно " + whiteTinAmountAll + " банок белой краски и " + brownTinAmountAll + " банок коричневой краски».");

        System.out.println("\nTask 6");
        int bananasAmountPieces = 5;
        int milkAmountMl = 200;
        int iceCreamAmountPieces = 2;
        int eggsAmountPieces = 4;

        int bananasWeightGr = bananasAmountPieces * 80;
        double milkWeightGr = (double) milkAmountMl * 1.05;
        int iceCreamWeightGr = iceCreamAmountPieces * 100;
        int eggsWeightGr = eggsAmountPieces * 70;

        double breakfastWeightGr = (double) bananasWeightGr + milkWeightGr + iceCreamWeightGr + eggsWeightGr;
        System.out.println("Вес завтрака спортсмена равен " + breakfastWeightGr + " грамм");
        double breakfastWeightInKilo = breakfastWeightGr / 1000;
        System.out.println("Вес завтрака спортсмена равен " + breakfastWeightInKilo + " киллограм");

        System.out.println("\nTask 7");
        int manWeightInKilo = 7;
        int manWeightInGrams = manWeightInKilo * 1000;
        double minDays = (double) manWeightInGrams / 500;
        double maxDays = (double) manWeightInGrams / 250;
        double averageAmountOfWeightGrLoss = (double) (500 + 250) / 2;
        double averageDays = (maxDays + minDays) / 2;
        System.out.println("Если спортсмен будет терять каждый день по 250 грамм, то он похудеет на " + manWeightInKilo + " киллограмм за период в " + maxDays + " дней.");
        System.out.println("Если спортсмен будет терять каждый день по 500 грамм, то он похудеет на " + manWeightInKilo + " киллограмм за период в " + minDays + " дней.");
        System.out.printf("Если спортсмен будет терять каждый день в среднем" +
                        " по %.0f грамм, то он похудеет" +
                        " на %s киллограмм за период в %.0f дней.\n",
                        averageAmountOfWeightGrLoss, manWeightInKilo, averageDays);


        System.out.println("\nTask 8");
        double percent = 1.1;
        int mashaSalary = 67760;
        int denisSalary = 83690;
        int kristinaSalary = 76230;

        int mashaSalaryYear = mashaSalary * 12;
        int denisSalaryYear = denisSalary * 12;
        int kristinaSalaryYear = kristinaSalary * 12;

        double mashaNewSalary = mashaSalary * percent;
        double denisNewSalary = denisSalary * percent;
        double kristinaNewSalary = kristinaSalary * percent;

        double mashaNewSalaryYear = mashaNewSalary * 12;
        double denisNewSalaryYear = denisNewSalary * 12;
        double kristinaNewSalaryYear = kristinaNewSalary * 12;

        double mashaYearDifSalary = mashaNewSalaryYear - mashaSalaryYear;
        double denisYearDifSalary = denisNewSalaryYear - denisSalaryYear;
        double kristinaYearDifSalary = kristinaNewSalaryYear - kristinaSalaryYear;

        System.out.printf("«Маша теперь получает %.1f рублей. Годовой доход вырос на %.1f рублей».\n",
                mashaNewSalary, mashaYearDifSalary);
        System.out.printf("«Денис теперь получает %.1f рублей. Годовой доход вырос на %.1f рублей».\n",
                denisNewSalary, denisYearDifSalary);
        System.out.printf("«Кристина теперь получает %.1f рублей. Годовой доход вырос на %.1f рублей».\n",
                kristinaNewSalary, kristinaYearDifSalary);
    }
}