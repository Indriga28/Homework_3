public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        byte a = 100;
        System.out.println("Значение переменной a с типом byte равно " + a);
        short b = 1000;
        System.out.println("Значение переменной b с типом short равно " + b);
        int c = 1000000;
        System.out.println("Значение переменной c с типом int равно " + c);
        long d = 10000000L;
        System.out.println("Значение переменной d с типом long равно " + d);
        float e = 1.5F;
        System.out.println("Значение переменной e с типом float равно " + e);
        double f = 10.55555555;
        System.out.println("Значение переменной f с типом double равно " + f);
    }

    public static void task2() {
        System.out.println("Задача 2");
        float a = 27.12f;
        System.out.println(a);
        long b = 987678965549L;
        System.out.println(b);
        float c = 2.786F;
        System.out.println(c);
        short d = 569;
        System.out.println(d);
        short e = -159;
        System.out.println(e);
        short f = 27897;
        System.out.println(f);
        byte g = 67;
        System.out.println(g);
    }


    public static void task3() {
        System.out.println("Задача 3");
        byte teacherLP = 23;
        byte teacherAS = 27;
        byte teacherEA = 30;
        int totalNumberOfPupils = teacherLP + teacherAS + teacherEA;
        short paper = 480;
        int paperForEachPupil = paper / totalNumberOfPupils;
        System.out.println("На каждого отдельного ученика рассчитано " + paperForEachPupil + " листов бумаги.");
    }

    public static void task4() {
        System.out.println("Задача 4");
        byte bottleForOneMinute = 16 / 2;
        int bottleForTwentyMinutes = 20 * bottleForOneMinute;
        System.out.println("За 20 минут машина произвела " + bottleForTwentyMinutes + " штук бутылок." );
        short minutesInADay = 24 * 60;
        int bottleForOneDay = bottleForOneMinute * minutesInADay;
        System.out.println("За сутки машина произвела " + bottleForOneDay +  " штук бутылок.");
        int minutesInAMonth = 24 * 60 * 30;
        short minutesInThreeDays = 24 * 3 * 60;
        int bottleThreeDays = minutesInThreeDays * bottleForOneMinute;
        System.out.println("За трое суток машина произвела " + bottleThreeDays +  " штук бутылок.");
        int bottleForMonth = minutesInAMonth * bottleForOneMinute;
        System.out.println("За месяц машина произвела " + bottleForMonth +  " штук бутылок.");
    }

    public static void task5() {
        System.out.println("Задача 5");
        byte numberOfClasses = 120 / 6;
        byte whiteColour = 120 / 3;
        byte brownColour = 120 / 3 * 2;
        System.out.println("В школе, где " + numberOfClasses + " классов, нужно " + whiteColour + " банок белой краски и " + brownColour + " банок коричневой краски.");
    }
    public static void task6() {
        System.out.println("Задача 6");
        int bananaWeight = 5 * 80;
        short milkWeight = 2 * 105;
        short icecreamWeight = 2 * 100;
        short eggWeiight = 4 * 70;
        int totalWeight = bananaWeight + milkWeight + icecreamWeight + eggWeiight;
        System.out.println("Вес завтрака спортсмена составляет " + totalWeight + " гр");
        float totalWeightKG = totalWeight / 1000f;
        System.out.println("Вес завтрака спортсмена составляет " + totalWeightKG + " кг");
    }
    public static void task7() {
        System.out.println("Задача 7");
       short weightToLose = 7 * 1000;
       int quarterLose = weightToLose / 250;
       int halfLose = weightToLose / 500;
       int middleDif = (halfLose + quarterLose) / 2;
        System.out.println("В среднем на похудение у спортсмена уйдет " + middleDif + " день, при этом, теряя по 250 гр, он похудеет на 7 кг за " + quarterLose + " дней, а теряя по 500 гр, - за " + halfLose + " дней.");

    }
    public static void task8() {
        System.out.println("Задача 8");
       int masha = 67760;
       int denis = 83690;
       int christina = 76230;
       int mashaPromotion = masha / 100 * 10 + masha;
       int mashaDif = (mashaPromotion * 12) - (masha * 12);
        System.out.println("Маша теперь получает " + mashaPromotion + " рублей. Годовой доход вырос на " + mashaDif + " рублей.");
        int denisPromotion = denis / 100 * 10 + denis;
        int denisDif = (denisPromotion * 12) - (denis * 12);
        System.out.println("Денис теперь получает " + denisPromotion + " рублей. Годовой доход вырос на " + denisDif + " рублей.");
        int christinaPromotion = christina / 100 * 10 + christina;
        int christinaDif = (christinaPromotion * 12) - (christina * 12);
        System.out.println("Кристина теперь получает " + christinaPromotion + " рублей. Годовой доход вырос на " + christinaDif + " рублей.");
    }
}