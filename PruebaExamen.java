//Parte 1 - Paso 1
public interface PruebaExamen{  

	//Parte 1 - Paso 2
	public default void mensajeHola(){ 
		//Parte 1 - Paso 3
		System.out.println("Hola mi nombre es: Janeth Alejandra Garcia Quiroz"); 
	} 

	//Parte 1 - Paso 4
	public default void mensajeHola(String cadena){ 
		System.out.println("La cadena es: " + cadena);
	} 

	//Parte 1 - Paso 5
  	public static int operacionPrueba(int x, int y){  
  		int suma = x + y; 
 		return (suma); //Parte 1 - Paso 6
 	}
 	//Parte 1 - Paso 7
 	public void operacionPrueba(int a, int b, int c); 
}
	