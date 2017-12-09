import java.util.*;
import java.io.*;

import static java.lang.System.*;

public class dijkstra {
	public static String [][] mat;


	public static void main(String[] args) throws IOException {
		String filename = "dijkstra".toLowerCase();
		Scanner sc = new Scanner(new File(filename + ".dat"));
		int n = sc.nextInt();
		sc.nextLine();
		for (int p = 0; p < n; p++) {
			String numtofind []= (sc.nextLine().split(" "));
			int colsposs = Integer.parseInt(numtofind[0]);
			int rowsposs = Integer.parseInt(numtofind[1]);
			int timeposs = Integer.parseInt(numtofind[2]);
			mat= new String[rowsposs][colsposs];
			for(int num= 0; num< rowsposs; num++){
				mat[num]= sc.nextLine().split("");
			}
			int startrpos = getRStartPos(mat);
			int startcpos= getCStartPos(mat);
			int currentrpos= startrpos; int currentcpos=startcpos;
			int timestart = 0;
			System.out.println(currentrpos+ " "+ currentcpos);
			while(timestart<timeposs ){
				currentrpos= (getMove(mat,currentrpos,currentcpos))[0]+currentrpos;
				currentcpos= (getMove(mat,currentrpos,currentcpos))[1]+currentcpos;
				System.out.println(currentrpos+ " " + currentcpos);
				timestart+=3;
			}

		}
	}
	public static int getRStartPos(String [][] arr){
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(arr[i][j].equals("S")){
					return i;
				}

			}

		}
		return -1;
	}
	public static int getCStartPos(String [][] arr){
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(arr[i][j].equals("S")){
					return j;
				}
			}
		}
		return -1;
	}
	public static int[] getMove(String arr[][],int startrpos,int startcpos){
		int nextpos[] = new int[2];
		if(inBounds(startrpos,startcpos-1)){
			nextpos[0]=startrpos; nextpos[1]= startcpos-1;
		}
		if(inBounds(startrpos+1,startcpos-1)){
			nextpos[0]=startrpos+1; nextpos[1]=startcpos-1;
		}
		if(inBounds(startrpos+1,startcpos)){
			nextpos[0]=startrpos+1; nextpos[1]=startcpos;
		}
		if(inBounds(startrpos+1,startcpos+1)){
			nextpos[0]=startrpos+1; nextpos[1]=startcpos+1;
		}
		if(inBounds(startrpos,startcpos+1)){
			nextpos[0]=startrpos; nextpos[1]=startcpos+1;
		}
		if(inBounds(startrpos-1,startcpos+1)){
			nextpos[0]=startrpos-1; nextpos[1]=startcpos+1;
		}
		if(inBounds(startrpos-1,startcpos)){
			nextpos[0]=startrpos-1; nextpos[1]=startcpos;
		}
		if(inBounds(startrpos-1,startcpos-1)){
			nextpos[0]=startrpos-1; nextpos[1]=startcpos-1;
		}
		return nextpos;
	}
	public static boolean inBounds(int rpos, int cpos){
		if(rpos<0||rpos>=mat.length||cpos<0||cpos>=mat[0].length){
			return false;
		}
		if(!mat[rpos][cpos].equals("e")){
			return false;
		}else{
			return true;
		}
	}

}

