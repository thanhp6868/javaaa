import java.util.*;

public class Student {
    int MaSV;
    String HoTen;
    int NamSinh;
    double DiemTB;

    public void SetStudent(int ma, String ten, int nam, double diem) {
        this.MaSV = ma;
        this.HoTen = ten;
        this.NamSinh = nam;
        this.DiemTB = diem;
    }

    public int getMaSV() {
        return this.MaSV;
    }

    public String getHoTen() {
        return this.HoTen;
    }

    public int getNamSinh() {
        return this.NamSinh;
    }

    public double getDiemTB() {
        return this.DiemTB;
    }

    public void sapXepHSTheoDiemTangDan() {

    }

    public void printStudent() {
        System.out.println("Ma:" + this.MaSV);
        System.out.println("ten:" + this.HoTen);
        System.out.println("nam sinh:" + this.NamSinh);
        System.out.println("Diem:" + this.DiemTB + "\n\n");
    }

}

public class quanLyHocSinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Student> listStudents = new ArrayList<>();

        while (true) {
            System.out.println("Chọn chức năng: ");
            System.out.println("1. Nhap danh sach Hoc sinh");
            System.out.println("2. Sap xep danh sach hoc sinh theo diem tang dan");
            System.out.println("3. In ra thong tin hoc sinh co DTB cao nhat");
            System.out.println("4. Thoat");

            int choice;
            choice = sc.nextInt();
            sc.nextLine();

            int n;
            switch (choice) {
                case 1:
                    System.out.println("Nhap so luong hoc sinh: ");
                    n = sc.nextInt();
                    sc.nextLine();
                    for (int i = 0; i < n; i++) {
                        System.out.println("Sinh vien thu" + (i + 1) + ":");
                        System.out.println("MSV :");
                        int id = sc.nextInt();
                        sc.nextLine();

                        System.out.println("Ten HS :");
                        String name = sc.nextLine();

                        System.out.println("Nam sinh :");
                        int namsinh = sc.nextInt();
                        sc.nextLine();

                        System.out.println("DiemTB :");
                        double diem = sc.nextDouble();
                        sc.nextLine();

                        Student newStudent = new Student();
                        newStudent.SetStudent(id, name, namsinh, diem);
                        listStudents.add(newStudent);
                    }
                    break;
                case 2:
                    n = listStudents.size();
                    // System.out.println(n);
                    for (int i = 0; i < n; i++) { // lấy từng đối tựogn để so sánh lần lượt với các đối tượng đứng sau
                        for (int j = 0; j < n - i - 1; j++) {
                            // System.out.println(i + " " + j);

                            Student st1 = listStudents.get(j);
                            Student st2 = listStudents.get(j + 1);
                            if (st1.getDiemTB() > st2.getDiemTB()) {
                                listStudents.set(j, st2);
                                listStudents.set(j + 1, st1);
                            }
                        }
                    }
                    System.out.println("In danh sach HS");
                    for (Student st : listStudents) {
                        st.printStudent();
                    }

                    break;
                case 3:
                    int vt = 0;
                    for (int i = 1; i < listStudents.size(); i++) {
                        Student st1 = listStudents.get(vt);
                        Student st2 = listStudents.get(i);
                        if (st1.getDiemTB() < st2.getDiemTB()) {
                            vt = i;
                        }
                    }
                    System.out.println("\nsinh vien co dtb cao nhat la: ");
                    Student st = listStudents.get(vt);
                    st.printStudent();
                    break;
                case 4:
                    System.out.println("Thoat chuong trinh");

                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Chon khong hop le, vui long chon lai");
                    break;
            }
        }
    }
}
