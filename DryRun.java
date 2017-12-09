import java.util.*;
import java.io.*;

import static java.lang.System.*;

public class DryRun {

	public static void main(String[] args) throws IOException {
		String filename = "DryRun".toLowerCase();
		Scanner sc = new Scanner(new File(filename + ".dat"));
		int n = sc.nextInt();sc.nextLine();
		for(int p = 0; p< n; p++){
			String name =sc.nextLine();
			System.out.println("Darth "+name);
		}
	}


}
