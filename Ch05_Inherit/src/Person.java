

public class Person
{
	private int weight;
	int age;
	protected int height;
	public String name;

	public Person() {}
	
	public Person(int weight, int age, int height, String name) 
	{
		this.weight = weight;
		this.age = age;
		this.height = height;
		this.name = name;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public int getWeight() {
		return weight;
	}
}
