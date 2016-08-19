package prueba3;

public class Main {
	public static void main (String [] args){

	int []arreglo = {5,10,29,7,15,23,32,45,54,67,76,89,98,1,6,72,91,19,28,82};
	Ordenador o = new Ordenador ();
	o.ordenarQuicksort(arreglo);

	for(int i=0; i<arreglo.lenght;i++)
	{
		System.out.println(arreglo[i]);
	}
	}

}