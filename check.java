import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class check {
	public static void main(String[] args) {
		String orig = "Hi My name is Computer";
		String check = "ckjdfmptur";
		String dict [] = orig.split(" ");
		List<Integer> dists = new ArrayList<>();
		for(int i = 0; i<dict.length;i++){
			dists.add(distance(dict[i],check));
		}
		Collections.sort(dists);
		for(int i = 0; i<dict.length;i++){
			if(distance(dict[i],check)==dists.get(0)){
				System.out.println(dict[i] + " " + dists.get(0)+ " "+check);
			}
		}
	}
	public static int distance(String a, String b){
		a = a.toLowerCase(); b=b.toLowerCase();
		int [] costs = new int[b.length()+1];
		for(int i= 0; i< costs.length;i++){
			costs[i]= i;
		}
		for(int i = 1; i<=a.length();i++){
			int nw = i-1;
			costs[0]= i;
			for(int j = 1; j<=b.length();j++){
				int cj = Math.min(1+Math.min(costs[j],costs[j-1]),a.charAt(i-1)==b.charAt(j-1)?nw:nw+1);
				nw=costs[j];
				costs[j]= cj;
			}
		}
		return costs[b.length()];
	}
}
