public class PrePostDemo {
    public static void main(String[] args) {
        int i = 3;
        i++;
        System.out.println(i); //4 출력
        ++i;
        System.out.println(i); //5 출력
        System.out.println(++i); //6 출력, ++가 숫자 앞에 있으면 1을 더하는 행동을 먼저함.
        System.out.println(i++); //6 출력, ++가 숫자 뒤에 있으면 변수가 먼저 사용된 뒤 1을 더함.
        System.out.println(i); //7 출력

    }
    
}
