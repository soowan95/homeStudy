public class ScopeDemo {
    static int i; //전역변수

    static void a() {
        int i = 10; //지역변수, 이 메소드안에서 i를 새롭게 지정하지 않았다면 i는 전역변수가 되고 밑의 for문에서 i가 계속 0으로 입력되며 무한루프에 빠짐.
        System.out.println(i);
    }

    public static void main(String[] args) {
        for (i = 0; i<3; i++) { // 이때 쓰인 i 는 전역변수 i임. 그러므로 무한루프에 빠지지 않고 실행됨.
            a();
            System.out.println(i);
        }
    }
}