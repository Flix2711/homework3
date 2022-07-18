public class Main {
    public static void main(String[] args) {
        //ex1
                int clientOS = 0;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 0){
            System.out.println("Установите версию приложения для iOS по ссылке");
        }

        //ex2
        int clientDeviceYear = 2016;
        int OS = 1;
        if (clientDeviceYear <= 2015 && OS == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientDeviceYear <= 2015 && OS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientDeviceYear > 2015 && OS == 1) {
            System.out.println("Установите новую версию приложения для Android по ссылке");
        } else if (clientDeviceYear > 2015 && OS == 0) {
            System.out.println("Установите новую версию приложения для iOS по ссылке");
        }

        //ex3
        int year = 2020;
        if ((year % 4 == 0) && (year % 100 != 0) || year % 400 == 0) {
            System.out.println( year + " год является високосным");
        } else {
            System.out.println( year + " год не является високосным");
        }

    }
}