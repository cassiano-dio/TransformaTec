programa
{
	
	funcao inicio()
	{
		cadeia nomes[5]
		inteiro indice, indice_pesquisa
		cadeia nome_pesquisado

		para(indice = 0; indice < 5; indice++){
			escreva("Informe o nome para a posição ", indice,": ")
			leia(nomes[indice])
			limpa()
		}

		para(indice = 0; indice < 5; indice++){

			escreva("O nome da posição ", indice," é: ", nomes[indice],"\n")
		}

		escreva("\nInforme o indice que deseja pesquisar: ")
		leia(indice_pesquisa)

		nome_pesquisado = nomes[indice_pesquisa]

		escreva("\nO nome pesquisado é: ", nome_pesquisado)
		
	}
}
