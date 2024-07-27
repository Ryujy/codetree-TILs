import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            int n = 0;
            if(st.hasMoreTokens()){
                n = Integer.parseInt(st.nextToken());
            }
            
            switch(str){
                case "push_back":
                    arr.add(n);
                    break;
                case "pop_back":
                    arr.remove(arr.size()-1);
                    break;
                case "size":
                    System.out.println(arr.size());
                    break;
                case "get":
                    System.out.println(arr.get(n-1));
                    break;
            }
        }
    }
}