package java_basics;

public class task4_3 {
    public static void main(String[] args) {
        // Написать программу, которая увеличивает вам зарплату каждый месяц на $1000,
        //используя циклы while/ do ... while, for. (Все три реализации)
        int salary = 1000;
        int month;
        for (month=1; month <= 12; ++month) {
            System.out.println(month + "month:" + " " + salary);
            salary = salary + 1000;
        }
    }
}
