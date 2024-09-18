package Students;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class StudentsManager {
    private ArrayList<Students> studentsList = new ArrayList<Students>();
    private static StudentsManager instance = new StudentsManager();

    public StudentsManager(ArrayList<Students> studentsList) { //constructor
        this.studentsList = studentsList;
    }
    public StudentsManager() { // constructor
        this.studentsList = new ArrayList<Students>();
    }
    public void addStudent(int id, String name, int phone,String country,String classroom) {
        Students s = new Students(id, name, phone, country, classroom);
        studentsList.add(s);
        System.out.println("Thêm sinh vien thành công");
    }
    public void showStudents() {  // hien thi sinh vien
        if (!studentsList.isEmpty()) {
            for (Students s : studentsList) {
                System.out.println(s.toString());
            }
        } else {
            System.out.println("Danh sách sinh viên trống");
        }
    }
    public void sortByName() {     // sap xep theo ten
        if (studentsList.isEmpty()) {
            System.out.println("Danh sách sinh viên trống");
        } else {
            Collections.sort(studentsList, new Comparator<Students>() {
                public int compare(Students s1, Students s2) {
                    return s1.getName().compareTo(s2.getName());
                }
            });
            System.out.println("Danh sách sinh viên sau khi sắp xếp");
            showStudents(); // hien thi sinh vien sau khi sap xep
        }

    }
    public void deleteStudent(int id) { // xoa theo ma
        if (studentsList.isEmpty()) {
            System.out.println("Danh sách sinh viên trống");
        }
        else {
            Students s = checkStudent(id);
            studentsList.remove(s);
            System.out.println("Xóa thành công sinh viên có mã: "+ id);
        }
    }
    public Students checkStudent(int id) {
        for (Students stu : studentsList) {
            if (stu.getId() == id) {
                return stu;
            }
        }
        return null;
    }

}