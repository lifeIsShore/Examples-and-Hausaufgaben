package exercises4;

public class BMI {
        private double weight;
        private double height;

        public BMI(double weight, double height) {
            this.weight = weight;
            this.height = height;
        }

        public void setWeight(double weight) {
            this.weight = weight;
        }

        public void setHeight(double height) {
            this.height = height;
        }

        public double getWeight() {
            return weight;
        }

        public double getHeight() {
            return height;
        }

        public double getBMI() {
            return weight / (height * height);
        }



        public static void main(String[] args) {
            BMI bmi = new BMI(90, 1.89);
            bmi.setWeight(95);
            bmi.setHeight(1.82);
            System.out.println("BMI: " + bmi.getBMI());
	}
}


