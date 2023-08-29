class Cal2 {
    private int left, right;
    //접근제어자 private을 통해 사용자가 임의로 전역변수인 left, right 값을 바꾸는 것을 제어
    public void set(int left, int right) {
        this.left = left;
        this.right = right;
    }

    private int sum() {
        //return 값이 int 이기 때문에 메소드 출력 값을 int로 지정
        //sum을 사용자가 임의로 수정할 수 없도록 private 사용
        return this.left + this.right;
    }

    public void calSum() {
        System.out.println(this.left + "+" + this.right + "=" + sum());
    }

    private int avg() {
        return sum()/2;
    }

    public void calAvg() {
        System.out.println("(" + this.left + "+" + this.right + ")" + "/" + 2 + "=" + avg());
    }

    private int mul() {
        return this.left * this.right;
    }

    public void calMul() {
        System.out.println(this.left + "*" + this.right + "=" + mul());
    }

    private double div() {
        //나눗셈은 소수점까지 표현하고 싶어서 출력값을 double로 설정
        return (double)this.left/(double)this.right;
    }

    public void calDiv() {
        System.out.println(this.left + "/" + this.right + "=" + div());
    }
}

public class UpgradeCalculator {
    public static void main(String[] args){
        Cal2 c1 = new Cal2();
        c1.set(20,30);
        c1.calSum();
        c1.calAvg();
        c1.calMul();
        c1.calDiv();
    }
}