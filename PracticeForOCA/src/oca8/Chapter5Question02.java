package oca8;
public class Chapter5Question02 extends Mammal
{
	public Chapter5Question02()
	{
		System.out.println("Platyous");
	}

	public static void main(String[] args)
	{
		new Chapter5Question02();
	}
}

class Mammal
{
	public Mammal(int age)
	{
		System.out.println("Mammal");
	}
	
	public Mammal(){
		System.out.println("Mammal");
	}
}
