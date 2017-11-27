/*Programe una solución para conocer su calificación del curso, sabiendo que los dos parciales tienen un peso de 27.5% cada uno, el proyecto final 15% y el examen final 30%. Se le debe solicitar al usuario la calificación de cada examen o proyecto, y se debe generar un archivo de texto con la ponderación y la suma final.*/
import java.util.Scanner;
import java.io.*;

public class Pregunta4
{
  public static void main(String[] args)throws IOException
  {
    Scanner lectura = new Scanner(System.in);

    File archivo;

    archivo = new File("Promedios.csv");
    archivo.createNewFile();

    FileWriter escritor = new FileWriter(archivo, true);

    double val1 = .275;
    double val2 = .275;
    double val3 = .30;
    double val4 = .15;

    double total;
    double primer, segundo, proyecto, examen, porc1, porc2, porc3, porc4;

    System.out.println("Bienvenido al sistema para calcular su calificación");
    System.out.println(" ");

    System.out.println("Inserte la calificación del primer parcial");
    primer = lectura.nextDouble();
    System.out.println(" ");

    System.out.println("Inserte la calificación del segundo parcial");
    segundo = lectura.nextDouble();
    System.out.println(" ");

    System.out.println("Inserte la calificación de su proyecto");
    proyecto = lectura.nextDouble();
    System.out.println(" ");

    System.out.println("Por último, inserte la calificación de su examen final");
    examen = lectura.nextDouble();
    System.out.println(" ");

    porc1 = (primer * val1);
    System.out.println(primer+"\t27.5%\t"+porc1);

    porc2 = (segundo * val2);
    System.out.println(segundo+"\t27.5%\t"+porc2);

    porc3 = (examen * val3);
    System.out.println(examen+"\t30%\t"+porc3);

    porc4 = (proyecto * val4);
    System.out.println(proyecto+"\t15%\t"+porc4);

    total = porc1 + porc2 + porc3 + porc3 + porc4;

    System.out.println("\tTOTAL:\t"+total);

    PrintWriter pw = new PrintWriter(escritor);

    pw.printf("Promedio: "+total);

    escritor.close();
  }
}
