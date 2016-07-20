package Sorting;

public class MergeSort {

	public static void main(String[] args) {
		 int[] inputArr = {45,23,11,89,77,98,4,28,65,43};
	        MergeSort m = new MergeSort();
	        m.sort(inputArr);
	        for(int i:inputArr){
	            System.out.print(i + " ");
	        }
	}
	
	private int[] arr;
	private int length;
	private int[] tempMergeArr;
	
	public void sort(int inputArr[])
	{
		this.arr = inputArr;
		this.length = inputArr.length;
		tempMergeArr = new int[length];
		doMergeSort(0,length-1);
		
	}
	
	private void doMergeSort(int lowerIndex, int higherIndex)
	{
		if(lowerIndex<higherIndex)
		{
			int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
            // Below step sorts the left side of the array
            doMergeSort(lowerIndex, middle);
            // Below step sorts the right side of the array
            doMergeSort(middle + 1, higherIndex);
            // Now merge both sides
            mergeParts(lowerIndex, middle, higherIndex);
        }
    }
	
	private void mergeParts(int lowerIndex, int middle, int higherIndex) {
		 
        for (int i = lowerIndex; i <= higherIndex; i++) 
        {
        	tempMergeArr[i] = arr[i];
        }
        int i = lowerIndex;
        int j = middle + 1;
        int k = lowerIndex;
        while (i <= middle && j <= higherIndex) 
        {
            if (tempMergeArr[i] <= tempMergeArr[j]) 
            {
                arr[k] = tempMergeArr[i];
                i++;
            } else {
                arr[k] = tempMergeArr[j];
                j++;
            }
            k++;
        }
        while (i <= middle)
        {
            arr[k] = tempMergeArr[i];
            k++;
            i++;
        }
	}
}