package ra.bt.free;

import ra.bt.free.service.StudentService;

import java.util.Scanner;

public class Student implements StudentService {

    private int studentId;
    private String address, phone, name;
    private double mark;
    private boolean sex;

    public Student() {
    }

    public Student(int studentId, String address, String phone, String name, double mark, boolean sex) {
        this.studentId = studentId;
        this.address = address;
        this.phone = phone;
        this.name = name;
        this.mark = mark;
        this.sex = sex;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    @Override
    public void input(Scanner scanner) {
        System.out.println("ID:");
        this.studentId = Integer.parseInt(scanner.nextLine());
        System.out.println("Name:");
        this.name = scanner.nextLine();
        System.out.println("Address:");
        this.address = scanner.nextLine();
        System.out.println("Phone:");
        this.phone = scanner.nextLine();
        System.out.println("Sex:");
        this.sex = Boolean.parseBoolean(scanner.nextLine());
        System.out.println("Mark:");
        this.mark = Double.parseDouble(scanner.nextLine());
    }

    @Override
    public void display() {
        System.out.printf("ID: %d - Name: %s - Sex: %s\n",this.studentId,this.name,this.sex?"Male":"Female");
        System.out.printf("Address: %s - Phone: %s - Mark: %f\n",this.address,this.phone,this.mark);
    }
}
