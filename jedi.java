import java.util.*;
import java.io.*;

import static java.lang.System.*;

public class jedi {

	public static void main(String[] args) throws IOException {
		String filename = "jedi".toLowerCase();
		Scanner sc = new Scanner(new File(filename + ".dat"));
		int n = sc.nextInt();
		sc.nextLine();
		for (int p = 0; p < n; p++) {
			int r = sc.nextInt();
			int g = sc.nextInt();
			int b = sc.nextInt();
			if(r!=0 && b!=0){
				System.out.println("Get them!");
			}
			else if(r!=0){
				System.out.println("Protect the Federation");
			}
			else
				System.out.println("Get them!");
		}
	}

}
