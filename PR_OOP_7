
// Задача 1 Игра в "пьяницу"

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Game.Games();
    }
}



class Game {

    public static void Games() {

        int[] a1 = new int[5];
        for (int i = 0; i < a1.length; i++)
        {
            a1[i] = ((int) (Math.random() * 10));
            System.out.print(a1[i] + " ");
        }
        System.out.println();

        int[] a2 = new int[5];
        for (int i = 0; i < a2.length; i++)
        {
            a2[i] = ((int) (Math.random() * 10));
            System.out.print(a2[i] + " ");
        }
        System.out.println("\n");

        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arr1.add(a1[i]);
            arr2.add(a2[i]);
        }

        int count = 0;
        boolean res = false;

        for (int i = 0; i < 106; i++) {
            count++;
            if (arr1.get(0) > arr2.get(0) || ((arr1.get(0) == 0) && (arr2.get(0) == 9))) {
                arr1.add(arr1.get(0));
                arr1.add(arr2.get(0));
            } else if (arr1.get(0) < arr2.get(0) || ((arr1.get(0) == 9) && (arr2.get(0) == 0))) {
                arr2.add(arr2.get(0));
                arr2.add(arr1.get(0));
            }
            arr1.remove(0);
            arr2.remove(0);

            if (arr1.size() == 0) {
                System.out.println("Second " + count);
                res = true;
                break;
            } else if (arr2.size() == 0) {
                System.out.println("First " + count);
                res = true;
                break;
            }
        }
        if (!res) System.out.println("Botva!");
    }
}
