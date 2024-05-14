package excersie;

import java.util.Random;

public class LuckyNumber extends Thread {
	@Override
	public void run() {
		int num=1;
		int i=1;
		Random rnd= new Random();
		while (i<=50) {
			num=Math.abs(rnd.nextInt()%100);
			System.out.println(" "+ num);
			i++;
		}
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			
		}
		
		System.out.println("lucky number: "+num);
	}
}
