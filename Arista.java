
public class Arista <E>{

	protected Vertice<E> refDest;
	protected int weight; //peso de la arista
//	protected int label;
	
	public Arista(Vertice<E> refDest) {
		this(refDest,-1);
	}
	
	public Arista(Vertice<E> refDest, int weight) {
		this.refDest = refDest;
		this.weight = weight;
	}

	public boolean equals (Object o) {
		if(o instanceof Arista<?>) {
			Arista<E> e = (Arista<E>)o;
			return this.refDest.equals(e.refDest);
		}
		return false;
	}
	
	public String toString() {
		if(this.weight > -1) return refDest.data + " [" + this.weight + "], ";
		else return refDest.data + ", ";
	}
}

