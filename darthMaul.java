import java.util.*;
import java.io.*;

import static java.lang.System.*;

public class darthMaul {

	public static void main(String[] args) throws IOException {
		String filename = "darthMaul".toLowerCase();
		Scanner sc = new Scanner(new File(filename + ".dat"));
		int n = sc.nextInt();
		sc.nextLine();
		for (int p = 0; p < n; p++) {
			String letter = sc.nextLine();
			String ln = sc.nextLine();
			String [] values = ln.split(" ");
			int [] arr= new int[values.length];
			for(int i = 0; i< values.length;i++){
				arr[i]= Integer.parseInt(values[i]);
			}
			Arrays.sort(arr);
			if(letter.equals("B")){
					int temp [] = new int[arr.length];
					for(int coun= arr.length-1; coun>=0; coun--){
						temp[(arr.length-coun)-1]= arr[coun];

					}
				arr= temp;
			}
			int count=arr.length;
			int num=0;
			int dist=1;
			int[] sarr=new int[count];
			sarr[sarr.length/2]=arr[num];
			num++;
			for(int z=0; z<count-1;z=z+2) {
				sarr[sarr.length / 2 - dist] = arr[num];
				num++;
				sarr[sarr.length / 2 + dist] = arr[num];
				num++;
				dist++;
			}
			for (int i = 0; i < sarr.length; i++) {
				System.out.print(sarr[i]+ " ");

			}
			System.out.println();



		}
	}

}
