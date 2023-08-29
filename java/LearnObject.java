class Practice implements Cloneable{ //Cloneable이라는 인터페이스를 구현 않으면 .clone()은 오류가 발생. Practice가 복제 가능하다는 것은 JVM에게 알려줘야 함. Cloneable은 비어있기 때문에 따로 구현할 것은 없음.
    String name;
    Practice(String name){
        this.name = name;
    }
    public boolean equals(Object obj){ //equals는 객체의 주소를 비교하는 연산자이기 때문에 변수의 String만을 비교하고 싶어서 overriding함.
        Practice p = (Practice) obj; //Object클래스에는 name이라는 변수가 없기 때문에 Object타입의 obj를 Practice 타입에 담아야 하고 Object데이터타입이 더 넓은 범위이기 때문에 강제로 형변환 시킴.
        return this.name == p.name;
    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}

public class LearnObject {
    public static void main(String[] args) {
        Practice p1 = new Practice("연습중");
        Practice p2 = new Practice("연습중");
        try {
            Practice p3 = (Practice)p1.clone(); //clone의 접근제어자는 protected이기 때문에 그냥 사용하면 오류 발생.
            System.out.println(p1 == p3);
            System.out.println(p1.equals(p3));
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        } 
        System.out.println(p1); //아래의 System.out.println(p1.toString())과 같은 이유는 java가 기본으로 .toString()을 사용하기 때문.
        System.out.println(p1.toString()); //toString메소드를 정의하지 않았지만 사용할 수 있는 이유는 Practice가 Object를 상속하기 때문.
        System.out.println(p2);
        System.out.println(p1 == p2);
        System.out.println(p1.equals(p2));
        }
    
}
