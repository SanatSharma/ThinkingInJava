package Integers;
/*Professor Chambouliard hast just discovered a new type of magnet material. He put particles of this material in a box made of small boxes arranged in K rows and N columns as a kind of 2D matrix K x N where K and N are postive integers. He thinks that his calculations show that the force exerted by the particle in the small box (k, n) is:

v(k, n) = {1}/{k(n+1)^{2k}}

The total force exerted by the first row with k = 1 is:

u(1, N) = \sum_{n=1}^{n=N}v(1, n) = \frac{1}{1.2^2} + \frac{1}{1.3^2}+...+\frac{1}{1.(N+1)^2}

We can go on with k = 2 and then k = 3 etc ... and consider:

S(K, N) = \sum_{k=1}^{k=K}u(k, N) = \sum_{k=1}^{k=K}(\sum_{n=1}^{n=N}v(k, n)) \rightarrow (doubles(maxk, maxn))

Task:

To help Professor Chambouliard can we calculate the function doubles that will take as parameter maxk and maxn such that doubles(maxk, maxn) = S(maxk, maxn)? Experiences seems to show that this could be something around 0.7 when maxk and maxn are big enough.

Examples:

double(1, 3)  => 0.4236111111111111
double(1, 10) => 0.5580321939764581
double(10, 100) => 0.6832948559787737
 */
public class Magnet_MathFormula {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test();

	}

	private static void test() {
		// TODO Auto-generated method stub
		check(doubles(1,3),0.4236111111111111);
		check(doubles(1,10),0.5580321939764581);
		check(doubles(10,100), 0.6832948559787737);
		check(doubles(10, 10000), 0.6930471674194457);
	}

	private static void check(double doubles, double d) {
		// TODO Auto-generated method stub
		if(Math.abs(doubles-d) < 1e-6)
			System.out.println("Passed test");
		else{
			System.out.println(doubles -d );
			System.out.println("Failed test");
		}
	}

	public static double doubles(int maxk, int maxn) {
		// your code
		double sum = 0.0;
		for(int j=1;j<=maxk;j++){
			for(int i=1;i<=maxn;i++){
				sum+= 1/(1.0* (j * Math.pow((i+1), (j*2))));
			}
		}
		return sum;
	}
}
