import java.util.Scanner;

public class FindValueInArray {
   static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String[] student = {"Lan","Mai","Hoa","Hùng","Dũng","Nga","Loan"};
        findNameStudent(student);
    }

    private static void findNameStudent(String [] student) {
        System.out.print("nhập tên sinh viên cần tìm: ");
        String findName = sc.nextLine();
        boolean isExit = false;
        for (int i = 0; i<student.length;i++){
            if(findName.equals(student[i])){
                System.out.println("Sinh viên "+findName+" có trong danh sách ở vị trí "+i);
                isExit = true;
                break;
            }
        }
        if(isExit == false){
            System.out.println("Sinh viên "+findName+" không có trong danh sách");
        }
    }

}