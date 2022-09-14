programa
{

	cadeia nomes[5]
	real notas[5]
	inteiro indice
	
	funcao inicio()
	{
		para(indice = 0; indice < 5; indice++){

			escreva("Informe o nome do aluno ", indice,": ")
			leia(nomes[indice])

			escreva("Informe a nota do aluno", indice,": ")
			leia(notas[indice])
			
		}

		limpa()

		para(indice = 0; indice < 5; indice++){

			escreva("O aluno ", nomes[indice] , " teve a nota: ", notas[indice] ,"\n")
			
		}
	}
}
