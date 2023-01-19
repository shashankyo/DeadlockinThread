package hulkthorthreading;

public class Warrior implements Runnable{
String w1 = "Hammer";
String w2 = "Axe";
String w3 = "Stone";

public void run()
{
	if(Thread.currentThread().getName().equals("THOR"))
	{
		thor();
	}
	else
	{
		hulk();
		
	}
}
void thor()
{
	try
	{
		synchronized(w1)
		{
			System.out.println("Thor has weapon" + w1);
			Thread.sleep(2000);
			synchronized(w2)
			{
				System.out.println("Thor has weapon" + w2);
				Thread.sleep(2000);
				synchronized(w3)
				{
					System.out.println("Thor has weapon" + w3);
					Thread.sleep(2000);
		}
	}
}
}
	
	catch(Exception e)
	{
		e.printStackTrace();
	}
}

void hulk()
{
	try
	{
		synchronized(w3)
		{
			System.out.println("hulk has weapon" + w3);
			Thread.sleep(2000);
			synchronized(w1)
			{
				System.out.println("hulk has weapon" + w1);
				Thread.sleep(2000);
				synchronized(w2)
				{
					System.out.println("hulk has weapon" + w2);
					Thread.sleep(2000);
		}
	}
}
}
	
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
}