import java.io.*;
public class ChechedException {
    public static void main(String[] args) {
        //상황에 따라 예외를 강제해야 하는 경우도 있다.
        BufferedReader bReader = null;
        String input = null;
        try {
            bReader = new BufferedReader(new FileReader("study.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            input = bReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(input);
    }
}
