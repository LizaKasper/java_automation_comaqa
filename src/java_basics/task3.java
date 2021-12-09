package java_basics;

public class task3 {
    public static void main(String[] args) {
        //Объявить строку с вашим полным именем и вывести на экран результат работы всех
        //стандартных методов работы со строками.
        String name = "Lizaveta Pavlovna Kaspiarovich";
        System.out.println(name);
        // empty ()
        if (name.isEmpty()) {
            System.out.println("String is empty");
        } else {
            //lenght()
            System.out.println(name.length());
        }
        // equals()
        String name2 = "Lizaveta Pavlovna Kaspiarovich";
        System.out.println(name.equals(name2)); // true

        // equalsIgnoreCase()
        System.out.println("liZaVeta pavloVNA KaspiarovICH".equalsIgnoreCase(name)); // true

        // перевод объекта/примитива в строку  valueOf();
        String a = String.valueOf(1);
        System.out.println(a);

    }
}
