import java.util.List;

public class Ejercicios{
	public static void main(String[] args){

		List<Integer> numbers = List.of(12,	9, 13, 4, 6, 2, 4, 12, 15);
		List<String> courses = List.of("Spring", "Spring Boot", "API","Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");

		/*Números impares*/
		System.out.println("==Ejercicio 1==");
		NumImpares(numbers);

		/*Cursos*/
		System.out.println("\n==Ejercicio 2==");
		impCursos(courses);

		/*Palabras Spring*/
		System.out.println("\n==Ejercicio 3==");
		Spring(courses);
		
		/*Cursos con al menos 4 letras*/
		System.out.println("\n==Ejercicio 4==");
		NumLetras(courses);

		/*Números impares al cuadrado*/
		System.out.println("\n==Ejercicio 5==");
		ImpCuadrado(numbers);

		/*Número de caracteres en cada palabra*/
		System.out.println("\n==Ejercicio 6==");
		NumCaracteres(courses);
	}


	private static void printInt(int number){
		System.out.print(number + ", ");
	}
	private static void printString(String cursos){
		System.out.print(cursos + ", ");
	}
	private static void NumImpares(List<Integer> numbers){
		numbers.stream()
		.filter(number -> number % 2 != 0)
		.forEach(Ejercicios::printInt);
		System.out.println("");
	}
	private static void impCursos(List<String> courses){
		courses.stream()
		.forEach(cadena -> System.out.println(cadena));
	}
	private static void Spring(List<String> courses){
		courses.stream()
		.filter(cadena -> cadena.contains("Spring"))
		.forEach(Ejercicios::printString);
		System.out.println("");
	}
	private static void NumLetras(List<String> courses){
		courses.stream()
		.filter(cadena -> cadena.length()>4)
		.forEach(Ejercicios::printString);
		System.out.println("");
	}
	private static void ImpCuadrado(List<Integer> numbers){
		numbers.stream()
		.filter(number -> number % 2 != 0)
		.map(number->number * number * number)
		.forEach(Ejercicios::printInt);
		System.out.println("");
	}
	private static void NumCaracteres(List<String> courses){
		courses.stream()
		.forEach(cadena->System.out.print(cadena + ": " + cadena.length()+", "));
		System.out.println("\n");
	}
}