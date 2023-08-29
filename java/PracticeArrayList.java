import java.util.ArrayList;

public class PracticeArrayList {
    public static void main(String[] args) {
        String[] arrayObj = new String[2];
        arrayObj[0] = "one";
        arrayObj[1] = "two";
        //arrayObj[2] = "three";
        //배열의 크기보다 더 많은 정보를 넣을라 해서 컴파일 오류 발생
        for(int i = 0; i<arrayObj.length; i++) {
            System.out.println(arrayObj[i]);
        }

        ArrayList<String> al = new ArrayList<String>();
        al.add("one");
        al.add("two");
        al.add("three");
        for(int i = 0 ; i<al.size(); i++) {
            String value = al.get(i);
            //add의 인자로는 모든 데이터형이 올 수 있으므로 add의 데이터형은 Object이다.
            System.out.println(i+1+"번째 값은:"+value);
        }
    }
    
}
