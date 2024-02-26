import java.util.*;

public class KLargestElement
{
	public static void main(String[] args) {
		int[] arr1 = {3,1,5,12,2,11};
		int[] arr2 = {5,12,11,-1,12};
		
		System.out.println( " k large elements with sorting " + KLargestElementWithSorting(arr1, 3));
		System.out.println(" k large elements with sorting " + KLargestElementWithSorting(arr2, 3));
		
		
		System.out.println(" k large elements with min Heap " + KLargestElementWithMinHeap(arr1, 3));
		System.out.println( " k large elements with min Heap " + KLargestElementWithMinHeap(arr2, 3));
		
	}
	
	// TC -> O(N * logN)
	public static List<Integer> KLargestElementWithSorting(int[] nums, int k) {
	    
	    Arrays.sort(nums);
	    
	    int i = nums.length-k;
	    List<Integer> list = new ArrayList<>();
	    
	    for(; i<nums.length;i++) {
	        list.add(nums[i]);
	    }
	    
	    return list;
	    
	}
	
	// TC -> O(N * LogK ) , SC -> O(K)
	public static List<Integer> KLargestElementWithMinHeap(int[] nums, int k) {
	    
	    // min heap 
	    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
	    
	    for(int i=0;i<nums.length;i++) {
	        
	        if(minHeap.size() < k) {
	            minHeap.add(nums[i]);
	        }else {

            // if top element is less than current element 
            // 1. remove top element 
            // 2. add current element to the heap 
            // By doing this you will have top K elements Till now

	            if(minHeap.peek() < nums[i]) {
	                minHeap.poll();
	                minHeap.add(nums[i]);
	            }
	        } 
	    }
	    
	    List<Integer> list = new ArrayList<>();
	    Iterator<Integer> itr = minHeap.iterator();
	    
	    while(itr.hasNext()) {
	        list.add(itr.next());
	    }
	    return list;
	}
	
}
