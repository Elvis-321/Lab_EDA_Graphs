
public class Nodo <Type>{

	protected Type data;
	protected Nodo<Type> next;
	
	public Nodo(Type data) {
		this.data = data;
		this.next = null;
	}
	public Nodo(Type data, Nodo<Type> next) {
		this.data = data;
		this.next = next;
	}
	public Type getData() {
		return data;
	}
	public Nodo<Type> getNext(){
		return next;
	}
	public void setData(Type data) {
		this.data = data;
	}
	public void setNext(Nodo<Type> next) {
		this.next = next;
	}
}

