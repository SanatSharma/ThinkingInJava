package Arrays;
import java.util.*;
public class Converting_Integer_to_Array_of_Digits
{

	public static void main(String[] args) 
	{
		int temp,test;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter number: ");
		test =  in.nextInt();
		temp =test;
		List<Integer> arr = new ArrayList<Integer>();
		//Converting integer number into arrayList of digits 
		do
		{
			arr.add(temp%10);
			temp/=10;
		}while(temp>0);
		System.out.println("On converting integer to list in reverse order, we get" + arr);
		//COnverting ArrayList into array of digits
		int ret[] = new int[arr.size()];
		for(int i=0;i<ret.length;i++)
		{
			ret[i] = arr.get(i).intValue();
		}

		int[] a = new int[ret.length];
		for(int i =0,c=ret.length-1; i<ret.length;i++,c--)
		{
			a[c] = ret[i];
		}
		System.out.println("On converting number " + test + " to array of digits, we get "+ Arrays.toString(a));
	}
	

}
