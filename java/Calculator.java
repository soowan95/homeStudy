class Cal {
    int left, right;

    public void set(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public void sum() {
        System.out.println(this.left + this.right);
    }

    public void avg() {
        System.out.println((this.left + this.right)/2);
    }

    public void mul() {
        System.out.println(this.left * this.right);
    }

    public void div() {
        System.out.println(this.left/this.right);
    }
}

public class Calculator {
    public static void main(String[] args) {
        Cal c1 = new Cal();
        c1.set(20,5);
        c1.div();
        c1.sum();
    }
}