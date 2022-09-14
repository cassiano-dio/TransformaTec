programa
{
	
	funcao inicio()
	{
		inteiro numeros[5]
		inteiro indice, soma = 0

		para(indice = 0; indice < 5; indice ++){

			escreva("Informe o número para o índice [",indice,"]:")
			leia(numeros[indice])
			limpa()
				
		}

		limpa()

		para(indice = 0; indice < 5; indice = indice++){

			soma = soma + numeros[indice]
			
			escreva("O número do índice [",indice,"] é: ",numeros[indice],"\n")
			
		}

		escreva("\nA soma dos valores do vetor é: ", soma)
		
	}
}
