import java.util.Scanner;

public class FindMax {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        findMax();

    }


    private static void findMax() {
        int[] a;
        System.out.print("Nhập số lượng mảng ");
        int size = sc.nextInt();
        if (size > 10) {
            System.out.println("Bạn đã nhập quá nhiều");
        }

        a = new int[size];
        int i = 0;
        while (i < a.length) {
            System.out.println("nhập giá trị tài sản " + (i + 1) + " : ");
            a[i] = sc.nextInt();
            i++;
        }

        System.out.println("Tài sản đã nhập: ");
        for (int j = 0; j < a.length; j++) {
            System.out.println(a[j]);
        }

        int max = a[0];
        int k = 1;
        for (int j = 0; j < a.length; j++){
            if(a[j]>max){
                max = a[j];
                k = j+1;
            }
        }
        System.out.println("Giá trị lớn nhất là: "+max+" tại vị trí: "+k);
    }
}