
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
	
	public void insertArista(E verOri, E verDes) {//permite insertar aristas sin peso
		this.insertArista(verOri, verDes, -1);
	}
	
	public void insertArista(E verOri, E verDes, int weight) {//permite insertar aristas con peso
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
		refOri.listAdj.insertFirst(new Arista<E>(refDes,weight));
		refDes.listAdj.insertFirst(new Arista<E>(refOri,weight));//hace al grafo no direccional
	}
	
	public String toString() {
		return this.listaVertice.toString();
	}
	
	private void initLabel() {
		Nodo<Vertice<E>> aux = this.listaVertice.first();
		for(;aux != null; aux = aux.getNext()) {
			aux.data.label = 0; // no explorado
			Nodo<Arista<E>> auxE = aux.data.listAdj.first();
			for(;auxE != null; auxE = auxE.getNext())
				auxE.data.label = 0;
		}
	}

	private void DFSRec(Vertice<E> v) {
		v.label = 1;
		System.out.print(v.data + ", ");
		Nodo<Arista<E>> e = v.listAdj.first();
		for(; e != null; e = e.getNext()) {
			if(e.data.label == 0) {
				Vertice<E> w = e.data.refDest;
				if(w.label == 0) {
					e.data.label = 1;
					DFSRec(w);
				}else
					e.data.label = 2;
			}
		}
	}
	
	public void DFS (E data) {
		Vertice<E> v = this.listaVertice.search(new Vertice<E>(data));
		if(v == null) {
			System.out.println("Vertice no existe para hacer DFS");
			return;
		}
		initLabel();
		DFSRec(v);
	}
	
}
