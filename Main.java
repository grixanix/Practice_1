// 2. От 1 до n
//Дано натуральное число n. Выведите все числа от 1 до n.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a = 0;
        Scanner ch = new Scanner(System.in);
        int n = ch.nextInt();
        recursion(a, n);
    }

    public static int recursion(int a, int n) {
        if (a < n) {
            a++;
            System.out.println(a);
            return recursion(a, n);
        } else
            return 0;
    }
}
