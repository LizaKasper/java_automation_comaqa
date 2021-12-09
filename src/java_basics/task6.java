package java_basics;

import java.util.Scanner;

public class task6 {
    //С помощью оператора switch и циклов напишите электронное меню.
    //(Появляется до тех пор пока пользователь не выберет "Закрыть"
    public static void main(String[] args) {
        System.out.println("Меню на сегодня: паста, пицца, чизкейк, штоллен");
        System.out.println("Сделайте выбор или нажмите 'Закрыть' ");
        Scanner console = new Scanner(System.in);
        String name = console.nextLine();
        switch (name) {
            case "Паста":
                System.out.println("Продолжите выбор или нажмите 'Закрыть' ");
                break;
            case "Пицца":
                System.out.println("Продолжите выбор или нажмите 'Закрыть' ");
                break;
            case "Чизкейк":
                System.out.println("Продолжите выбор или нажмите 'Закрыть' ");
                break;
            case "Штоллен":
                System.out.println("Продолжите выбор или нажмите 'Закрыть' ");
                break;
            default:
                System.out.println("Спасибо за Ваш выбор");
                break;
        }
    }
}
