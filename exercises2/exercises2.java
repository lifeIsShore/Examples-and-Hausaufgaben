package exercises2;

public class exercises2 {
    private int numLegs;
    public exercises2(int a) {
        this.numLegs=a;
    }
    public int getLegs() {
        return numLegs;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        exercises2 a=new exercises2(4);
        System.out.println(a.getLegs());
    }

}
