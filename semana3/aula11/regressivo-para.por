programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		inteiro contador, limite

		escreva("Informe o tempo do contador: ")
		leia(limite)

		para(contador = limite; contador > 0; contador--){
			escreva("Tempo para a detonação: ", contador, " segundos")
			Util.aguarde(1000)
			limpa()
		}

		escreva("Kabooooooom!!!")
		
	}
}
