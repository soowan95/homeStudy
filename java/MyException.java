class DivideException extends RuntimeException{ //RuntiomeException을 상속받기 때문에 따로 예외처리를 하지 않아도 문제 없음.
    DivideException(){ // 기본생정자를 추가한 이유는 throw new를 통해 인스턴스로 사용하기 위해선 기본생성자가 있어야 하지만 파라미터를 정의한 생성자를 만들면 java가 자동으로 기본생성자를 만들어 주지 않기 때문.
        super();
    }
    DivideException(String message){
        super(message);
    }
}

class A1 {
    private int[] arr = new int[3];
    A1(){
        arr[0] = 0;
        arr[1] = 10;
        arr[2] = 20;
    }
    public void z(int first, int second) {
        try {
            System.out.println(arr[first] / arr[second]);
        } catch(ArithmeticException e){
            System.out.println("수학적 오류");
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("배열 범위 오류");
        }
        if(arr[second] == 0){
            throw new DivideException("0으로 나눌 수 없습니다.");
        }
    }
}

public class MyException {
    public static void main(String[] args) {
        A1 a = new A1();
        a.z(10,1);
        a.z(1,0); 
    }
}
