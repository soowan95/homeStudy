import java.util.Scanner;

public class Scanner2Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()) {
            System.out.println(sc.nextInt()*100);
        }
        sc.close();
    }
}
