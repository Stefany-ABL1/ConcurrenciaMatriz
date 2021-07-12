import java.util.ArrayList;
import java.util.Random;

public class RunExample implements Runnable {
	private String linea;
	private int cont;
	private int valor =100;
	int num;

	public RunExample(int dimension ) {
		
	cont = dimension;
	}


	@Override
	public synchronized void run() {
		linea="";
		for( int i=1;i<=cont;i++){
			num = new Random().nextInt(valor)+valor;
		

			linea=linea+num;
			linea=linea+" ";
			valor = valor+120;


			try {
				Thread.sleep((new Random().nextInt(501)+500));

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(linea);

	}


}
