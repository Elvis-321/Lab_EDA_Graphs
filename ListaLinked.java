
public class ListaLinked <T> {

	private Nodo<T> first;
	
	public ListaLinked() {
		this.first = null;
	}
	
	public boolean isEmpty() {
		return this.first == null;
	}
	
	public T search(T x) {
		Nodo<T> aux= this.first;
		while(aux != null && !aux.data.equals(x))
			aux = aux.getNext();
		if(aux != null)
			return aux.data;
		return null;
	}

	public void insertFirst(T x) {
		this.first = new Nodo<T>(x,this.first);
	}
	
	public String toString() {
		String str="";
		Nodo<T> aux = this.first;

		while(aux != null) {
			str = str + aux.getData();
			aux = aux.getNext();
		}
		return str;
	}
}

