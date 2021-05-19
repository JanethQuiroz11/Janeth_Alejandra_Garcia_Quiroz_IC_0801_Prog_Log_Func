
//Parte 2 - Paso 1
public class Principal{

	//Parte 2 - Paso 2
	 public static void main(String[] args) { 
	 	
	 	//Parte 2 - Paso 3 
	 	//PruebaExamen pe = new PruebaExamen();

	 	//Parte 2 - Paso 4
	 	PruebaExamen pe = (a, b, c) -> System.out.println("La suma de tres numeros es: " + (a + b + c));
	 	pe.operacionPrueba(2, 4, 6);

	 	//Parte 2 - Paso 5
	 	System.out.println("La suma de dos numeros es: " + PruebaExamen.operacionPrueba(6, 2)); 
	 	
	 	//Parte 2 - Paso 6
	 	pe.mensajeHola(); 

	 	//Parte 2 - Paso 7
	 	pe.mensajeHola("Janeth"); 

	 	//Parte 2 - Paso 8
	 	pe = (a, b, c) -> System.out.println("El resultado es: " + (a + (b * c)));
	 	pe.operacionPrueba(2, 4, 6);
	 	
	 	//Parte 2 - Paso 9
	 	pe.operacionPrueba(2, PruebaExamen.operacionPrueba(1, 1), PruebaExamen.operacionPrueba(1, 1));

	 	//Parte 2 - Paso 12
	 	miMetodo(pe);

	 	//Parte 2 - Paso 13
	 	miMetodo((int a, int b, int c) -> System.out.println("El resultado es: " + (a + (b / c))));

	 	//Parte 2 - Paso 16
	 	pe = (int a, int b, int c) -> System.out.println( "El resultado es: " + (a + ((b * 1.0) / (c * 1.0))));

	 	//Parte 2 - Paso 17
	 	miMetodo(pe, 2, 2, 2);
	 }

	 //Parte 2 - Paso 10
	 private static void miMetodo(PruebaExamen objeto){
	 	//Parte 2 - Paso 11
	 	objeto.operacionPrueba(4, PruebaExamen.operacionPrueba(1, 1), PruebaExamen.operacionPrueba(1, 7));	
	 }

	 //Parte 2 - Paso 14
	 private static void miMetodo (PruebaExamen objeto, int a, int b, int c){
	 	//Parte 2 - Paso 15
	 	objeto.operacionPrueba(a, PruebaExamen.operacionPrueba(a, b), PruebaExamen.operacionPrueba(c, c));
	 }
}