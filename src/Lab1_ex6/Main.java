package Lab1_ex6;

import java.util.Scanner;
public class Main
{

    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int b = scanner.nextInt();

        if (b % 2 != 0)
        {
            System.out.println("Нечетное " + b );
        }
        if (b % 2 == 0)
        {
            System.out.println("Четное " + b );
        }
        if (b % 2 == 0 & b>=100)
        {
            System.out.println("Выход за пределы диапазона " + b);
        }

    }
}