package Class_Ex;

import java.util.Scanner;
import java.util.ArrayList;

public class Employee {
    private int id;
    private String name;
    private int age;
    private String department;
    private String code;
    private float salary_rate;

    public Employee() {
        id = 0;
        name = "Unknown";
        age = 0;
        department = "Unknown";
        salary_rate = 0;
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

    public float getSalary_rate() {
        return salary_rate;
    }

    public void setSalary_Rate(int salary_rate) {
        this.salary_rate = salary_rate;
    }

    public static void main(String[] args) {
        ArrayList<Employee> ListEmp = new ArrayList<>();
        int SLNV;
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap so luong nhan vien: ");
        SLNV = scan.nextInt();
        scan.nextLine();
        for (int i = 0; i < SLNV; i++) {
            System.out.println("Nhan vien thu: " + (i + 1) + ":");
            Employee empl = new Employee();
            empl.Nhap();
            ListEmp.add(empl);
        }

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
                    System.out.println("Nhap thong tin nhan vien:");
                    Employee empl = new Employee();
                    empl.Nhap();
                    ListEmp.add(empl);
                    System.out.println("Them nhan vien thanh cong.");
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
