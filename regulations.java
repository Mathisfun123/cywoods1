import java.util.*;
import java.io.*;

import static java.lang.System.*;

public class regulations {

	public static void main(String[] args) throws IOException {
		String filename = "regulations".toLowerCase();
		Scanner sc = new Scanner(new File(filename + ".dat"));
		int n = sc.nextInt();
		for (int p = 0; p < n; p++) {
			int t = sc.nextInt();
			boolean happen = true;
			for(int l = 0; l< t ; l++){
				String colour = sc.next();
				if(!colour.equals("Space_Grey")&& !colour.equals("Imperial_Black")&& !colour.equals("Royal_Guard_Red")){
					happen=false;
				}
				int a = sc.nextInt(); int b = sc.nextInt(); int c = sc.nextInt();
				if(a!=b|| b!=c || a!=c){
					happen=false;
				}
				int num = sc.nextInt();
				if(num>=20){
					happen=false;
				}
				String smell = sc.next();
				if(!smell.equals("Clean") && !smell.equals("Fruity")&& !smell.equals("Perfumed")){
					happen=false;
				}


			}

			if(happen){
				System.out.println("Never tell me the odds!");
			}else{
				System.out.println("It's a trap!");
			}
		}
	}

}
