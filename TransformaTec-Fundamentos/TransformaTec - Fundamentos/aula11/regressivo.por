programa 
{
	inclua biblioteca Util 
	
	funcao inicio() 
	{
	    
		inteiro contador
		escreva("Informe o número de início:\n")
		leia(contador)
		
		enquanto (contador > 0)
		{
			limpa()
			escreva ("Detonação em: ", contador)
		  	
		  	contador = contador - 1
		  	Util.aguarde(1000) // Aguarda 1000 millisegundos (1 segundo)
		}

		limpa()
		escreva ("Booom!\n")
	}
}