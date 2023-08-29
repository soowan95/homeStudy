class I {
    int i, j;
    //public I(){} //기본생성자를 생성하지 않으면 상속받는 I2에서 오류가 발생, 하지만 line15에서 super을 통해 부모클래스의 생성자를 가지고 옮으로 해결 가능
    public I(int i, int j) {
        this.i = i;
        this.j = j;
    }
    public void plus() {
        System.out.println(i + j);
    }
}

class I2 extends I {
    public I2(int i, int j) {
        super(i, j);
    }
    public void minus() {
        System.out.println(i - j);
    }
    public void plus() { //Overriding
        System.out.println(i + j + 10);
    }
}

public class InheritDemo {
    public static void main(String[] args) {
        I m = new I2(3, 2); //I2의 생성자이지만 I의 데이터타입을 가지고 있음. overriding을 했을 때는 I의 plus가 아닌 I2의 plus가 쓰임.
        m.plus();
        //m.minus(); //I에는 minus가 정의 돼 있지 않으므로 I의 데이터타입을 가지고 있는 m은 minus를 사용할 수 없음.
    }
    
}
