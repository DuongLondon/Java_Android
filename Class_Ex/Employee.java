package Class_Ex;

import java.util.Scanner;
import java.util.ArrayList;

public class Employee {
    private int id;
    private String name;
    private int age;
    private String code;
    private String department;
    private double salary_rate;

    public Employee(int id, String name, int age, String code, String department, double salary_rate) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.code = code;
        this.department = department;
        this.salary_rate = salary_rate;
    }

    public void Nhap() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap ID Nhan Vien: ");
        id = scan.nextInt();
        scan.nextLine();
        System.out.println("Nhap Ten nhan vien: ");
        name = scan.nextLine();
        System.out.println("Nhap Tuoi nhan vien: ");
        age = scan.nextInt();
        scan.nextLine();
        System.out.println("Nhap ma nhan vien: ");
        code = scan.nextLine();
        System.out.println("Nhap ten phong ban: ");
        department = scan.nextLine();
        System.out.println("Nhap he so luong: ");
        salary_rate = scan.nextFloat();
    }

    public void Xuat() {
        System.out.println("======================");
        System.out.println("||ID nhan vien: " + id + "||");
        System.out.println("||Ten nhan vien: " + name + "||");
        System.out.println("||Tuoi nhan vien: " + age + "||");
        System.out.println("||Ma nhan vien: " + code + "||");
        System.out.println("||Phong ban nhan vien: " + department + "||");
        System.out.println("||He so luong: " + salary_rate + "||");
        System.out.println("======================");
    }

    public int getID() {
        return id;
    }

    public void setID(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public double getSalary_rate() {
        return salary_rate;
    }

    public void setSalary_Rate(int salary_rate) {
        this.salary_rate = salary_rate;
    }

    public static void main(String[] args) {
        ArrayList<Employee> ListEmp = new ArrayList<>();
        // int SLNV;
        // System.out.println("Nhap so luong nhan vien: ");
        // SLNV = scan.nextInt();
        // scan.nextLine();
        // for (int i = 0; i < SLNV; i++) {
        // System.out.println("Nhan vien thu: " + (i + 1) + ":");
        // Employee empl = new Employee();
        // empl.Nhap();
        // ListEmp.add(empl);
        // }
        Employee em1 = new Employee(1, "Duong", 20, "cntt", "d01", 5.0);
        ListEmp.add(em1);
        Employee em2 = new Employee(2, "Huyen", 18, "kt", "h02", 6.0);
        ListEmp.add(em2);
        Employee em3 = new Employee(3, "Tam", 20, "cntt", "t03", 3.0);
        ListEmp.add(em3);
        Employee em4 = new Employee(4, "Hung", 21, "vp", "h04", 9.0);
        ListEmp.add(em4);
        Employee em5 = new Employee(5, "Huong", 22, "ns", "h05", 2.0);
        ListEmp.add(em5);
        Employee em6 = new Employee(6, "Vinh", 19, "kt", "v06", 4.0);
        ListEmp.add(em6);
        Employee em7 = new Employee(7, "Tuan", 25, "tdh", "t07", 7.0);
        ListEmp.add(em7);
        Employee em8 = new Employee(8, "Phong", 30, "ls", "p08", 3.0);
        ListEmp.add(em8);
        Employee em9 = new Employee(9, "Bao", 26, "tc", "b09", 9.0);
        ListEmp.add(em9);
        Employee em10 = new Employee(10, "Ngoc", 27, "tnn", "n10", 10.0);
        ListEmp.add(em10);

        Scanner scan = new Scanner(System.in);

        int choice = 0;
        do {
            System.out.println("========");
            System.out.println("Chon: ");
            System.out.println("1. Them nhan vien");
            System.out.println("2. Xoa nhan vien");
            System.out.println("3. In danh sach");
            choice = scan.nextInt();
            scan.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Them nhan vien.");
                    Employee empl = new Employee(0, "Uknown", 0, "Unknown", "Unknown", 0);
                    System.out.println("Nhap ID: ");
                    int new_id = scan.nextInt();
                    boolean isHave = false;
                    for (Employee emp : ListEmp) {
                        if (emp.getID() == new_id) {
                            isHave = true;
                            System.out.println("Nhan vien da ton tai.");
                            break;
                        }
                    }
                    if (!isHave) {
                        System.out.println("Nhap thong tin nhan vien moi:");
                        empl.Nhap();
                        ListEmp.add(empl);
                        System.out.println("Them nhan vien thanh cong.");
                        break;
                    }
                    break;
                case 2:
                    System.out.println("Xoa nhan vien.");
                    System.out.println("Nhap ID nhan vien can xoa: ");
                    int maNV = scan.nextInt();
                    boolean isExist = false;
                    for (Employee emp : ListEmp) {
                        if (emp.getID() == maNV) {
                            ListEmp.remove(emp);
                            isExist = true;
                            System.out.println("Xoa nhan vien thanh cong.");
                            break;
                        }
                    }
                    if (!isExist) {
                        System.out.println("Nhan vien khong ton tai.");
                    }
                    break;
                case 3:
                    System.out.println("In danh sach");
                    break;
                default:
                    System.out.println("Lua chon khong hop le.");
                    break;
            }
        } while (choice != 3);

        for (Employee empl : ListEmp) {
            empl.Xuat();
        }
        scan.nextLine();
        scan.close();
        System.exit(0);
    }
}
