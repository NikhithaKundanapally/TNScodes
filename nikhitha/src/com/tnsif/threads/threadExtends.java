package com.tnsif.threads;

public class threadExtends extends Thread{
	public void run()
	{
		int i=10;
		for(i=1;i<=10;i++)
		{
			try {
				System.out.println("Hello");
				Thread.sleep(2000);
			}
			catch(Exception e)
			{
				System.out.println(e);	
			}
		}
	}

}
