import Students.StudentsManager;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static StudentsManager studentsManager = new StudentsManager();

    public static void menu() {
        System.out.println("--------------------------------");
        System.out.println("     MENU QUẢN LÝ SINH VIÊN     ");
        System.out.println("--------------------------------");
        System.out.println("1. Thêm sinh viên");
        System.out.println("2. Hiển thị danh sách sinh viên");
        System.out.println("3. Sắp xếp sinh viên theo tên");
        System.out.println("4. Xóa sinh viên theo mã");
        System.out.println("0. Thoát");
        System.out.print("Lựa chọn của bạn: ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choose = 0;
        do {
            menu();
            choose = sc.nextInt();
        //    sc.close();
            switch (choose) {
                case 1:
                    try {
                        System.out.print("Nhập mã sinh viên: ");
                        int msv = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Nhập tên sinh viên:  ");
                        String ten = sc.nextLine();
                        System.out.print("Nhap SĐT sinh vien: ");
                        int sdt = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Nhập quê quán sinh viên: ");
                        String queQuan = sc.nextLine();
                        System.out.print("Nhập lớp sinh viên: ");
                        String lop = sc.nextLine();
                        studentsManager.addStudent(msv, ten, sdt, queQuan, lop);
                    } catch (InputMismatchException e) {
                        System.out.println("Lỗi dữ liệu đầu vào");
                    }

                    break;
                case 2:
                    studentsManager.showStudents();
                    break;
                case 3:
                    studentsManager.sortByName();
                    break;
                case 4:
                    System.out.println("Nhập mã sinh viên cần xóa: ");
                    try {
                        int x = sc.nextInt();
                        studentsManager.deleteStudent(x);
                    } catch (InputMismatchException e) {
                        System.out.println("Mã sinh viên chỉ được nhập số");
                    }
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại");
                    break;
            }
        } while (choose != 0);


    }

}
