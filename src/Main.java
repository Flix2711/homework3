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

        //ex4
        int deliveryDistance = 110;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: 1 ");
        } else if (deliveryDistance <=60 ) {
            System.out.println("Потребуется дней: 2 ");
        } else if (deliveryDistance <=100) {
            System.out.println("Потребуется дней: 3 ");
        } else {
            System.out.println("Доставка не выполняется");
        }

        //ex5
        int monthNumber = 3;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("It's winter!");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("It's spring!");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("It's summer!");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("It's fall!");
                break;
            default:
                System.out.println("Not such month");
        }
    }
}