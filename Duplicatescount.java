package countduplicates;

import java.util.*;

public class Duplicatescount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> array = new ArrayList<>();
		while (n-- > 0) {
			array.add(sc.nextInt());
		}
		int count=count_nonuni(array);
		System.out.println(count);
		sc.close();
	}
	
     static int count_nonuni(List<Integer> array) {
		int count=0;
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		for(int temp:array) {
			if(!map.containsKey(temp))
				map.put(temp,1);
			else {
				map.put(temp,map.get(temp)+1);
			}
		}
		for(int key:map.keySet()) {
			if(map.get(key)>1) {
				count++;
			}
		}
		return count;
	}

}
