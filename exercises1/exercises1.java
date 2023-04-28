package exercises1;

public class exercises1 {

    private String name;
    private int price;

    public exercises1(String name, int price) {
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
        exercises1 A = new exercises1("Brum, ",100);
        System.out.println(A.toString());
    // a.setPrice(10000);  System.out.println(a.toString());

    }
}
