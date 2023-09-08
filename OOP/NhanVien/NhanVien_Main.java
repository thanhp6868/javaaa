import java.util.*;

public class NhanVien_Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ClassNhanVien> listNhanViens = new ArrayList<>();

        while (true) {
            System.out.println("Chọn chức năng: ");
            System.out.println("1. Nhap danh sach nhan vien");
            System.out.println("2. Sap xep danh sach nhan vien theo nam sinh");
            System.out.println("3. Thoat");

            int n;
            int choice;
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("nhap so luong nhan vien ");
                    n = sc.nextInt();
                    sc.nextLine();

                    for (int i = 0; i < n; i++) {
                        System.out.println("nhan vien thu " + (i + 1) + ":");

                        System.out.println("ma :");
                        int id = sc.nextInt();
                        sc.nextLine();

                        System.out.println("Ten  :");
                        String name = sc.nextLine();

                        System.out.println("Nam sinh :");
                        int namsinh = sc.nextInt();
                        sc.nextLine();

                        ClassNhanVien e = new ClassNhanVien();
                        e.setClassNhanVien(id, name, namsinh);
                        listNhanViens.add(e);
                    }
                    break;
                case 2:
                    n = listNhanViens.size();
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < n - i - 1; j++) {
                            ClassNhanVien nv1 = listNhanViens.get(j);
                            ClassNhanVien nv2 = listNhanViens.get(j + 1);

                            if (nv1.getNamSinh() > nv2.getNamSinh()) {
                                listNhanViens.set(j, nv2);
                                listNhanViens.set(j + 1, nv1);
                            }
                        }
                    }

                    for (ClassNhanVien nv : listNhanViens) {
                        nv.printNhanVien();
                    }
                    break;
                case 3:
                    System.out.println("Cut!!! ");
                    sc.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Nhap lai");
                    break;
            }
        }
    }
}
