package checker;
import java.util.*;
import java.util.Arrays;

public class Checker {
	public int solution(String S) {
        S = "X.X..XXX";
		int n = S.length();
        double times = (S.length() / 3.0);
        times = Math.ceil(times);
        int remainder = S.length() % 3;
        int start = 0;
        int next = 3;
        int sol = 0;

        for (int i = 0; i < times; i++){
            String exes = S.substring(start, next);
            start = next;
            if (next * 2 > n){
                next = next + remainder;
            }
            else {
                next = next * 2;
            }
            if (exes.contains("X") == true){
                sol++;
            }
        }
        return sol;
    }


}
