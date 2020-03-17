package 其他;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * https://leetcode-cn.com/problems/intersection-of-two-arrays/
 */
public class _349_两个数组的交集 {
	public int[] intersection(int[] nums1, int[] nums2) {
		Set<Integer> set = new TreeSet<>();
		Set<Integer> set2 = new TreeSet<>();
		int len1 = nums1.length, len2 = nums2.length;
		for (int i = 0; i < len1; i++) {
			set.add(nums1[i]);
		}
		for (int i = 0; i < len2; i++) {
			if (set.contains(nums2[i])) {
				set2.add(nums2[i]);
			}
		}

		int len = set2.size();
		int[] res = new int[len];
		Iterator<Integer> iterator = set2.iterator();
		int count = 0;
		while (iterator.hasNext()) {
			res[count] = iterator.next();
			count++;
		}

		return res;
	}
}
