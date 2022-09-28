public class Recursiva {
	
	public static int somar(int numero)
	{
		if (numero == 0) 
			return 0;
		
		return numero + somar(numero-1);
	}
}
