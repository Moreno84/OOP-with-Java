package actividad01_daw.alumnos;

public class Alumno {
	
	//Atributos
	
	private String nombre;
	private String apellido;
	private int edad;
	private int notas[];
	private int notaMedia;

	
	
	//Método constructor
	
	public Alumno(String nombre, String apellido, int edad,int notas[]){
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.notas = notas;
	
		
	}
	
	//Métodos Getter
	
	public String getNombre(){
		return nombre;
	}
	
	public String getApellido(){
		return apellido;
	}
	
	public int getEdad(){
		return edad;
	}
	
	public int[] getNotas(){
		return notas;
		
	}
	
	public int getNotaMedia(){
		return notaMedia;
	}
	
	//Métodos Setter
	
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	
	public void setApellido(String apellido){
		this.apellido = apellido;
	}
	
	public void setEdad(int edad){
		this.edad = edad;
	}
	
	public void setNotas(int[] notas){
		this.notas = notas;

	}

	public void setNotaMedia(int notaMedia) {
		this.notaMedia = notaMedia;
	}
	

	
	

	
                                                      
	
	

}
