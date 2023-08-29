class A {
    public String y() {
        return "public void y()";
    }

    private String z() {
        return "public void z()";
    }

    public String x() {
        return z();
    }
}

public class Access {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.y());
        //System.out.println(a.z());
        // 접근제어자 private은 소속되어있는 class 내에서만 사용이 가능해서 Access에서는 사용 불가
        System.out.println(a.x());
        // 메소드 x와 z는 같은 class에 있기 때문에 x를 통해서 z를 호출 가능해 지고 x는 접근제어자 public을 사용하기 때문에 Access에서 사용 가능
    }
}