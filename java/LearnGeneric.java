/*class StudentInfo {
    public int grade;
    StudentInfo(int grade){this.grade = grade; }
}

class StudentPerson {
    public StudentInfo info;
    StudentPerson(StudentInfo info){this.info = info; }
}

class EmployeeInfo{
    public int rank;
    EmployeeInfo(int rank){this.rank = rank; }
}

class EmployeePerson{
    public EmployeeInfo info;
    EmployeePerson(EmployeeInfo info){this.info = info; }
}*/

class StudentInfo {
    public int grade;
    StudentInfo(int grade){this.grade = grade; }
}

class EmployeeInfo{
    public String rank;
    EmployeeInfo(String rank){this.rank = rank; }
}

/*class Person{
    public Object info;
    Person(Object info){this.info = info; }
}*/
//Person 하나로 묶은 장점이 있지만 데이터타입이 Object로 돼서 어떤 데이터타입도 사용될 수 있는 상태가 됨. 내가 사용하고 싶은 int나 String이 아닌 데이터타입을 사용해도 오류가 발생하지 않기 때문에 나중에 그 오류를 잡아내기 어려움.

class Person<T>{ // class Person<T Extends EmployeeInfo>{ 이처럼 Extends를 통해 제네릭을 제한할 수 있음. 이 제네릭에 올 수 있는 데이터타입은 EmployeeInfo를 상속 받은 데이터타입만 가능.
    public T info;
    Person(T info){this.info = info; }
}

public class LearnGeneric {
    public static void main(String[] args) {
        /*StudentInfo si = new StudentInfo(2);
        StudentPerson sp = new StudentPerson(si);
        System.out.println(sp.info.grade);
        EmployeeInfo ei = new EmployeeInfo(1);
        EmployeePerson ep = new EmployeePerson(ei);
        System.out.println(ep.info.rank);*/

        Person<String> p1 = new Person<String>("부장");
        EmployeeInfo ei = new EmployeeInfo(p1.info);
        System.out.println(ei.rank);
        //Person<int> p2 = new Person<int>(2);
        //기본 데이터형을 사용할 수 없기때문에 wrapper사용 해야함
        Person<Integer> p2 = new Person<Integer>(2);
        StudentInfo si = new StudentInfo(p2.info);
        System.out.println(si.grade+"학년");
        }
}