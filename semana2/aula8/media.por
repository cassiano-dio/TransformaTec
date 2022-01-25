programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio ()
	{
		real n1, n2, n3, n4, media
		inteiro corte
		
		escreva ("Informe a nota de corte: ")
		leia (corte)

		escreva ("Informe a nota 1: " )
		leia (n1)
		escreva( "Informe a nota 2: ")
		leia (n2)
		escreva ("Informe a nota 3: ")
		leia (n3)
		escreva ("Informe a nota 4: ")
		leia (n4)

		media = (n1 + n2 + n3 + n4) / 4 

		limpa()

		se (media < corte)
		{ 
			escreva ("Reprovado\n") 
		}senao{
			escreva ("Aprovado\n")
		}		
	}
}