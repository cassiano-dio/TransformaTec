programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		inteiro matriz[3][4]
		inteiro linha, coluna

		para(linha = 0; linha < 3; linha++){
			
			para(coluna = 0; coluna < 4; coluna++){

				escreva("\nInforme o numero para a posicao: [",linha,"][",coluna,"]: ")
				leia(matriz[linha][coluna])
				
			}	
		}

		limpa()
		
		para(linha = 0; linha < 3; linha++){
			
			para(coluna = 0; coluna < 4; coluna++){

				escreva(matriz[linha][coluna], " ")
				
			}
			escreva("\n")	
		}
	}
}
