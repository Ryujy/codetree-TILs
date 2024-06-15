import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char c = br.readLine().charAt(0);
        double a = Double.parseDouble(br.readLine());
        double b = Double.parseDouble(br.readLine());

        System.out.printf(c+"\n");
        System.out.printf("%.2f\n", a);
        System.out.printf("%.2f\n", b);
    }
}