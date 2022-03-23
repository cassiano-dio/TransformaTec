programa
{
	
	funcao inicio()
	{
		inteiro numeros[10]
		inteiro indice, indice_pesquisa
		inteiro numero_pesquisado

		para(indice = 0; indice < 10; indice++){
			escreva("Informe o número para a posição ", indice,": ")
			leia(numeros[indice])
			limpa()
		}

		para(indice = 0; indice < 10; indice++){

			escreva("O número da posição ", indice," é: ", numeros[indice],"\n")
		}

		escreva("\nInforme o indice que deseja pesquisar: ")
		leia(indice_pesquisa)

		numero_pesquisado = numeros[indice_pesquisa]

		escreva("\nO número pesquisado é: ", numero_pesquisado)
		
	}
}
