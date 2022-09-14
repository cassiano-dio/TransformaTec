programa
{

	funcao cadeia menu(inteiro op){

		cadeia pro = ""

		escolha(op){
			caso 1: 
				pro = "Netflix"
				pare
			caso 2:
				pro = "HBO Max"
				pare
			caso 3:
				pro = "Amazon Prime"
				pare
			caso 4:
				pro = "Tele Cine"
				pare
			caso contrario:
				pro = "Inválido"
				pare
		}


		retorne pro
		
	}
	
	funcao inicio()
	{
		inteiro opcao = 0
		cadeia nome, provedor = ""


		escreva("\nBem vindo ao nosso serviço de Streaming DIO Transformatec!\n")
		escreva("Por favor, informe seu nome!\n")
		leia(nome)
		
		escreva("\nMuito bem ", nome , ", selecione um dos nossos provedores!\n")
		
		escreva("1 - Netflix\n")
		escreva("2 - HBO Max\n")
		escreva("3 - Amazon Prime\n")
		escreva("4 - Tele Cine\n")
		escreva("Sua opção: \n")
		leia(opcao)

		provedor = menu(opcao)

		se(provedor != "Inválido"){
			escreva("Excelente escolha ",nome,". Você escolheu o provedor de streaming ", provedor," Aproveite!")
		}senao{
			escreva("Desculpe ", nome, ", a sua opção é inválida.")	
		}

		
	}
}
