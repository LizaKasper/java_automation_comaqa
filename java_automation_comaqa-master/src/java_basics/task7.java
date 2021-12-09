package java_basics;

import java.util.Scanner;

public class task7 {
    //Реализуйте телевизионный пульт, используя одномерный массив.
    //(Пользователь вводит номер канала - программа выдаёт имя канала).
    public static void main(String[] args) {
        String [] channels = {"1. Discovery", "2. MTV","3. OnePlus", "4. Animal Planet"};

        System.out.println("Введи номер канала");
        Scanner console = new Scanner(System.in);
        int num = console.nextInt();

        switch (num) {
            case 1:
                System.out.println(channels[0]);
                break;
            case 2:
                System.out.println(channels[1]);
                break;
            case 3:
                System.out.println(channels[2]);
                break;
            case 4:
                System.out.println(channels[3]);
                break;
            default:
                System.out.println("Такого канала не существует");
                break;
        }
    }
}
