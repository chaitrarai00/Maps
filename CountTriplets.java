package counttriplets;

import java.io.*;
import java.util.*;


public class CountTriplets {

    // Complete the countTriplets function below.
    static long countTriplets(List<Long> arr, long r) {
    	Map<Long,Long> leftmap=new HashMap<Long,Long>();
    	Map<Long,Long> rightmap=new HashMap<Long,Long>();
    	for(Long item: arr) {
    		rightmap.put(item, rightmap.getOrDefault(item,0L)+1);
    		}	
    	long count=0;
    	for(int i=0;i<arr.size();i++) {
    		long var1=0,var2=0;
    		long mid=arr.get(i);
    		rightmap.put(mid, rightmap.getOrDefault(mid, 0L)-1);
    		if(leftmap.containsKey(mid/r) && mid % r==0) {
    			var1=leftmap.get(mid/r);
    		}
    		if(rightmap.containsKey(mid*r)) {
    			var2=rightmap.get(mid*r);
    		}
    		count+=var1*var2;
    		leftmap.put(mid, leftmap.getOrDefault(mid, 0L)+1);
    	}
    	return count;
    }

    public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long r = sc.nextLong();
		List<Long> arr = new ArrayList<>();
		while (n-- > 0) {
			arr.add(sc.nextLong());
		}

		long ans = countTriplets(arr, r);
		System.out.println(ans);

		sc.close();

    }
}


