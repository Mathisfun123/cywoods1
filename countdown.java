import java.util.*;
import java.io.*;

import static java.lang.System.*;

public class countdown {

	public static void main(String[] args) throws IOException {
		String filename = "countdown".toLowerCase();
		Scanner sc = new Scanner(new File(filename + ".dat"));
		int n = sc.nextInt();
		sc.nextLine();
		for (int p = 0; p < n; p++) {
			System.out.println(sc.nextLine());
		}
	}

}
