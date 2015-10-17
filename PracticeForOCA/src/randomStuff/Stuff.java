package randomStuff;
import java.awt.peer.LabelPeer;
import java.util.ArrayList;
import javax.sound.sampled.Line;
import javax.sound.sampled.LineListener;
import javax.xml.ws.handler.Handler;

public class Stuff
{
	public static void main(String[] args)
	{
		String wurd = "bats";
		StringBuilder sb = new StringBuilder(wurd);
		System.out.println(sb);
		System.out.println(sb.reverse());
		System.out.println(sb);
		System.out.println("");
		ArrayList<StringBuilder> sbldrl = new ArrayList<>();
		sbldrl.add(new StringBuilder("One"));
		sbldrl.add(new StringBuilder("Two"));
		sbldrl.add(new StringBuilder("Three"));
		int i = 0;
		for (StringBuilder sbldr : sbldrl)
		{
			if (i == 1)
			{
				sbldrl.remove(1);
			}
			i++;
		}
		System.out.println(sbldrl);
		System.out.println("");
		if (true ^ false)
		{
			System.out.println("yay!");
		}
		System.out.println("");
		int hi = 0;
		one: for (int a = 0; a < 3; a++)
		{
			two: for (int b = 0; b < 6; b++)
			{
				three: for (int c = 0; c < b; c++)
				{
					hi++;
					if (c % 3 == 0)
					{
						continue two;
					}
				}
			}
		}
		System.out.println(hi);
		System.out.println("");
		Test2 test2 = new Test2();
		test2.testing2();
		System.out.println("");
		Sup classy = new Sub();
		classy.test();
	}

	static class Sup
	{
		static void test()
		{
			System.out.println("sup");
		}
	}

	static class Sub extends Sup
	{
		static void test()
		{
			System.out.println("sub");
		}
	}
}
