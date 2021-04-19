import java.util.Scanner;

public class FindMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập số lượng số nhập vào: ");
        int size = sc.nextInt();

        if (size > 10) {
            System.out.println("bạn nhập quá nhiều");
        }

        int[] array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Nhập số thứ " + (i + 1) + " vào: ");
            int number = sc.nextInt();
            array[i] = number;
            i++;
        }
        int min = array[0];
        for (int j = 0; j < array.length; j++) {
            if (min > array[j]) {
                min = array[j];
            }
        }
        System.out.print(" số nhỏ nhất là: " + min);
    }
}
