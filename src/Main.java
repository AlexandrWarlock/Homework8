import javax.swing.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача 1.1");
        int[] arr = new int[3];
        for (int index = 0; index < arr.length; index++) {
            arr[index] = index + 1;
            System.out.println(arr[index]);
        }
        System.out.println("Задача 1.2");
        double[] array1 = {1.57, 7.654, 9.986};
        for (int i = 0; i < 3; i++) {
            System.out.println(array1[i]);
        }
        System.out.println("Задача 1.3");
        int[] array2 = new int[5];
        for (int i = 0; i < 5; i++) {
            array2[0] = 5;
            System.out.println(array2[i]);
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] arr = new int[3];
        for (int index = 0; index < arr.length; index++) {
            arr[index] = index + 1;
            if (index == arr.length - 1) {
                System.out.println(arr[index] + " ");
                break;
            }
            System.out.print(arr[index] + ", ");
        }
        double[] array1 = {1.57, 7.654, 9.986};
        for (int i = 0; i < array1.length; i++) {
            if (i == array1.length - 1) {
                System.out.println(array1[i] + " ");
                break;
            }
            System.out.print(array1[i] + ", ");
        }
        int[] array2 = new int[5];
        for (int i = 0; i < array2.length; i++) {
            array2[0] = 5;
            if (i == array2.length - 1) {
                System.out.println(array2[i] + " ");
                break;
            }
            System.out.print(array2[i] + ", ");
        }
    }
    public static void task3 () {
        System.out.println("Задача 3");
        int[] arr = new int[3];
        for (int index = 2; index < arr.length; index--) {
            arr[index] = index + 1;
            if (index == 0) {
                System.out.println(arr[index] + " ");
                break;
            }
            System.out.print(arr[index] + ", ");
        }
        double[] array1 = {1.57, 7.654, 9.986};
        for (int i = 2; i < array1.length; i--) {
            if (i == 0) {
                System.out.println(array1[i] + " ");
                break;
            }
            System.out.print(array1[i] + ", ");
        }
        int[] array2 = new int[5];
        for (int i = 4; i < array2.length; i--) {
            array2[0] = 5;
            if (i == 0) {
                System.out.println(array2[i] + " ");
                break;
            }
            System.out.print(array2[i] + ", ");
        }
    }
    public static void task4 () {
        System.out.println("Задача 4");
        int[] arr = {1, 2, 3};
        for (int i = 0; i < arr.length; i++)
            if (arr[i] % 2 != 0) {
                arr[i] += 1;
            }
        System.out.println(Arrays.toString(arr));
    }
}

