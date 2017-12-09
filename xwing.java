import java.util.*;
import java.io.*;

import static java.lang.System.*;

public class xwing {

	public static void main(String[] args) throws IOException {
		String filename = "xwing".toLowerCase();
		Scanner sc = new Scanner(new File(filename + ".dat"));
		int cout = sc.nextInt();
		sc.nextLine();
		for (int p = 0; p < cout; p++) {
			long n = sc.nextLong() ; long t = sc.nextLong(); long s = sc.nextLong();
			if(Math.pow(Math.abs(n-t),2)+fact(n)+fact(t)> s){
				System.out.println("Ethan's X-Wing Spontaneously Combusts");


			}else{
				System.out.println("Ethan's X-Wing is Okay");
			}
		}
	}
	public static long fact(long a){
		long val= 1;
		for(long p= a;p>=1;p--){
			val*=p;
		}
		return val;
	}

}
