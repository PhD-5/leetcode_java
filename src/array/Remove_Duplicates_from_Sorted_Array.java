/*
 * Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.

Do not allocate extra space for another array, you must do this in place with constant memory.

For example,
Given input array nums = [1,1,2],

Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively. It doesn't matter what you leave beyond the new length.
 */
package array;

public class Remove_Duplicates_from_Sorted_Array {
	
    public int removeDuplicates(int[] nums) {
    	int index=0;
    	for(int i=1;i<nums.length;i++){
    		if(nums[i]!=nums[index]){
    			//如果是不同的元素，移动index，存放
    			nums[++index]=nums[i];
    		}
    	}
        return index+1;
    }
    
	public static void main(String[] args) {
		Remove_Duplicates_from_Sorted_Array array = new Remove_Duplicates_from_Sorted_Array();
		int[] nums={1,1,2,2,3,3,4,4};
		System.out.println(array.removeDuplicates(nums));
	}

}
