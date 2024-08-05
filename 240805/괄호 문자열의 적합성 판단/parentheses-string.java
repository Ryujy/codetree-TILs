import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Stack<String> stack = new Stack<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] bracket = br.readLine().split("");

        for (int i=0; i<bracket.size; i++){
            if (bracket[i].equals("(")){
                stack.push("(");
            } else {
                stack.pop();
            }
        }

        if (!stack.isEmpty){
            return "No";
        } else {
            return "Yes";
        }
    }
}