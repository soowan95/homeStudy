import java.util.*;

class Computer implements Comparable {
    int serial;
    String owner;
    Computer(int serial, String owner) {
        this.serial = serial;
        this.owner = owner;
    }
    public int compareTo(Object o) {
        return this.serial - ((Computer)o).serial;
        //전역변수의 serial값과 새로 입력한 serial값을 비교해서 양수인지 0인지 음수인지 확인하는 메소드
    }
    public String toString(){
        return serial+" "+owner;
    }
}

public class HowToUseCollections {
    public static void main(String[] args) {
        List<Computer> computers = new ArrayList<Computer>();
        computers.add(new Computer(500, "egoing"));
        computers.add(new Computer(200, "leezche"));
        computers.add(new Computer(3233, "graghittie"));
        Iterator i = computers.iterator();
        System.out.println("before");
        while(i.hasNext()) {
            System.out.println(i.next());
        }
        Collections.sort(computers);
        //sort를 사용하면 compareTo를 먼저 실행하여 크기를 비교한 뒤 나머지를 실행
        System.out.println("\nafter");
        i = computers.iterator();
        while(i.hasNext()) {
            System.out.println(i.next());
        }
    }
    
}
