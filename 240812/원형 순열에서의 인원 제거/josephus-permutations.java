import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // N명
        int K = Integer.parseInt(st.nextToken()); // K번째 제거

        Queue<Integer> q = new LinkedList<>(); // 큐 선언

        // 큐 순회
        for(int i=1; i<N+1; i++){
            q.add(i);
        }

        while(!q.isEmpty()){
            for (int j=0; j<K-1; j++){
                q.add(q.poll());
            }
            System.out.print(q.poll()+" ");
        }
    }
}