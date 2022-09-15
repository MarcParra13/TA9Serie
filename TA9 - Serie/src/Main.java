class Serie implements Empleable {
	//Atributos clase Serie
	String titulo = "";
	int nTemporadas = 3;
	boolean entregado = false;
	String genero = "";
	String creador = "";
	
	//Constructor por defecto
	Serie() {
		
	}
	
	//Constructor con el titulo y el creador
	Serie(String titulo, String creador) {
		this.titulo = titulo;
		this.creador = creador;
	}
	
	//Constructor con todos los atributos excepto el atributo "entregado"
	Serie(String titulo, int nTemporadas, String genero, String creador) {
		this.titulo = titulo;
		this.nTemporadas = nTemporadas;
		this.genero = genero;
		this.creador = creador;
	}
	
	//Métodos get y set de los atributos
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getnTemporadas() {
		return nTemporadas;
	}

	public void setnTemporadas(int nTemporadas) {
		this.nTemporadas = nTemporadas;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}

	//Sobreescribimos el método toString
	@Override
	public String toString() {
		return "Título: " + titulo +
				"\nNúmero de temporadas: " + nTemporadas +
				"\nGénero: " + genero +
				"\nCreador: " + creador + 
				"\nEntregado: " + isEntregado() +
				"\nSerie con más temporadas: " + compareTo(getnTemporadas());
	}
	
	//Métodos para entregar y devolver el libro/videojuego y para comprobar si está entregado.
	//Además de un método para comparar objetos
	@Override
	public boolean entregar() {
		
		entregado = true;
		
		return entregado;
	}

	@Override
	public boolean devolver() {
		
		entregado = false;
		
		return entregado;
	}

	@Override
	public boolean isEntregado() {
		
		return entregado;
		
	}

	@Override
	public Object compareTo(Object a) {
		
		a = nTemporadas;
		
		return a;
	}
}

//Clase Videojuego que implementa la interfície Empleable
class Videojuego implements Empleable{
	//Atributos clase Videojuego
	String titulo = "";
	int horasEstimadas = 10;
	boolean entregado = false;
	String genero = "";
	String compania = "";
	
	//Constructores
	Videojuego() {
		
	}
	
	Videojuego(String titulo, int horasEstimadas) {
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
	}
	
	Videojuego(String titulo, int horasEstimadas, String genero, String compania) {
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.genero = genero;
		this.compania = compania;
	}
	
	//Métodos get y set de los atributos
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getHorasEstimadas() {
		return horasEstimadas;
	}

	public void setHorasEstimadas(int horasEstimadas) {
		this.horasEstimadas = horasEstimadas;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCompania() {
		return compania;
	}

	public void setCompania(String compania) {
		this.compania = compania;
	}
	
	//Método toString para sobreescribir la salida por teclado
	@Override
	public String toString() {
		return "Título: " + titulo +
				"\nHoras estimadas: " + horasEstimadas +
				"\nGénero: " + genero +
				"\nCompañía: " + compania + 
				"\nEntregado: " + isEntregado() +
				"\nTítulo con más horas estimadas: " + compareTo(getTitulo());
	}
	
	//Métodos para entregar y devolver el libro/videojuego y para comprobar si está entregado.
	//Además de un método para comparar objetos
	@Override
	public boolean entregar() {
		
		entregado = true;
		
		return entregado;
	}

	@Override
	public boolean devolver() {
		
		entregado = false;
		
		return entregado;
	}

	@Override
	public boolean isEntregado() {
		
		return entregado;
		
	}

	@Override
	public Object compareTo(Object a) {
		
		return a;
	}
}

//Clase Main
public class Main {

	public static void main(String[] args) {
		//Variables
		int contEntregados = 0;
		
		//Arrya de objetos de 5 de longitud con sus respetctivos constructores
		Serie arraySerie[] = new Serie [5];
		
		arraySerie[0] = new Serie("A", 2, "A", "A");
		arraySerie[1] = new Serie("B", 4, "B", "B");
		arraySerie[2] = new Serie("C", 6, "C", "C");
		arraySerie[3] = new Serie("D", 8, "D", "D");
		arraySerie[4] = new Serie("E", 10, "E", "E");
		
		Videojuego arrayVideojuego[] = new Videojuego [5];
		
		arrayVideojuego[0] = new Videojuego("F", 2, "F", "F");
		arrayVideojuego[1] = new Videojuego("G", 4, "G", "G");
		arrayVideojuego[2] = new Videojuego("H", 6, "H", "H");
		arrayVideojuego[3] = new Videojuego("I", 8, "I", "I");
		arrayVideojuego[4] = new Videojuego("J", 10, "J", "J");
		
		
		System.out.println("Resultados Series:");
		for (int i = 0;i < arraySerie.length;i++){
			System.out.println("---------------------------------");
			
			//Generamos un numero aleatorio y si el número es par se entrega
            int numeroAleatorio = (int) (Math.random()*4+0);
            
            if(numeroAleatorio % 2 == 0) {
            	arraySerie[i].entregar();
            }
			
			//Si la serie está entregada, suma 1 al contador
            if(arraySerie[i].isEntregado() == true) {
            	contEntregados++;
            }
            
            //Mostramos el resultado
			System.out.println(arraySerie[i].toString());
            
            System.out.println();
        }
		
		System.out.println();
		
		System.out.println("Resultados Videojuegos:");
		for (int i = 0;i < arrayVideojuego.length;i++){
            System.out.println("---------------------------------");
            
            //Generamos un numero aleatorio y si el número es par se entrega
            int numeroAleatorio = (int) (Math.random()*4+0);
            
            
            if(numeroAleatorio % 2 == 0) {
            	arrayVideojuego[i].entregar();
            }
            
            //Si la serie está entregada, suma 1 al contador
            if(arrayVideojuego[i].isEntregado() == true) {
            	contEntregados++;
            }
            
            //Mostramos el resultado
            System.out.println(arrayVideojuego[i].toString());
       
            System.out.println();
        }
		
		//Mostramos el contador de entregados
		System.out.println("El contador de series y videojuegos entregados es de " + contEntregados);
	}

}
