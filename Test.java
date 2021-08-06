
public class Test {

	public static void main(String[] args) {
		
		GrafoLink<Integer> num = new GrafoLink<Integer>();
		
		num.insertVertice(1);
		num.insertVertice(2);
		num.insertVertice(3);
		num.insertVertice(4);
		num.insertVertice(5);
		num.insertVertice(6);
		num.insertVertice(7);
		
		num.insertArista(1, 2);
		num.insertArista(1, 3);
		num.insertArista(2, 4);
		num.insertArista(3, 2);
		num.insertArista(3, 4);
		num.insertArista(3, 5);
		num.insertArista(5, 6);
		num.insertArista(5, 7);
		
		System.out.println("Grafo ciudades: \n"+num);
	}
}

