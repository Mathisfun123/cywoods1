import java.util.*;
import java.io.*;

import static java.lang.System.*;

public class podracing {

	public static void main(String[] args) throws IOException {
		String filename = "podracing".toLowerCase();
		Scanner sc = new Scanner(new File(filename + ".dat"));
		int n = sc.nextInt();
		sc.nextLine();
		for (int p = 0; p < n; p++) {
			String ln = sc.nextLine();
			if(ln.equals("mos espa grand arena")){
				System.out.println("Now this is podracing!");
			}else{
				System.out.println("Oof! This is NOT podracing!");
			}
		}
	}

}
