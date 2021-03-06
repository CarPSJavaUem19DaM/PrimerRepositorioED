
import java.util.Scanner;
import java.util.StringTokenizer;

/** Cu�ntos elefantes pueden llegar a balancearse encima de una tela de ara�a antes de que se rompa? La canci�n no arroja ninguna luz sobre este
 * particular, pero quiz� t� puedas ayudarnos. Entrada Cada caso, le�do de la entrada est�ndar, consiste en dos l�neas. La primera contiene el peso m�ximo
 * soportado por la tela de ara�a. La segunda contiene los pesos de cada elefante, separados por espacio, en el orden en el que van llegando, y
 * termina con un 0. Todos los n�meros son enteros positivos menores que 109. La entrada acaba tambi�n con un 0, que no deber� procesarse. Salida Para cada
 * caso de prueba, el programa indicar�, en la salida est�ndar, el n�mero de elefantes que pudieron balancearse en la tela, antes de que �sta se rompiera
 * o de que no hubiera m�s elefantes dispuestos a arriesgarse. Los elefantes se van incorporando a la diversi�n por estricto orden de llegada. */

public class EjTelaArana {

	public static void main(String[] args) {

		Scanner sca = new Scanner(System.in);
		int suma;
		int token;
		int cont;
		boolean boo = true;
		int pesTotal;
		int[] pesoEle;
		StringTokenizer pesos;

		System.out.println("N�mero de entradas: ");
		int numEntradas = sca.nextInt();
		sca.nextLine();
		pesoEle = new int[numEntradas];

		for (int i = 0; i < numEntradas; i++) {
			System.out.println("Entrada " + (i + 1) + " (peso total soportado): ");
			pesTotal = sca.nextInt();
			sca.nextLine();
			System.out.println("Introduce el peso de los elefantes separados por espacio y terminado en 0: ");
			pesos = new StringTokenizer(sca.nextLine());

			boo = true;
			suma = 0;
			cont = 0;

			while (pesos.hasMoreTokens() && boo) {
				token = Integer.parseInt(pesos.nextToken());
				if (token != 0 && token < 109) {
					suma = suma + token;
					if (suma <= pesTotal) {
						cont++;
						pesoEle[i] = cont;
					} else {
						boo = false;
					}
				}
			}
		}
		sca.close();
		
		System.out.println("Salida (n� de elefantes balanceados): ");
		for (int n = 0; n < pesoEle.length; n++) {
			System.out.println(pesoEle[n]);
		}

	}

}
