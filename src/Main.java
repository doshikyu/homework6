public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        for (int i = 1; i <= 10; i++)
        {
            System.out.print (i + " ");
        }
        System.out.println("\nЗадача 2");
        for (int i = 10; i >= 1; i--)
        {
            System.out.print (i + " ");
        }
        System.out.println("\nЗадача 3");
        for (int i = 0; i <= 17; i += 2)
        {
            System.out.print (i + " ");
        }
        System.out.println("\nЗадача 4");
        for (int i = 10; i >= -10; i--)
        {
            System.out.print (i + " ");
        }
        System.out.println("\nЗадача 5");
        for (int i = 1904; i <= 2096; i += 4)
        {
            System.out.print (i + " ");
        }
        System.out.println("\nЗадача 6");
        for (int i = 7; i <= 98; i += 7)
        {
            System.out.print (i + " ");
        }
        System.out.println("\nЗадача 7");
        for (int i = 1; i <= 512; i *= 2)
        {
            System.out.print (i + " ");
        }
        System.out.println("\nЗадача 8");
        double monthlySavings = 29000;
        double totalSavings = 0;
        for (int i = 1; i <= 12; i++)
        {
            totalSavings += monthlySavings;
            System.out.println ("Месяц " + i + ", сумма накоплений равна " + totalSavings + " рублей");
        }
        System.out.println("\nЗадача 9");
        double monthlyRate = 0.12 / 12 + 1;
        totalSavings = 0;
        for (int i = 1; i <= 12; i++)
        {
            totalSavings = totalSavings * monthlyRate + monthlySavings;
            System.out.println ("Месяц " + i + ", сумма накоплений равна " + totalSavings + " рублей");
        }
        System.out.println("\nЗадача 10");
        for (int i = 1; i <= 10; i++)
        {
            System.out.println (2 + " * " + i + " = " + 2 * i);
        }

    }
}