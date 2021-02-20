import java.util.Scanner;
import java.io.IOException;
import java.io.PrintWriter;

public class filewriter {
    public static void main(String[] args) throws Exception{
        String path;
        String text;
        Scanner sc = new Scanner(System.in); 
        System.out.println("경로를 적으시오");
        path = sc.nextLine();
        System.out.println("내용을 적으시오");
        text = sc.nextLine();
        PrintWriter pw = new PrintWriter(path);
        pw.println(text);
        pw.close();
        System.out.println("작성성공!");
    }
}
