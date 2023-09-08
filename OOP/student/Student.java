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
        System.out.println("Diem:" + this.DiemTB + "\n");

    }

}