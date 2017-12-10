import java.util.*;
import java.io.*;

import static java.lang.System.*;

public class senate {

	public static void main(String[] args) throws IOException {
		String filename = "senate".toLowerCase();
		Scanner sc = new Scanner(new File(filename + ".dat"));
		int n = sc.nextInt();
		sc.nextLine();
		for (int p = 0; p < n; p++) {
			int numsenators = sc.nextInt();
			String names [] = new String[numsenators];
			for(int l = 0; l<numsenators;l++){
				String elem[] = sc.nextLine().split("-");
				names[l]=elem[0];
			}
			for (int i = 0; i < names.length; i++) {
				System.out.println(names[i]);

			}
		}
	}

}
