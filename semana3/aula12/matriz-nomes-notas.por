programa
{

	real notas[3][3]
	inteiro linha, coluna
	cadeia nomes[3]
	//cadeia nomes[5]
	
	funcao inicio()
	{

		para(linha = 0; linha < 3; linha++){

			escreva("Informe o nome do aluno ", linha,": ")
			leia(nomes[linha])
			
			para(coluna = 0; coluna < 3; coluna++){

				escreva("Informe a nota na posição: ", linha, "|",coluna,":")
				leia(notas[linha][coluna])
				
			}

			limpa()
		
		}

		limpa()
		
		para(linha = 0; linha < 3; linha++){

			escreva("Notas do aluno: ",nomes[linha], ": ")

			para(coluna = 0; coluna < 3; coluna++){

				escreva(notas[linha][coluna], " ")
				
			}
			escreva("\n")
			
		}

		
		
	}
}
