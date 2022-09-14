programa
{
	
	funcao inicio()
	{

		//declaração do vetor de números do tipo inteiro com dez posições
		inteiro numeros[10]

		//posição (índice) do vetor
		inteiro posicao, soma = 0

		//laço de repetição para alimentar as posições do vetor
		para(posicao = 0; posicao < 10; posicao++){
			
			escreva("Informe o número para a posição [", posicao, "] do vetor: ")
			leia(numeros[posicao])
			limpa()
		
		}

		//laço de repetição para imprimir os dados do vetor
		para(posicao = 0; posicao < 10; posicao++){

			soma = soma + numeros[posicao]

			escreva("Número na posição [", posicao,"] do vetor: ", numeros[posicao])
			escreva("\n")
			
		}

		escreva("\nA soma é: ", soma)
	}
}
