
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
		
		num.insertVertice(8);
		num.insertVertice(9);
		num.insertVertice(10);
		
		num.insertArista(1, 2, 8);
		num.insertArista(1, 3, 1);
		num.insertArista(2, 4, 2);
		num.insertArista(3, 2, 5);
		num.insertArista(3, 4, 7);
		num.insertArista(3, 5, 5);
		num.insertArista(5, 6, 9);
		num.insertArista(5, 7, 3);
		
		num.insertArista(8,9,4);
		num.insertArista(9,10,4);
		num.insertArista(8, 1, 1);
		
		GrafoLink<Integer> num2 = new GrafoLink<Integer>();
		
		num2.insertVertice(8);
		num2.insertVertice(9);
		num2.insertVertice(10);
		
		num2.insertArista(8,9,4);
		num2.insertArista(9,10,4);
		
		System.out.println("Grafo num: \n"+num);
		
		num.DFS(1);
		System.out.println();
		num.DFS(4);
		System.out.println();
		
		System.out.println("Grafo num2: \n"+num);
		
		System.out.println(num2.estaIncluido(num));
	}
}
