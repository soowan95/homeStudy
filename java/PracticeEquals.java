class Student{
    String name;
    Student(String name) {
        this.name = name;
    }
    public boolean equals(Object obj) {
        //equals(Object obj)에서 obj의 데이터 타입은 Object이고 obj에 들어갈 s2의 데이터 타입은 Student지만 Object가 Student의 부모클래스이기 때문에 가능
        Student s = (Student)obj;
        //우리는 Student 클래스의 name을 사용하고 싶은데 데이터타입이 Object라면 사용할 수 없으므로 강제로 데이터형변환을 시켜야 함
        return this.name == s.name;
        //this.name에는 s1이 들어가고 s.name에는 s2가 들어가는데 System.out.println(s1 == s2)와 다른점은 같은 인스턴스에서 실행된다는 점
    }
}

public class PracticeEquals {
    public static void main(String[] args) {
        Student s1 = new Student("egoing");
        Student s2 = new Student("egoing");
        System.out.println(s1 == s2);
        //각각 다른 인스턴스에서 실행되기 때문에 다른 값으로 취급
        System.out.println(s1.equals(s2));
    }
}
