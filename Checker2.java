package checker;


public class Checker2 {
	public int solution(String S) {
        //the string to be checked is hard coded for now.
		//need to add method for assigning .txt to string
		S = "X.X..XXXX";
		int n = S.length();
        int i = 0;
        int k = 1;
        int sol = 0;
        //loop to search through string. i will be increased by a specified amount every loop, but always at least by 1
        while (i <= n){
            //check the current string index
        	if (S.charAt(i) == 'X') {
        		//add a patch to the total number
        		sol++;
        		//set the amount to increase the index by. If the string is shorter than the new index,
        		//it will be changed so that the full string is checked
        		k = 3;
        		if (i + k > n) {
        			k = 2;
        		}
        		if (i + (k-1) > n) {
        			k = 1;
        		}
            	i = i + k;
            	//set the increase increment back to 1 
            	k = 1;
            }
            //if no X is detected, move onto the next index
            if (S.charAt(i) != 'X') {
            	i = i + k;
            }
        }
        return sol;
    }
}
