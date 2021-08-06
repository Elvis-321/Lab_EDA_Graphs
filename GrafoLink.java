
public class GrafoLink <E>{

	protected ListaLinked<Vertice<E>> listaVertice;
	
	public GrafoLink() {
		listaVertice = new ListaLinked<Vertice<E>>();
	}
	
	public void insertVertice(E dato) {
		Vertice<E> nuevo = new Vertice<E>(dato);
		if(this.listaVertice.search(nuevo) != null) {//verifica si el vertice ya esta en el grafo
			System.out.println("El vertice ya fue insertado");
			return;
		}//de lo contrario
		this.listaVertice.insertFirst(nuevo);//se inserta el vertice en el grafo
	}
	
	public void insertArista(E verOri, E verDes) {
		Vertice<E> refOri = this.listaVertice.search(new Vertice<E>(verOri));
		Vertice<E> refDes = this.listaVertice.search(new Vertice<E>(verDes));
		
		if(refOri == null || refDes == null) {
			System.out.println("Vertice origen o destino no existe");
			return;
		}
		if(refOri.listAdj.search(new Arista<E>(refDes)) != null) {//verifica que no haya una arista que una ambos vertices
			System.out.println("La arista ya fue insertada anteriormete");
			return;
		}
		
		//se agrega a la lista de adayacentes el nuevo vertice
		refOri.listAdj.insertFirst(new Arista<E>(refDes));
		refDes.listAdj.insertFirst(new Arista<E>(refOri));//hace al grafo no direccional
	}
	public String toString() {
		return this.listaVertice.toString();
	}
}

