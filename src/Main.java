public class Main {
    public static void main(String[] args) {
        System.out.println("task 1");
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Что-то пошло не так");
        }

        System.out.println("task 2");
        int clientDeviceYear = 2016;
        String version = "полную";
        String os = "Android";
        String version1 = "облегченную";
        String os1 = "iOS";
        if (clientDeviceYear >= 2015) {
            System.out.println("Установите " + version + " версию приложения для " + os + " по ссылке");
        } else if (clientDeviceYear < 2015) {
            System.out.println("Установите " + version1 + " версию приложения для " + os + " по ссылке");
        }


        System.out.println("task 3");
        int year = 2021;
        if (year % 100 == 0 && year % 400 >= 1 || year % 4 >= 1) {
            System.out.println(year + " год не является високосным");
        } else if (year % 4 == 0 || year % 100 == 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        }

        System.out.println("task 4");
        var deliveryDistance = 95;
        int days = 1;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + days);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: " + (days + days));
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: " + (days + days + days));
        }

        System.out.println("task 5");
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
                System.out.println("Зима");
                break;
            case 2:
                System.out.println("Зима");
                break;
            case 3:
                System.out.println("Весна");
                break;
            case 4:
                System.out.println("Весна");
                break;
            case 5:
                System.out.println("Весна");
                break;
            case 6:
                System.out.println("Лето");
                break;
            case 7:
                System.out.println("Лето");
                break;
            case 8:
                System.out.println("Лето");
                break;
            case 9:
                System.out.println("Осень");
                break;
            case 10:
                System.out.println("Осень");
                break;
            case 11:
                System.out.println("Осень");
                break;
            case 12:
                System.out.println("Зима");
                break;
            default:
                System.out.println("Номер месяца больше 13");

        }
    }
}





