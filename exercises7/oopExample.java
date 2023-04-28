package exercises7;

public class oopExample {



        private String name;
        private int price;

        public oopExample(String name, int price) {
            this.name=name;
            this.price=price;
        }
        public String getName() {
            return name;
        }
        public int getPrice() {
            return price;
        }
        public void setName(String name) {
            // name=a;
        }
        public void setPrice(int b) {
            price=b;
        }
        public String toString() {
            String template= "name: "+name+"price: "+price+'$';
            return template;
        }
        public static void main(String[] args) {

        }

    }

