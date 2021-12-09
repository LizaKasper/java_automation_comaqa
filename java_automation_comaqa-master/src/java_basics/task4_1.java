package java_basics;

public class task4_1 {
    public static void main(String[] args) {
        // Написать программу, которая увеличивает вам зарплату каждый месяц на $1000,
        //используя циклы while/ do ... while, for. (Все три реализации)
        int salary = 1000;
        int month = 1;
        while (month <= 12) {
            System.out.println(month + "month:" + " " + salary);
            ++month;
            salary = salary + 1000;
        }

    }
}
