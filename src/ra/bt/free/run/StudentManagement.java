package ra.bt.free.run;

import ra.bt.free.Student;

import java.util.*;

public class StudentManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Collection<Student> studentList = new ArrayList<Student>();
        studentList.add(new Student(1,"a","a","a",1,true));
        studentList.add(new Student(2,"b","b","b",2,false));
        while (true) {
            System.out.println("********** StudentManagement************ ");
            System.out.println("1:Thêm mới học sinh");
            System.out.println("2:Sửa học sinh");
            System.out.println("3:Xóa học sinh");
            System.out.println("4:Tìm kiếm học sinh theo studentId");
            System.out.println("5:Sắp xếp theo tên học sinh từ a-z");
            System.out.println("6:In ra danh sách học sinh");
            System.out.println("7:Sắp xếp điểm tăng dần");
            System.out.println("8:Sắp xếp điểm giảm dần");
            System.out.println("9:Thoát");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    Student newS = new Student();
                    newS.input(scanner);
                    studentList.add(newS);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    for (Student data: studentList
                         ) {
                        data.display();
                    }
                    break;
                case 7:
                    break;
                case 8:

                    break;

                case 9:
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    break;
            }
        }
    }

}
