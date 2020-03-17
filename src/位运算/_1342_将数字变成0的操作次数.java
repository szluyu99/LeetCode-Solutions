package 位运算;
/**
 * https://leetcode-cn.com/problems/number-of-steps-to-reduce-a-number-to-zero/
 * @author yusael
 *
 */
public class _1342_将数字变成0的操作次数 {
    public int numberOfSteps (int num) {
    	int counts = 0;
    	while(num != 0){
        	if(num%2 == 0) {
        		num = (num >> 1);
        		counts++;
    		}
        	else {
        		num -= 1;
        		counts++;
        	}
    	}
    	return counts;
    }
}
