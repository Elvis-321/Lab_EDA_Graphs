
public class Vertice<E> {

	protected E data;
	protected ListaLinked<Arista<E>> listAdj; // guarda las arista vecinas
	
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

