package Practice;

import java.util.Arrays;

public class MedianOfTwoSortedArraysEqualSize {

	public static void main(String[] args) {
        int[] nums1 =  {-5, 3, 6, 12, 15};
        int[] nums2 = {-12, -10, -6, -3, 4, 10};
        System.out.println((int)findMedianSortedArrays(nums1, nums2));
    }

	private static float findMedianSortedArrays(int[] nums1, int[] nums2) {
		int len1 = nums1.length;
		int len2 = nums2.length;
		int[] result = new int[len1 + len2];
		System.arraycopy(nums1, 0, result, 0, len1);
		System.arraycopy(nums2, 0, result, len1, len2);
		Arrays.sort(result);
		int len = result.length;
		if (len % 2 == 0) {
			return   ((result[len / 2] + result[len / 2 - 1]) / 2) ;
		} else {
			return result[len / 2] ;
		}
		
	}

}
