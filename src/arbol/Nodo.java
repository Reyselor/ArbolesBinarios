package arbol;
public class Nodo {
	private String dato;  
	private Nodo izquierda; 
	private Nodo derecha; 
	
	public Nodo(String dato) {
		this.dato=dato; 
		this.izquierda=null; 
		this.derecha=null; 
	}
	public String getDato() {
		return dato;
	}
	public void setDato(String dato) {
		this.dato = dato;
	}
	public Nodo getIzquierda() {
		return izquierda;
	}
	public void setIzquierda(Nodo izquierda) {
		this.izquierda = izquierda;
	}
	public Nodo getDerecha() {
		return derecha;
	}
	public void setDerecha(Nodo derecha) {
		this.derecha = derecha;
	}
}
