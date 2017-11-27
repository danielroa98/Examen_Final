/*Dada una cadena de caracteres, escriba una función recursiva que la imprima en orden inverso, pero agregado un guion antes de cada carácter. */
import java.util.Scanner;

public class Pregunta3
{
	public static void main (String[] args)
		{
			Scanner lectura = new Scanner (System.in);

      String inversa;

			System.out.print("\nInserte la palabra que desea alterar: \n");
			inversa = lectura.next();

			System.out.println("La palabra al ser invertida es: "+inversor(inversa,inversa.length()-1));

		}

			public static String inversor(String inversa, int tamaño){
				if(tamaño == 0)
					{
					return "-"+inversa.charAt(tamaño)+" ";
					}

				else
					{
					return inversa.charAt(tamaño) + (inversor(inversa, tamaño-1));
					}
			}
}
