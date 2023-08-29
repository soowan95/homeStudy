public class LoopDemo {
    public static void main(String[] args) {
        int i = 0; //초기화
        while(i<10) { //종료 조건
            System.out.println(i);
            i++; //반복 실행
        }

        for(int j = 0; j < 10; j++) {
            System.out.println(j);
        }
    }
}