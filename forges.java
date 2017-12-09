import java.util.*;
import java.io.*;

import static java.lang.System.*;

public class forges {

	public static void main(String[] args) throws IOException {
		String filename = "forges".toLowerCase();
		Scanner sc = new Scanner(new File(filename + ".dat"));
		int[] fib=new int[75];
		fib[0]=1;
		fib[1]=1;
		for(int x=2;x<75;x++)
			fib[x]=fib[x-1]+fib[x-2];
		int n = sc.nextInt();
		sc.nextLine();
		for (int p = 0; p < n; p++) {
			int k=sc.nextInt();
			System.out.println(fib[k-1]-1);
		}
	}

}
