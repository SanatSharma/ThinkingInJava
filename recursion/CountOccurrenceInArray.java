package recursion;

public class CountOccurrenceInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(arrayC(new int[]{1,23,11,1,1,1},1,0) + " expected 4");
	}
	
	public static int arrayC(int[] nums, int num, int index) {
		if(nums.length<=index)
			return 0;
		else if(nums[index]==num)
		{
			return 1+ arrayC(nums,num,index+1);
		}
		return arrayC(nums,num, index+1);

	}


}
