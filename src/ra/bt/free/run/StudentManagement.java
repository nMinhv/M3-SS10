package ra.bt.free.run;

import ra.bt.free.Student;

import java.util.*;

public class StudentManagement {
    static ArrayList<Student> studentList = new ArrayList<Student>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        studentList.add(new Student(1, "a", "a", "a", 1, true));
        studentList.add(new Student(2, "b", "b", "b", 2, false));
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
                    updateStudent(scanner);
                    break;
                case 3:
                    removeStudent(scanner);
                    break;
                case 4:
                    searchStudent(scanner);
                    break;
                case 5:
                    break;
                case 6:
                    for (Student data : studentList
                    ) {
                        data.display();
                    }
                    break;
                case 7:
                    Collections.sort(studentList, new Comparator<Student>() {
                        @Override
                        public int compare(Student student1, Student student2) {
                            return Double.compare(student1.getMark(), student2.getMark());
                        }
                    });
                    break;
                case 8:
                    Collections.sort(studentList, new Comparator<Student>() {
                        @Override
                        public int compare(Student student1, Student student2) {
                            return Double.compare(student2.getMark(), student1.getMark());
                        }
                    });
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
    public static void updateStudent(Scanner sc) {
        System.out.println("Nhập Id sinh viên cần sửa");
        int idUpdate = Integer.parseInt(sc.nextLine());
        int index = -1;
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getStudentId() == idUpdate) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("Mã học sinh không tồn tại");
        } else {
            Student updateStudent = studentList.get(index);

            System.out.println("Nhập Tên học viên");
            updateStudent.setName(sc.nextLine());

            System.out.println("Nhập địa chỉ");
            updateStudent.setAddress(sc.nextLine());

            System.out.println("Nhập số điện thoại");
            updateStudent.setPhone(sc.nextLine());

            System.out.println("Nhập giới tính");
            updateStudent.setSex(Boolean.parseBoolean(sc.nextLine()));

            System.out.println("Nhập điểm");
            updateStudent.setMark(Double.parseDouble(sc.nextLine()));

            studentList.set(index, updateStudent);
            System.out.println("Bạn đã đổi thông tin thành công");
        }
    }

    // 3. Xoá học sinh
    public static void removeStudent(Scanner scanner) {
        System.out.println("Nhập Id sinh viên cần xoá");
        int idRemove = Integer.parseInt(scanner.nextLine());
        int index = -1;
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getStudentId() == idRemove) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("Mã học sinh cần xoá không tìm thấy");
        } else {
            studentList.remove(index);
        }
    }

    // Tìm kiếm theo Id
    public static void searchStudent(Scanner sc) {
        System.out.println("Nhập Id sinh viên cần tìm kiếm");
        int idSearch = Integer.parseInt(sc.nextLine());
        int index = -1;
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getStudentId() == idSearch) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("Học sinh không tìm thấy");
        } else {
            studentList.get(index).display();
        }
    }

}
