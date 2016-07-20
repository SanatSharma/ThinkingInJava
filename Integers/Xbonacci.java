package Integers;
/*If you have completed the Tribonacci sequence kata, you would know by now that mister
 Fibonacci has at least a bigger brother. If not, give it a quick look to get how things work.

Well, time to expand the family a little more: think of a Quadribonacci starting with a signature
 of 4 elements and each following element is the sum of the 4 previous, a Pentabonacci 
 with a signature of 5 elements and each following element is the sum of the 5 previous,
 and so on.

Well, guess what? You have to build a Xbonacci function that takes a signature of X elements 
- and remember each next element is the sum of the last X elements - and returns the first n 
elements of the so seeded sequence
*/
public class Xbonacci {
	
	  public static void main(String[] args){
		  Xbonacci variabonacci = new Xbonacci();
		  variabonacci.basicTests();
	  }
	  

//	  @After
	  public void tearDown( Xbonacci variabonacci) throws Exception {
	    variabonacci = null;
	  }
	  
//	  @Test
	  /*Xbonacci([1,1,1,1],10)==[1,1,1,1,4,7,13,25,49,94]
		Xbonacci([0,0,0,0,1],10)==[0,0,0,0,1,1,2,4,8,16]
		Xbonacci([1,0,0,0,0,0,1],10)==[1,0,0,0,0,0,1,2,3,6]*/
	  public void basicTests() {
	    assertArrayEquals(new double []{0,1,1,2,3,5,8,13,21,34}, xbonacci(new double []{0,1},10));
	    assertArrayEquals(new double []{1,1,2,3,5,8,13,21,34,55}, xbonacci(new double []{1,1},10));
	    assertArrayEquals(new double []{0,0,0,0,1,1,2,4,8,16}, xbonacci(new double []{0,0,0,0,1},10));    
	    assertArrayEquals(new double []{1,0,0,0,0,0,1,2,3,6}, xbonacci(new double []{1,0,0,0,0,0,1},10));  
	    assertArrayEquals(new double []{1,1,1,1,4,7,13,25,49,94}, xbonacci(new double []{1,1,1,1},10));  
	    assertArrayEquals(new double []{0,0,0,0,1,1,2,4,8,16}, xbonacci(new double []{0,0,0,0,1},10));  
	  }
	  
	  private static void assertArrayEquals(double []expecteds, double[] actuals) {
		  
	    for(int i = 0; i < actuals.length; i++){
	    	if(expecteds[i]!= actuals[i]){
	    		System.out.println("Test failed");
	    		return;
	    	}
	    }
	    
	    System.out.println("Test passed");
	  } 

	public double[] xbonacci(double[] signature, int n) {
		 int xValue = signature.length;
		 double[] result = new double[n];
		 int elementsAdded = 0;
		 for(double d: signature){
			 result[elementsAdded] = d;
			 elementsAdded++;
		 }
		 int pos = 0;
		 while(elementsAdded < n){
			pos = elementsAdded - xValue;
			double sum = 0;
			for(int i = pos;i < elementsAdded;i++)
				sum += result[i];
			result[elementsAdded] = sum;
			elementsAdded++;
		 }
		 return result;
	  }
}
