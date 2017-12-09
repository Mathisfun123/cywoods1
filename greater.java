import java.util.*;
import java.io.*;

import static java.lang.System.*;

public class greater {

	public static void main(String[] args) throws IOException {
		String filename = "greater".toLowerCase();
		Scanner sc = new Scanner(new File(filename + ".dat"));
		int n = sc.nextInt();
		sc.nextLine();
		for (int p = 0; p < n; p++) {
			String ln1 = sc.nextLine();
			String ln2 = sc.nextLine();
			String elem1[] = ln1.split(" ");
			String elem2[] = ln2.split(" ");
			int val1 = Integer.parseInt(elem1[elem1.length-1]);
			int val2 = Integer.parseInt(elem2[elem2.length-1]);
			val1=getNewNum(val1); val2= getNewNum(val2);
			if((val1==5&&val2==8) ){
				for(int t = 0; t<elem1.length-1;t++){
					System.out.print(elem1[t]+ " ");
				}
				System.out.print("> ");
				for(int l = 0; l<elem2.length-1;l++){
					System.out.print(elem2[l]+ " ");
				}
			}else if((val2==5&&val1==8)){
				for(int t = 0; t<elem1.length-1;t++){
					System.out.print(elem1[t]+ " ");
				}
				System.out.print("< ");
				for(int l = 0; l<elem2.length-1;l++){
					System.out.print(elem2[l]+ " ");
				}
			} else if(val1>val2){
				for(int t = 0; t<elem1.length-1;t++){
					System.out.print(elem1[t]+ " ");
				}
				System.out.print("> ");
				for(int l = 0; l<elem2.length-1;l++){
					System.out.print(elem2[l]+ " ");
				}
			}else if(val1==val2){
				for(int t = 0; t<elem1.length-1;t++){
					System.out.print(elem1[t]+ " ");
				}
				System.out.print("= ");
				for(int l = 0; l<elem2.length-1;l++){
					System.out.print(elem2[l]+ " ");
				}
			}else{
				for(int t = 0; t<elem1.length-1;t++){
					System.out.print(elem1[t]+ " ");
				}
				System.out.print("< ");
				for(int l = 0; l<elem2.length-1;l++){
					System.out.print(elem2[l]+ " ");
				}
			}
			System.out.println();
		}
	}
	public static int getNewNum (int num){
		if(num/10==0){
			return num;
		}else{
			return num%10 + getNewNum(num/10);
		}
	}

}
