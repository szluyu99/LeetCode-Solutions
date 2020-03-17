package 栈;

import java.util.Stack;

/**
 * https://leetcode-cn.com/problems/score-of-parentheses/
 * @author yusael
 *
 */
public class _856_括号的分数 {
    public static int scoreOfParentheses(String S) {
    	Stack<Character> stack = new Stack<>();
    	int len = S.length();
    	for(int i = 0; i < len; i++){
    		char c = S.charAt(i); // 当前字符
    		if('(' == c){ // 左括号
    			stack.push(c); // 左括号入栈 
    		}
    	}
    	return 0;
    }
    public static void main(String[] args) {
		System.out.println(scoreOfParentheses("((()))"));
	}
}
