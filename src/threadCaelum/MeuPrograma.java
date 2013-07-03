package threadCaelum;

public class MeuPrograma {

	
	public static void main(String[] args) {
	
		GeraPDF gerapdf = new GeraPDF();
		Thread threadDoPdf = new Thread(gerapdf);
		threadDoPdf.start();
		//gerapdf.start();
		
		BarraDeProgresso barraDeProgresso = new BarraDeProgresso();
		Thread threadDaBarra = new Thread(barraDeProgresso);
		threadDaBarra.start();
		//barraDeProgresso.start();
		
	}

}
