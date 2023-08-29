public class OperatorDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        float c = 10.0F;
        float d = 3.0F;

        System.out.println(a/b); //10나누기 3은 3.333333의 무한 소수지만 데이터타입 int는 정수이므로 3이 출력됨.
        System.out.println(c/d); 
        System.out.println(a/d); //int 타입의 a와 float 타입의 d를 연산하는 과정에서 데이터타입을 같게 하기위해 더 넓은 표현범위를 가진 float으로 자동 형 변환된 모습.
        System.out.println(a%d); //위의 예제와 마찬가지로 float으로 자동 형 변환 되고 10/3 = 3*3+1 이므로 나머지인 1의 실수 표현인 1.0이 출력됨.
    }
    
}
