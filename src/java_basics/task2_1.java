package java_basics;

public class task2_1 {
    // Объявить переменные всех вам известных типов и вывести их значения на экран.
    public static void main(String[] args) {
        //переменная экземпляра класса
        String classV = "I'm a class variable";
        System.out.println(classV);

            for (int i = 0; i < 1; ++i) {
                //локальная переменная, доступная только внутри цикла
                int localCycleV = 1;
                System.out.println(localCycleV);
            }
        }
    }


