import java.util.*;
import java.io.*;

import static java.lang.System.*;

public class yoda {

	public static void main(String[] args) throws IOException {
		String filename = "yoda".toLowerCase();
		Scanner sc = new Scanner(new File(filename + ".dat"));

		while(sc.hasNextLine()){
			String end=sc.next()+" "+sc.next();
			String front=sc.nextLine();
			String result=(front+", "+end).toLowerCase();
			System.out.println(result.substring(1,2).toUpperCase()+result.substring(2));
		}
	}

}
