import java.util.*;

class NhanVien{
    private int ID;
    private String HoVaTen;
    private int NamSinh;
    
    public NhanVien(int ID, String HoVaTen, int NamSinh){
        this.ID = ID;
        this.HoVaTen = HoVaTen;
        this.NamSinh = NamSinh;
    }

    public int getID(){
        return ID;
    }

    public String getName(){
        return HoVaTen;
    }

    public int getNamSinh(){
        return NamSinh;
    }

    @Override
    public String toString(){
        return "ID: " + ID + ", Họ và tên: " + HoVaTen + ", Năm sinh: " + NamSinh;
    }
}

public class chuong_trinh_quan_li_NV {
    public static void main(String[] args){
        ArrayList<NhanVien> listNV = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("Chọn chức năng: ");
            System.out.println("1. Nhập danh sách Nhân Viên");
            System.out.println("2. Sắp xếp danh sách Nhân Viên theo năm sinh");
            System.out.println("3. Thoát");  
            
            
        int choice = scanner.nextInt();
        scanner.nextLine();

        int n;
        switch(choice) {
            case 1:
            System.out.println("Nhập số lượng nhân viên: ");
            n = scanner.nextInt();
            scanner.nextLine();

            for(int i = 0; i < n; i++) {
                System.out.println("Nhập thông tin nhân viên thứ $" + (i+1));
                System.out.println("Nhập ID:");
                int id = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Nhập Họ và tên: ");
                String fullName = scanner.nextLine();
                System.out.println("Nhập Năm sinh: ");
                int year = scanner.nextInt();
                scanner.nextLine();

                NhanVien nv = new NhanVien(id, fullName, year);
                listNV.add(nv);
            }
            break;

            case 2:
            n = listNV.size();

            for(int i = 0; i < n - 1; i++){
                for(int j = 0; j < n - i - 1; j++){
                    NhanVien nv1 = listNV.get(j);
                    NhanVien nv2 = listNV.get(j + 1);
                    if(nv1.getNamSinh() > nv2.getNamSinh()){
                        listNV.set(j, nv2);
                        listNV.set(j + 1, nv1);
                    }
                }
            }
            System.out.println("Danh sách Nhân viên sau khi sắp xếp theo năm sinh:");
            for(NhanVien nv: listNV){
                System.out.println(nv);
            }
            break;
            
            case 3:
            System.out.println("Kết thúc chương trình.");
            scanner.close();
            System.exit(0);
            default:
            System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            break;
        }
    }
}
}