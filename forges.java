import java.util.*;
import java.io.*;

import static java.lang.System.*;

public class forges {

	public static void main(String[] args) throws IOException {
		long arr[] = new long[75];
		arr[0]=1; arr[1]=1;
		for(int p = 2; p< 75;p++){
			arr[p]= arr[p-2]+arr[p-2];
		}
		String filename = "forges".toLowerCase();
		Scanner sc = new Scanner(new File(filename + ".dat"));
		int numberdata = sc.nextInt();
		for(int p = 0; p<numberdata;p++){
			int iterations = sc.nextInt();
			iterations--; int n = 1;

		}
	}
	public static long Fibonacci(long[]arr, int n){
		return arr[n];
	}

}
