

public class Quicksort {

	public static void main (String [] args){

	int []arreglo = {5,10,29,7,15,23,32,45,54,67,76,89,98,1,6,72,91,19,28,82};
	Ordenador o = new Ordenador ();
	o.ordenarQuicksort(arreglo);

	for(int i=0; i<arreglo.lenght;i++)
	{
		System.out.println(arreglo[i]);
	}
	}

	
	public static void ordenarQuicksort (int [] array)
	{
		array = quicksort1(array);
	}
	public int[] quicksort1(int numeros[]){
		return quicksort2 (numeros,0,numeros.lenght-1);
	}
	public int [] quicksort2(int numeros[], int izq, int der)
	{
		if(izq>=der)
			return numeros;
			int i=izq,d=der;
			if(izq!=der)
			{
				int pivote;
				int aux;
				pivote = izq;
				while (izq !=der)
				{
					while(numeros[der]>=numeros[pivote] && izq<der)
						der--;
					while(numeros[izq]<numeros[pivote] && izq<der)
						izq++;
				if (der!=izq)
				{
					aux = numeros[der];
					numeros[der]= numeros[izq];
					numeros[izq]=aux;
				}

				}
		if (izq==der) 
		{
			quicksort2(numeros.i,izq-1);
			quicksort2(numeros,izq+1,d);	
		}
			}
		else
			return numeros;
		return numeros;
	}
}
