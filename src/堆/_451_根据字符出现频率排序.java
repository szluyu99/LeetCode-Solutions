package 堆;

import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;

/**
 * @author yusael
 * https://leetcode-cn.com/problems/sort-characters-by-frequency/
 */
public class _451_根据字符出现频率排序 {
	public static String frequencySort(String s) {
     	HashMap<Character, Integer> map = new HashMap<>();
    	char[] chars = s.toCharArray();
    	for (char c : chars) {
    		map.put(c, map.get(c)==null ? 1 : map.get(c)+1);
		}
    	PriorityQueue<Character> pq = new PriorityQueue<>(new Comparator<Character>() {
			public int compare(Character o1, Character o2) {
				return map.get(o2) - map.get(o1);
			}
		});
    	for (Character c : map.keySet()) {
			pq.add(c);
		}
    	StringBuilder sb = new StringBuilder();
    	while(!pq.isEmpty()){
    		Character chr = pq.poll();
    		Integer count = map.get(chr);
    		while(count > 0){
    			sb.append(chr);
    			count--;
    		}
    	}
    	return sb.toString();
    }
	
	// 大顶堆题解
	class Solution {
		 public String frequencySort(String s) {
		        //初始化字母数组
		        int[] latters = new int[256];
		        //填充数组
		        for(char c:s.toCharArray()){
		            latters[c]++;
		        }
		        //排序
		        PriorityQueue<Latter> queue = new PriorityQueue<>();

		        for (int i = 0;i<latters.length;i++){
		            if (latters[i]!=0){
		                queue.add(new Latter((char) i,latters[i]));
		            }
		        }
		        StringBuilder stringBuilder = new StringBuilder();

		        while (!queue.isEmpty()){
		            Latter latter = queue.poll();
		            for (int i =0;i<latter.count;i++)
		                stringBuilder.append(latter.latter);
		        }


		        return stringBuilder.toString();
		    }

		    public class Latter implements Comparable<Latter>{
		        public char latter = '0';
		        public int count = 0;

		        public Latter(char latter, int count) {
		            this.latter = latter;
		            this.count = count;
		        }

		        @Override
		        public int compareTo(Latter o) {
		            return o.count - this.count;
		        }
		    }
		}
}
