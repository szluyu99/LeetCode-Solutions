package 水题;
/**
 * https://leetcode-cn.com/problems/guess-numbers/
 * @author yusael
 *
 */
class _LCP1_猜数字 {
    public int game(int[] guess, int[] answer) {
    	if(guess[0]!=answer[0] && guess[1]!=answer[1] && guess[2]!=answer[2])
    		return 0;
    	if(guess[0] == answer[0] && guess[1] == answer[1] && guess[2] == answer[2])
    		return 3;
    	if((guess[0]==answer[0]&&guess[1]==answer[1])||
    		(guess[0]==answer[0]&&guess[2]==answer[2])||
    		(guess[1]==answer[1])&&guess[2]==answer[2])
    		return 2;
    	return 1;
    }
}
