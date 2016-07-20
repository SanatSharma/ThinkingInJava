package codewarsRankingSystem;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test();
	}

	public static void test(){
		User user = new User();
		check(user.rank, -8); // => -8
		check(user.progress,0); // => 0
		user.incProgress(-7);
		check(user.progress,10); // => 10
		user.incProgress(-5); // will add 90 progress
		check(user.progress,0); // => 0 // progress is now zero
		check(user.rank,-7); // => -7 // rank was upgraded to -7
		user.incProgress(2);
		check(user.rank, -1);
		check(user.progress,40);
	}

	private static void check(int val, int i) {
		// TODO Auto-generated method stub
		if(val==i)
			System.out.println("Passed test");
		else{
			System.out.println(val);
			System.out.println("Failed test");
		}
	}
}
