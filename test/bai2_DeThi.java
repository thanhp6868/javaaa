import java.math.*;

public class bai2_DeThi {

    // de 1:
    public class De1_ComplexNumber {
        private double real;
        private double image;

        public De1_ComplexNumber(double re, double img) {
            this.real = re;
            this.image = img;
        }

        public De1_ComplexNumber(De1_ComplexNumber cpl) {
            this.real = cpl.real;
            this.image = cpl.image;
        }

        public String toString() {
            return this.real + this.image + "i";
        }
        // z= a + b* i

        public double getReal() {
            return this.real;
        }

        public double getImage() {
            return this.image;
        }

        public double modulus() {
            double modul = (double) this.real * thi.real + (double) this.image * this.image; //
            return sqrt(modul);
        }
    }

    // de 2
    public class Point {
        private double x;
        private double y;

        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public Point(Point newPoint) {
            this.x = newPoint.x;
            this.y = newPoint.y;
        }

        public String toString() {
            return "(" + this.x + "," + this.y + ")"; // (x,y)
        }

        public void move(double dx, double dy) {

        }

        public double distance(Point point) {
            double distan = (double) point.x * point.x + (double) point.y * point.y;
            return sqrt(distan);
        }

    }

    // de 4 - draft
    public class Battery {
        private double norminalVoltage;
        private double capacity;
        private int chargeCycle;

        public Battery(double volt, double capa, int charg) {
            this.norminalVoltage = volt;
            this.capacity = capa;
            this.chargeCycle = charg;
        }

        public double norminalEnergy() {
            return this.norminalVoltage * this.capacity;
        }

        public double estimate(double dischargePower) {
            return dischargePower;
        }

    }

    // de 5 - coupon
    public class Coupon {
        private String code;
        private double priceRatio;
        private boolean used;

        public Coupon(String code, double priceRatio) {
            this.code = code;
            this.priceRatio = priceRatio;
        }

        public Coupon(String code) {
            this.code = code;
            this.priceRatio = 0.9;
        }

    }
}
