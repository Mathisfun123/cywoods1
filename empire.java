import java.util.*;
import java.io.*;

import static java.lang.System.*;

public class empire {

	public static void main(String[] args) throws IOException {
		String filename = "empire".toLowerCase();
		Scanner sc = new Scanner(new File(filename + ".dat"));
		int n = sc.nextInt();
		for (int p = 0; p < n; p++) {
			int times=sc.nextInt();
			String name=sc.nextLine();
			String phrase=sc.nextLine();
			for(int k=0; k<times; k++){
				System.out.println(phrase);
				System.out.println("The Empire Loves the Citizens of" + name + "!");
			}
			System.out.println();
		}
	}

}
