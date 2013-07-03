package threadCaelum;

public class GeraPDF extends Thread /*implements Runnable -- extends Thread*/{

	public void run(){
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
		System.out.println("GEROU PDF!");
	}

}
