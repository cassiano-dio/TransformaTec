programa
{
	
	funcao inicio()
	{
		cadeia nome, servico = ""
		inteiro opcao, sucesso = 1
		
		escreva("Seja bem vindo! Por favor, insira o seu nome:\n")
		leia(nome)

		escreva("\nPerfeito, ", nome,"! Agora escolha uma das opções abaixo para seu serviço de streaming!")
		
		escreva("\nPara Netflix escolha 1")
		escreva("\nPara Amazon Prime escolha 2")
		escreva("\nPara HBO Max escolha 3")
		escreva("\nPara Crunchyroll escolha 4")
		escreva("\nSua opção: ")
		leia(opcao)

		escolha(opcao){
			caso 1:
				servico = "Netflix"
				pare
			caso 2:
				servico = "Amazon Prime"
				pare
			caso 3:
				servico = "HBO Max"
				pare
			caso 4:
				servico = "Crunchyroll"
				pare
			caso contrario:
				sucesso = 0
				pare
		}

		se(sucesso == 1){
			escreva("Parabéns ", nome,"! O serviço ", servico," é uma excelente escolha!")
		}senao{
			escreva("Nos desculpe, ", nome,", este serviço não existe")
		}

	}
}
