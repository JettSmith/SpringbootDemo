package com.zj.test;
import java.util.Arrays;

import org.junit.Test;
/**
 * 排序类
 * @author ZJ
 *
 */
public class SortClass {
	
	@Test
	/**
	 * 快速排序
	 */
	public void insertSort() {
		int[] arr1 = {5,2,7,1,3,9,8,6,13,12,0};
		int lent = arr1.length;
		int insert;
		for(int i =1;i< lent;i++) {
			insert = arr1[i];
			int j = i-1;
			while(j>=0 && arr1[j]>insert) {
				//a[i]为什么不行
				arr1[j+1] = arr1[j];
				j--;
			}
			arr1[j+1] = insert;
			
		}
		System.out.println(Arrays.toString(arr1));
	}
}
