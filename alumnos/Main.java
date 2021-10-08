package actividad01_daw.alumnos;

public class Main{

	public static void main(String[] args) {
		
		int notas[] = new int[4];
		int notaMedia = 0;
		
		notas[0]=6;
		notas[1]=6;
		notas[2]=5;
		notas[3]=5;
		
	
		Alumno a1 = new Alumno("Ivan","Moreno",37,notas);
		
		System.out.println("Nombre: "+ a1.getNombre());
		System.out.println("Apellido: "+ a1.getApellido());
		System.out.println("Edad: "+ a1.getEdad());
		System.out.println("Notas: ");
		for(int i=0; i < a1.getNotas().length;i++){
			System.out.print(a1.getNotas()[i]+ " ");
		}
		notaMedia = notas[0] + notas[1] + notas[2] +notas[3];
		System.out.println("\nNota media: "+notaMedia);
		
		System.out.println("");
		
		Alumno a2 = new Alumno("Jose","Moreno",20,notas);
		
		System.out.println("Nombre: "+ a2.getNombre());
		System.out.println("Apellido: "+ a2.getApellido());
		System.out.println("Edad: "+ a2.getEdad());
		System.out.println("Notas: ");
		for(int i=0; i < a2.getNotas().length;i++){
			System.out.print(a2.getNotas()[i]+ " ");
		}
		notaMedia = notas[0] + notas[1] + notas[2] +notas[3];
		System.out.println("\nNota media: "+notaMedia);
		
		
	}


	}

	

