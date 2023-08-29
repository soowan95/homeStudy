import java.io.*;

class B{
    void run() throws FileNotFoundException, IOException{
        //throws 를 통해 FileNorFoundException, IOException에 대해 사용자에게 대응하도록 강제함
        BufferedReader bReader = null;
        String input = null;
        //try {
            bReader = new BufferedReader(new FileReader("study.txt"));
        //} catch (FileNotFoundException e) {
        //    e.printStackTrace();
        //}
        //try {
            input = bReader.readLine();
        //} catch (IOException e) {
        //    e.printStackTrace();
        //}
        System.out.println(input);
    }
}

class C{
    void run(){
        B b = new B();
        try {
            b.run();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

public class ThrowException {
    public static void main(String[] args) {
        C c = new C();
        c.run();
    }
}
//C는 B의 사용자, ThrowException은 C의 사용자
