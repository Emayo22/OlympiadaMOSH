import java.io.*;
import java.util.*;
public class Main {
    static StreamTokenizer streamTokenizer;
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        long number = Integer.parseInt(bf.readLine());
        long num = 1;
        ArrayList<Long> massiv = new ArrayList<>();
        long counter = 0;
        for (int i = 1; i < number + 1; i++) {
            delitels(i, massiv);
            if((massiv.size()) % 2 == 0){
                counter += 1;
            }
            massiv.clear();
        }
        System.out.println(counter);

    }
    static ArrayList<Long> delitels(long k, ArrayList<Long> r){
        long n = 1;
        while(n <= k) {
            if (k % n == 0) {
                r.add(n);
            }
            n += 1;
        }
        return r;
    }
}
