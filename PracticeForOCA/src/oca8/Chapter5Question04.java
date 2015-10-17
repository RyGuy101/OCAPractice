package oca8;

public class Chapter5Question04
{
}

class Rodent
{
	protected Object chew() throws Exception
	{
		System.out.println("Rodent is chewing");
		return 1;
	}
}

class Beaver extends Rodent
{
	public /*Number*/ Integer chew() throws RuntimeException
	{
		System.out.println("Beaver is chewing on wood");
		return 2;
	}
}
