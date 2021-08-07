
public class Vertice<E> {

	protected E data;
	protected ListaLinked<Arista<E>> listAdj; // guarda las arista vecinas
	protected int label; // o cuando no este visitado y 1 cuando este visitado
	
	public Vertice(E data) {
		this.data = data;
		listAdj = new ListaLinked<Arista<E>>();
	}
	
	public boolean equals(Object o) {
		if(o instanceof Vertice<?>) {
			Vertice<E> v = (Vertice<E>)o;
			return this.data.equals(v.data);
		}
		return false;
	}
	
	public String toString() {
		return this.data + "-->" + this.listAdj.toString() + "\n";
	}
}

