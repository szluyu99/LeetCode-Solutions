package 数组;
/**
 * https://leetcode-cn.com/problems/decompress-run-length-encoded-list/
 * @author yusael
 */
public class _1313_解压缩编码列表 {
	/*
	 * nums[1, 2]
	 * [2]
	 * nums[1, 2, 3, 4]
	 * [2, 4, 4, 4]
	 * nums[1, 2, 3, 4, 5, 6]
	 * [2, 4, 4, 4, 6, 6, 6, 6, 6]
	 * nums[4,3]
	 * [3, 3, 3, 3]
	 */
	public int[] decompressRLElist(int[] nums) {
        int sum = 0;
        int len = nums.length;
        for (int i = 0; i < len; i+=2) {
			sum += nums[i]; // 求给定数组中的偶数和
		}
//        for (int i = 0; i < len; i++) {
//			if(i%2 == 0){ 
//				sum += nums[i]; // 偶数和
//			}
//		}
        
        int [] list = new int[sum];

        int index = 0; // 下标
        for (int i = 0; i < len; i+=2) {
			for(int j = 0; j < nums[i] ; j++){
				list[index] = nums[i+1];
				index++;
			}
		}
    	return list;	
    }
}
