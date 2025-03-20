package homework;

public class HomeworkOne {

    public static void main(String[] args) {
        displayTaskInfo("1.1");
        sayHello();
        displayTaskInfo("1.2");
        javaFiveTimes();
        displayTaskInfo("1.3");
        javaFormat();
        displayTaskInfo("1.4");
        table();
        displayTaskInfo("1.5");
        compute();
        displayTaskInfo("1.6");
        sumUp();
        displayTaskInfo("1.7");
        approxPi();
        displayTaskInfo("1.8");
        getCircleInfo();
        displayTaskInfo("1.9");
        getRectangleInfo();
        displayTaskInfo("1.10");
        getRunnerAverageInfo();
        displayTaskInfo("1.11");
        getPopulationInfo();
        displayTaskInfo("1.13");
        solveLinerEq();
    }


    public static void sayHello() {
        System.out.println("Welcome to Java");
        System.out.println("Welcome to Computer Science");
        System.out.println("Programming is fun");
    }

    public static void javaFiveTimes() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Welcome to Java");
        }
    }

    public static void javaFormat() {
        System.out.println(" J   A   V   V   A");
        System.out.println(" J  A A   V V   A A");
        System.out.println("J J AAAAA  V   AAAAA");
        System.out.println(" J  A A   V   A A");
    }
    public static void table() {
        System.out.println("a   a^2   a^3");
            for (int i = 1; i <= 4; i++) {
            System.out.printf("%d   %d    %d\n", i, i * i, i * i * i);
        }
    }

    public static void compute() {
        double result = 9.5 * 4.5 - 2.5 * 3;
        System.out.println("9.5 * 4.5 - 2.5 * 3 =: " + result);

        double result2 = 45.5 - 3.5;
        System.out.println("45.5 - 3.5 =: " + result2);

        System.out.println("შედეგი =: " + result / result2);
    }


    public static void sumUp(){
        int sum = 0;
        for (int i = 1; i <= 9; i++) {
            sum += i;
        }
        System.out.println("1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 is: " + sum);
    }

    public static void approxPi() {
        double loopResultOne = 0, loopResultTwo = 0;
        int switcher = -1;
        for(int i = 1;  i <= 11; i = i + 2) {
            loopResultOne += (double) 1 / i * switcher;
            switcher *= -1;
        }

        switcher = -1;
        for(int i = 1;  i <= 13; i = i + 2) {
            loopResultTwo = (double) 1 / i * switcher;
            switcher *= -1;
        }
        System.out.println("შედეგი 1" + 4 *loopResultOne);
        System.out.println("შედეგი 2" + 4 *loopResultTwo);


    }


    public static void getCircleInfo() {
        double radius = 5.5;
        double pi = Math.PI;
        double perimeterCircle = 2 * radius * pi;
        double areaCircle = radius * radius * pi;

        System.out.println("პერიმეტრი: " + perimeterCircle);
        System.out.println("ფართობი: " + areaCircle);
    }


    public static void getRectangleInfo() {
        double width = 4.5;
        double height = 7.9;
        double perimeterRectangle = 2 * (width + height);
        double areaRectangle = width * height;

        System.out.println("პერიმეტრი: " + perimeterRectangle);
        System.out.println("ფართობი: " + areaRectangle);
    }
    public static void getPopulationInfo() {
        int currentPopulation = 312032486;
        int secondsInOneYear = 365 * 24 * 60 * 60;

        int birthRate = 7;
        int deathRate = 13;
        int immigrationRate = 45;

        int birthsPerYear = secondsInOneYear / birthRate;
        int deathsPerYear = secondsInOneYear / deathRate;
        int immigrantsPerYear = secondsInOneYear / immigrationRate;

        for (int year = 1; year <= 5; year++) {
            int populationChange = birthsPerYear - deathsPerYear + immigrantsPerYear;
            currentPopulation += populationChange;

            System.out.println("წელი " + year + ": " + currentPopulation);

        }
    }


    public static void getRunnerAverageInfo() {
        double miles = 24.0;
        int hours = 1;
        int minutes = 40;
        int seconds = 35;

        double totalTimeInHours = hours + (minutes / 60.0) + (seconds / 3600.0);

        double kilometers = miles * 1.6;

        double averageSpeed = kilometers / totalTimeInHours;

        System.out.println("საშუალო სიჩქარე: " + averageSpeed + " kilometers per hour");
    }

    public static void solveLinerEq() {
        double a = 3.4, b = 50.2, e = 44.5;
        double c = 2.1, d = 0.55, f = 5.9;

        double determinant = a * d - b * c;

        double x = (e * d - b * f) / determinant;
        double y = (a * f - e * c) / determinant;

        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }

    public static void displayTaskInfo(String taskNum) {
        System.out.println();
        System.out.println("Task Num : " + taskNum);
        System.out.println();
    }
}

