public class PersonData
{
	String name;
	int height;
	float weight;
	
	public Person()
	
	{
		super();
	}
	
	public Person(String name, int height, float weight)
	{
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	
	public static void main(String[]args)
	{
		Person p = new Person("Ram", 6, 56.8f);
		
		System.out.println(p.name);
		System.out.println(p.height);
		System.out.println(p.weight);
		
		Person p1 = new Person();
	}
	
}