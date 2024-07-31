import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); // 식빵의 개수
        int m = Integer.parseInt(st.nextToken()); // 레시피 암호문의 개수

        // 식빵 리스트
        char[] arr = br.readLine().toCharArray();

        LinkedList<String> bread = new LinkedList<>();
        for (char c : arr){
            bread.add(String.valueOf(c));
        }

        // iterator 맨 뒤에서 시작
        ListIterator<String> it = bread.listIterator(bread.size());

        // 암호문 반복
        for (int i=0; i<m; i++){
            String[] com = br.readLine().split(" ");
            switch(com[0]){
                case "L":
                    if(it.hasPrevious()) it.previous();
                    break;
                case "R":
                    if(it.hasNext()) it.next();
                    break;
                case "D":
                    if(it.hasNext()) {
                        it.next();
                        it.remove();
                    }
                    break;
                case "P":
                    it.add(com[1]);
                    break;
            }
        }
        for (String s : bread){
            System.out.print(s);
        }
    }
}