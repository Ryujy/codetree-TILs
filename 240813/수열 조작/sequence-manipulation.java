import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        Deque<Integer> dq = new ArrayDeque<>();

        for (int i=1; i<N+1; i++){
            dq.addLast(i);
        }

        while(dq.size() != 1){
            dq.pollFirst();
            dq.addLast(dq.pollFirst());
        }

        System.out.println(dq.pollFirst());
    }
}