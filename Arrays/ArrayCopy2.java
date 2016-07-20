package Arrays;
import java.util.*;
//(3) Create and fill an array of BerylliumShape. Copy this array to a new array and show that it’s a shallow copy.
class BerylliumShape
{
	private static long counter;
	private final long id = counter++;
	public String toString() { return "SPHERE " + id; }
}
public class ArrayCopy2 
{
	public static void main(String[] args)
	{
		BerylliumShape[] sphere = new BerylliumShape[10];
		for(int i=0;i<10;i++)
		{
			sphere[i] = new BerylliumShape();
			
		}
		System.out.println(Arrays.toString(sphere));
		Arrays.fill(sphere, (new BerylliumShape()));
		// I dont know why the id is stuck at 10 here in the output!!
		System.out.println(Arrays.toString(sphere));
		BerylliumShape[] shape = new BerylliumShape[5];
		System.arraycopy(sphere, 0, shape, 0, shape.length);
		System.out.println(Arrays.toString(shape));
	}
}
/*Output
 * [SPHERE 0, SPHERE 1, SPHERE 2, SPHERE 3, SPHERE 4, SPHERE 5, SPHERE 6, SPHERE 7, SPHERE 8, SPHERE 9]
[SPHERE 10, SPHERE 10, SPHERE 10, SPHERE 10, SPHERE 10, SPHERE 10, SPHERE 10, SPHERE 10, SPHERE 10, SPHERE 10]
[SPHERE 10, SPHERE 10, SPHERE 10, SPHERE 10, SPHERE 10]
*/
