package oca8;

public class Chapter5Question09
{
}

interface CanFly
{
	void fly();
}

interface HasWings
{
	public abstract Object getWingSpan();
}

abstract class Falcon implements CanFly, HasWings
{
}