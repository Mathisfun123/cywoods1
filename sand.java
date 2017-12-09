import java.util.*;
import java.io.*;

import static java.lang.System.*;

public class sand {

	public static void main(String[] args) throws IOException {
		String filename = "sand".toLowerCase();
		Scanner sc = new Scanner(new File(filename + ".dat"));
		int n = sc.nextInt();
		for (int np = 0; np < n; np++) {
			int l = sc.nextInt();
			for(int k = 0; k< l;k++){

				String ln = sc.nextLine();
				ln.toLowerCase();
				ln.replace(" ", "");
				if(ln.contains("sand")){
					System.out.println("I HATE SAND!!!");
				}
				else
					System.out.println("Here everything is soft and smooth.");

				/*System.out.println(ln);
				boolean happen = false;
				for(int p = 0; p< ln.length()-3;p++){
					if(ln.substring(p,p+4).equals("sand")){
						happen=true;
						System.out.println("I HATE SAND!!!");
					}
				}
				if(!happen){
					System.out.println("Here everything is soft and smooth.");
				}
			}
			sc.nextLine();
			System.out.println();*/
		}
	}

}
}
