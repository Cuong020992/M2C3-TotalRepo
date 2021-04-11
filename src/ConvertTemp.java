import java.util.Scanner;

public class ConvertTemp {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        program();
    }

    private static void program() {

        double c, f;
        int choice = -1;
        do{
            menu();
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("nhập nhiệt độ F: ");
                    f = sc.nextDouble();
                    c = (5.0 / 9) * (f - 32);
                    System.out.println(" độ C: "+c);
                    System.out.println(" ");
                    break;
                case 2:
                    System.out.print("nhập nhiệt độ C: ");
                    c = sc.nextDouble();
                    f = (9.0 / 5) * c + 32;
                    System.out.println("độ F: "+f);
                    System.out.println("");
                    break;
                case 0:
                    System.exit(0);
            }
        }while(choice != 0);

    }

    private static void menu() {
        System.out.println("Menu");
        System.out.println("0. Exit");
        System.out.println("1. F to C");
        System.out.println("2. C to F");
        System.out.print("Nhập lựa chọn: ");

    }


}
