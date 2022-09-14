programa
{
	funcao inicio()
	{
		inteiro opcao
		
		escreva("1) Netflix \n")
		escreva("2) Amazon Prime \n")
		escreva("3) HBO Max \n\n")
		escreva("4) Sair \n\n")

		escreva("Escolha uma opção: ")
		leia(opcao)

		limpa()

		escolha (opcao)	
		{
			caso 1: 
		 		escreva ("Você escolheu assistir à Netflix")
		 		pare   
		 	caso 2: 
		 		escreva ("Você escolheu assistir à Amazon Prime")
		 		pare   
		 	caso 3: 
		 		escreva ("Você escolheu assistir à HBO Max")
		 		pare   
		 	caso 4: 
		 		escreva ("Até logo")
		 		pare
		 	caso contrario: // Será executado para qualquer opção diferente de 1, 2 ou 3
		 		escreva ("Opção Inválida!")
		}

		escreva("\n")
	}
}