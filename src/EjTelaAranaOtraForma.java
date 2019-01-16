
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Cuántos elefantes pueden llegar a balancearse encima de una tela de araña
 * antes de que se rompa? La canción no arroja ninguna luz sobre este
 * particular, pero quizá tú puedas ayudarnos. Entrada Cada caso, leído de la
 * entrada estándar, consiste en dos líneas. La primera contiene el peso máximo
 * soportado por la tela de araña. La segunda contiene los pesos de cada
 * elefante, separados por espacio, en el orden en el que van llegando, y
 * termina con un 0. Todos los números son enteros positivos menores que 109. La
 * entrada acaba también con un 0, que no deberá procesarse. Salida Para cada
 * caso de prueba, el programa indicará, en la salida estándar, el número de
 * elefantes que pudieron balancearse en la tela, antes de que ésta se rompiera
 * o de que no hubiera más elefantes dispuestos a arriesgarse. Los elefantes se
 * van incorporando a la diversión por estricto orden de llegada.
 */

public class EjTelaAranaOtraForma {

	public static void main(String[] args) {

		Scanner sca = new Scanner(System.in);
		int suma;
		int token;
		int cont;
		int index = 0;
		boolean boo = true;
		boolean centinela = true;
		int pesTotal;
		int[] pesoEle = { 1 };
		StringTokenizer pesos;

		do {
			pesTotal = sca.nextInt();
			sca.nextLine();
			if (pesTotal == 0) {
				centinela = false;
			}

			pesos = new StringTokenizer(sca.nextLine());

			boo = true;
			suma = 0;
			cont = 0;

			while (pesos.hasMoreTokens() && boo) {
				token = Integer.parseInt(pesos.nextToken());
				suma = suma + token;
				
				if (suma <= pesTotal) {
					cont++;
					pesoEle[index] = cont;
					System.out.println(" cont: " + cont + " index= " + index); //para ver los contadores
					index++;
				} else {
					boo = false;
				}
			}

		} while (centinela); //variable de control

		sca.close();
		System.out.println("terminó");

		/*for (int n = 0; n < pesoEle.length; n++) {
			System.out.println(pesoEle[n]);
		}*/

	}

}
