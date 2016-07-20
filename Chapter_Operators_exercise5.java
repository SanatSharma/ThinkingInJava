/* Create a class called Dog containing
  two Strings: name and says. In main( ), create two dog objects with names “spot” (who says, “Ruff!”) and “scruffy” (who says, “Wurf!”). 
  Then display their names and what they say.
 */
class Dog
{
	String name;
	String says;
}
public class Chapter_Operators_exercise5 
{
	
	public static void main(String[] args) 
	{
		Dog d= new Dog();
		d.name= "spot";
		d.says= "Ruff!";
		System.out.println("Name of object1: "+ d.name+"\nObject1 says: "+d.says);
		
		Dog s = new Dog();
		s.name= "scruffy";
		s.says= "Wurf!";
		System.out.println("Name of object2: "+ s.name+"\nObject2 says: "+s.says);
	}

}
