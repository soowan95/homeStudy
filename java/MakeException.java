class Cal3 {
    int left, right;
    public void set(int left, int right) {
        if(right == 0){
            throw new IllegalArgumentException("두번째 인자는 0을 허용하지 않습니다.");
        }
        this.left = left;
        this.right = right;
    }
    public void div() {
        // if(right == 0){
        //    throw new ArithmeticException("0으로 나눌 수 없습니다.");
        //}
        try {
            System.out.print("계산결과는");
            System.out.print(this.left/this.right);
            System.out.print("입니다.");
        } catch(Exception e) {
            System.out.println("\n\ne.getMessage()\n"+e.getMessage());
            System.out.println("\n\ne.toString()\n"+e.toString());
            System.out.println("\n\ne.printStackTrace()");
            e.printStackTrace();
        }
    }
}

public class MakeException {
    public static void main(String[] args) {
        Cal3 c1 = new Cal3();
        c1.set(10,0);
        c1.div();
    }
    
}
