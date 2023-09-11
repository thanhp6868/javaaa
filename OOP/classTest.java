import java.util.*;

public class classTest {
    Vector list = new Vector();

    public classTest() {
        while (true) {
            System.out.println("-CHUONG TRINH QUAN LY SINH VIEN -*");
            System.out.println("-Chuc nang chinh chuong trinh -*");
            System.out.println("   1. Nhap danh sach sinh vien");
            System.out.println("   2. Xem danh sach sinh vien");
            System.out.println("   3. Sap xep danh sach sinh vien tang dan diem trung binh ");
            System.out.println("   4. Tim sinh vien theo ten");
            System.out.println("   5. Thoat ");
            System.out.println("-------------------------");
            int num;
            Scanner keyboard = new Scanner(System.in);
            System.out.println(" Nhap mot so de chon chuc nang");
            num = keyboard.nextInt();
            switch (num) {
                case 1:
                    this.input();
                    break;
                case 2:
                    this.view();
                    break;
                case 3:
                    sort();
                    break;
                case 4:
                    search();
                    break;
                case 5:
                    System.out.println(" --------- Chuon trinh ket thuc ----------");
                    return;
            }
        }
    }

    public void input() {
        int num;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Nhap so luong sinh vien");
        num = keyboard.nextInt();
        for (int i = 1; i <= num; i++) {
            System.out.println("Nhap thong tin sinh vien thu: " + i);
            System.out.println("   ID:  ");
            int id = Integer.parseInt(keyboard.next());
            keyboard.nextLine();
            System.out.println("   ten: ");
            String name = keyboard.nextLine();
            System.out.println("  diem trung binh:  ");
            float aver = keyboard.nextFloat();
            Student st = new Student(id, name, aver);
            list.add(st);
        }
        System.out.println("\n----------------\n");
    }

    public void view() {
        System.out.println("   Thong tin danh sach sinh vien");
        Enumeration vEnum = list.elements();
        int i = 1;
        while (vEnum.hasMoreElements()) {
            Student sts = (Student) vEnum.nextElement();
            System.out.println(
                    "   " + i + ". ID=" + sts.getID() + ", ten=" + sts.getName() + ", Diem TB=" + sts.getAver());
            i++;
        }
        System.out.println("\n----------------\n");
    }

    public void sort() {
        Student[] sts = new Student[list.size()];
        int index = 0;
        Enumeration vEnum = list.elements();
        while (vEnum.hasMoreElements()) {
            sts[index] = (Student) vEnum.nextElement();
            index++;
        }
        Arrays.sort(sts);
        System.out.println("\n Danh sach sinh vien sau khi sap xep--");
        for (index = 0; index < sts.length; index++) {
            System.out.println("   " + (index + 1) + ". ID=" + sts[index].getID() + ", ten=" + sts[index].getName()
                    + ", Diem TB=" + sts[index].getAver());
        }
        System.out.println("\n----------------\n");
    }

    public void search() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Nhap sinh vien can tim");
        String name = keyboard.nextLine();
        Enumeration vEnum = list.elements();
        System.out.println("\nThong tin tim kiem duoc");
        while (vEnum.hasMoreElements()) {
            Student sts = (Student) vEnum.nextElement();
            if (sts.getName().indexOf(name) != -1)
                System.out.println("ID=" + sts.getID() + ", ten=" + sts.getName() + ", Diem TB=" + sts.getAver());
        }
        System.out.println("\n----------------\n");
    }

    public static void main(String[] args) {
        new classTest();
    }
}

class Student implements Comparable {
    private int id;
    private String name;
    private float aver;

    public Student() {
        name = new String("");
        id = 0;
        aver = 0;
    }

    public Student(int i, String n, float a) {
        name = n;
        id = i;
        aver = a;
    }

    public String getName() {
        return name;
    }

    public int getID() {
        return id;
    }

    public float getAver() {
        return aver;
    }

    public int compareTo(Object other) {
        Student otherStd = (Student) other;
        return (int) (this.aver - otherStd.aver);
    }
}
