public class bai2_DeThi {
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

        public double getReal() {
            return this.real;
        }

        public double getImage() {
            return this.image;
        }

        public double modulus() {
            return sqrt(this.real * thi.real, this.image * this.image);
        }
    }
}
