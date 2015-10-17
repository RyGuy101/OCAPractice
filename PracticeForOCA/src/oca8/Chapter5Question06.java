package oca8;

public class Chapter5Question06
{
}

interface HasExoskeleton
{
	abstract int getNumberOfSections();
}

abstract class Insect implements HasExoskeleton
{
	abstract int getNumberOfLegs();
}

class Beetle extends Insect
{
	int getNumberOfLegs()
	{
		return 6;
	}

	@Override
	public int getNumberOfSections()
	{
		// TODO Auto-generated method stub
		return 0;
	}
}
