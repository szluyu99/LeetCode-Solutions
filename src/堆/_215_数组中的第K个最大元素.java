package 堆;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * https://leetcode-cn.com/problems/kth-largest-element-in-an-array/
 * @author yusael
 */
public class _215_数组中的第K个最大元素 {
    public int findKthLargest(int[] nums, int k) {
    	// 大顶堆
    	PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
			public int compare(Integer o1, Integer o2) {
				return o2 - o1;
			}
		});	
    	
    	int length = nums.length;
    	for (int i = 0; i < length; i++) {
			queue.offer(nums[i]);
		}
    	
    	int count = 1;
    	while(count < k){
    		queue.poll();
    		count++;
    	}
    	
    	return queue.peek();
    }
    
    public int findKthLargest2(int[] nums, int k) {
    	// 小顶堆
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int val : nums){
            pq.add(val);
            if(pq.size() > k) pq.poll();
        }
        return pq.peek();
    }

    public static void main(String[] args) {
    	PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
			public int compare(Integer o1, Integer o2) {
				return o2 - o1;
			}
		});	
    	queue.offer(4);
    	queue.offer(1);
    	queue.offer(5);
    	queue.offer(2);
    	
    	while(!queue.isEmpty()){
    		System.out.println(queue.remove());
    	}
	}
}

