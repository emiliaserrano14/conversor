import java.util.Scanner;

public class main {
  public static void main(String[] args) {
	  
	  EXTERNA:
	while(true) {
		System.out.println("conversor de monedas");
		System.out.println("1 - dolares \n"
		+ "2 - euros \n"
		+ "3 - soles \n"
		+ "4 - salir");
		
		System.out.println("Ingrese una opcion: ");
		Scanner leer = new Scanner(System.in);
		char option = leer.next().charAt(0);
		
		switch(option)
		{
		case '1':
		    convertir(0.019, "Dolar");
		    break;
		case '2':
		    convertir(0.019, "Euros");
		    break;
		case '3':
		    convertir (0.074, "Soles");
		    break;
		case '4':
			System.out.println("cerrando programa");
			break EXTERNA;
			
			default:
				System.out.println("opcion incorrecta");
				break;
		}
	}
}
  
  static void convertir(double valor, String pais) {
	  
	  Scanner leer = new Scanner(System.in);
	  System.out.printf("Igrese la cantidad de %s  :", pais);
	  
	  double cantidadMoneda = leer.nextDouble();
	  double pesosDominicanos = cantidadMoneda/valor;
	  
	  pesosDominicanos = (double) Math.round(pesosDominicanos * 100d)/100;
	  
	  System.out.println("------------------------------------------------------");
	  System.out.println("|   tienes $" + pesosDominicanos + "  de pesos Dominicanos    |");
	  System.out.println("------------------------------------------------------");

  }
}
