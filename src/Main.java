public class Main {
    public static void main(String[] args) {

        System.out.println("Задача1");

        int accumulation = 15_000;
        int total = 0;
        int Month = 0;

        while (total < 2_459_000) {
            total = total + accumulation;
            total = total + total/100;
            Month++;
            System.out.println("Месяц " + Month + ", сумма накоплений равна " + total + " рублей");
        }

        System.out.println("Задача2");

        int number = 1;
        while (number <= 10) {
            System.out.print(number + " ");
            number = number + 1;
        }

        System.out.println();

        int numberTwo = 10;
        for (; numberTwo >= 1;) {
            System.out.print(numberTwo + " ");
            numberTwo = numberTwo - 1;
        }

        System.out.println("Задача3");

        int populationY = 12_000_000;
        int birthRate1000 = 17;
        int mortalityRate1000 = 8;
        int year = 2024;

        for (int i = year; i < year + 10; i++ ) {
            populationY += populationY*birthRate1000/1000 - populationY*mortalityRate1000/1000;
            System.out.println("Год " + i + " , численность населения составляет " + populationY);
        }

        System.out.println("Задача4");

        int contribution = 15000;
        int month = 0;
        while (contribution < 12_000_000) {
            contribution = (int) (contribution * (1 + 7D/100));
            month ++;
            System.out.println("Месяц " + month + " сумма накоплений " + contribution);
        }

        System.out.println("Задача5");

        contribution = 15000;
        month = 0;
        while (contribution < 12_000_000) {
            contribution = (int) (contribution * (1 + 7D/100));
            month ++;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " сумма накоплений " + contribution);
            }
        }

        System.out.println("Задача6");

        contribution = 15000;
        int months = 12 * 9;
        month = 0;
        while (month < months) {
            contribution = (int) (contribution * (1 + 7D/100));
            month ++;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " сумма накоплений " + contribution);
            }
        }

        System.out.println("Задача7");

        int friday = 5;
        for (int dayNumber = friday; dayNumber <= 31; dayNumber += 7) {
                System.out.println("Сегодня пятница, " + dayNumber + "-е число. Необходимо подготовить отчет");
        }

        System.out.println("Задача8");

        int yearBefore = 2024 - 200;
        int yearAfter = 2024 + 100;


        for (int Year = yearBefore; Year <= yearAfter; Year ++) {
            if (Year % 79 ==0) {
                System.out.println(Year);
            }
        }



    }
}