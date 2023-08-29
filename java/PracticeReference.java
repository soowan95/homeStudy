class A2{
    public int id;
    A2(int id){
        this.id = id;
    }
}

public class PracticeReference {

    public static void runValue() {
        int a = 1;
        int b = a;
        b = 2;
        System.out.println("runValue, "+a);
        System.out.println(b);
    }

    public static void runReference() {
        A2 a = new A2(1);
        A2 b = a;
        b.id = 2;
        System.out.println("runReference, "+a.id);
    }
    
    public static void main(String[] args) {
        runValue();
        runReference();
    }
}
