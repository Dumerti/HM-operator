import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(" ");
        System.out.println("Задание №1");
        int age = 17; // Возраст человека
        if (18 <= age) {
            System.out.println("Если возраст человека равен " + age + " он совершенолетний, может водить машину ");
        } else {
            System.out.println("Если возраст человека равен " + age + "  он не достиг совершеннолетия, нужно немного подождать что бы водить машину");
        }
        System.out.println(" ");
        System.out.println("Задание №2");
        int temperature = 22; // темепратура на улице
        if (temperature < 5) {
            System.out.println("На улице " + temperature + " сегоддня холодно, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperature + " сегодня тепло, можно идти без шапки");
        }
        System.out.println(" ");
        System.out.println("Задание №3");
        int speed = 60; // скорость автомобиля
        if (speed <= 60) {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        } else {
            System.out.println("Если скорость " + speed + ", то придеться заплатить штраф");
        }
        System.out.println(" ");
        System.out.println("Задание №4");
        int ageMan = 26; // возраст человека
        if (ageMan >= 2 && ageMan <= 6) {
            System.out.println("Если возраст человека равен " + ageMan + ", то ему нужно ходить в детский садик");
        }
        if (ageMan >= 7 && ageMan <= 17) {
            System.out.println("Если возраст человека равен " + ageMan + ", то ему нужно ходить в школу");
        }
        if (ageMan >= 18 && ageMan <= 24) {
            System.out.println("Если возраст человека равен " + ageMan + ", то ему нужно ходить в университет");
        }
        if (ageMan > 24) {
            System.out.println("Если возраст человека равен " + ageMan + ", то ему нужно ходить на работу");
        }
        System.out.println(" ");
        System.out.println("Задание №5");
        int ageChildren = 14; // возраст ребенка

        if (ageChildren < 5) {
            System.out.println("Если возраст ребенка равен " + ageChildren + ", то ему нельзя кататься на атракционах");
        } else if (ageChildren >= 5 && ageChildren < 14) {
            System.out.println("Если возраст ребенка равен " + ageChildren + ", то ему можно кататься на аттракционе в сопровождении взрослого");
        } else if (ageChildren >= 14) {
            System.out.println("Если возраст ребенка равен " + ageChildren + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }
        System.out.println(" ");
        System.out.println("Задание №6");
        int buyTicket = 60;
        int capacityPlace = 102; // общие количество бест в вагоне
        int sedentaryPlace = 60; // количество сидячих мест
        int standingPlace = capacityPlace - sedentaryPlace; // количество стоячих мест 42
        if (buyTicket >= sedentaryPlace && buyTicket <= capacityPlace) {
            System.out.println("В вагоне остались стоячие места");
        } else if (buyTicket < sedentaryPlace && buyTicket <= capacityPlace) {
            System.out.println("В вагоне остались сидячие и стоячие места");
        } else {
            System.out.println("Вагон полность забит");
        }
        System.out.println(" ");
        System.out.println("Задание №7");
        int one = 1;
        int two = 2;
        int three = 3;
        if (one > two && one > three) {
            System.out.println("Число " + one + " больше остальных чисел");
        } else if (two > one && two > three) {
            System.out.println("Число " + two + " больше остальных чисел");
        } else {
            System.out.println("Число " + three + " больше остальных чисел");
        }
    }


}
