package lll;

public class Sourabh extends Thread

{
	public void run()
	{
		System.out.println("nama");
		
	}

}
class baba
{
	public static void main(String args[])
	{
		Sourabh t=new Sourabh();
		t.start();
	}
}