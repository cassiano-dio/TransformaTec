programa 
{
	funcao inicio()
	{
		inteiro idade
		
		escreva ("Informe a idade da pessoa: ")
		leia (idade)
		
		se (idade < 18)
		{
			
			escreva ("\nCrianca\n")
		}
		senao 
		{
			
			se (idade > 18 e idade <65)
			{
				escreva ("\nAdulto\n")
			}
			senao
			{
				escreva ("\nIdoso\n")
			}
		}
	}
}