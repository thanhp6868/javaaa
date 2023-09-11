import java.util.*;

public class quanLyHocSinh {

    public static ArrayList<Student> listStudents = new ArrayList<>();

    public static void nhap() {
        System.out.println("Nhap so luong hoc sinh: ");
        int n = sc.nextInt();
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

            System.out.println("Dia chi :");
            String diachi = sc.nextLine();

            Student newStudent = new Student();
            newStudent.SetStudent(id, name, namsinh, diem, diachi);
            listStudents.add(newStudent);

        }
    }

    public static void sort() {
        int n = listStudents.size();
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

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Chọn chức năng: ");
            System.out.println("1. Nhap danh sach Hoc sinh");
            System.out.println("2. Sap xep danh sach hoc sinh theo diem tang dan");
            System.out.println("3. Hoc sinh co dtb cao nhat");
            System.out.println("4. Hoc sinh dia chi o Hai Phong");
            System.out.println("5. Thoat");

            int choice;
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    nhap();
                    break;
                case 2:
                    sort();
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
                    System.out.println("\nsinh vien co dia chi o Hai Phong: ");
                    for (int i = 0; i < listStudents.size(); i++) {
                        Student st1 = listStudents.get(i);

                        if (st1.getDiaChi().toString().toLowerCase().contains("hai phong")) {
                            st1.printStudent();
                        }
                    }
                    break;
                case 5:
                    System.out.println("Thoat chuong trinh");
                    sc.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Chon khong hop le, vui long chon lai");
                    break;
            }
        }
    }

    public static class Student {
        int MaSV;
        String HoTen;
        int NamSinh;
        double DiemTB;
        String DC;

        public void SetStudent(int ma, String ten, int nam, double diem, String diachi) {
            this.MaSV = ma;
            this.HoTen = ten;
            this.NamSinh = nam;
            this.DiemTB = diem;
            this.DC = diachi;

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

        public String getDiaChi() {
            return this.DC;
        }

        public void sapXepHSTheoDiemTangDan() {

        }

        public void printStudent() {
            System.out.println("Ma:" + this.MaSV);
            System.out.println("ten:" + this.HoTen);
            System.out.println("nam sinh:" + this.NamSinh);
            System.out.println("Diem:" + this.DiemTB);
            System.out.println("Dia chi:" + this.DC);

        }

    }

}
