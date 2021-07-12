import javax.swing.JOptionPane;

public class Runner {

	public static void main(String [] args){

		int dimension =Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese la dimension de la matriz"));
		for (int i = 0; i <dimension; i++) {
			

			RunExample hilo = new RunExample(dimension);
			Thread thOne = new Thread(hilo);
//			Thread thTwo = new Thread(hilo);
//			Thread thThree = new Thread(hilo);
//			Thread thFour = new Thread(hilo);

			thOne.start();
//			thTwo.start();
//			thThree.start();
//			thFour.start();
		}
	}
}
