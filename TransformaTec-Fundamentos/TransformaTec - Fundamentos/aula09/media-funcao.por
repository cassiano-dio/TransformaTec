programa
{


	funcao real calculadora(real n1, real n2, caracter op){

		real result = 0.0
		
		escolha(op){

			caso '+':
				result = n1 + n2
				pare
			caso '-':
				result = n1 - n2
				pare
			caso '*':
				result = n1 * n2
				pare
			caso '/':
				result = n1 / n2
				pare
			caso contrario:
				escreva("\nOperação inválida!")
		}

		retorne result
		
	}
	
	
	funcao inicio()
	{
		real numero1, numero2, resultado
		caracter operacao

		escreva("\nInforme o primeiro número: ")
		leia(numero1)

		escreva("\nInforme o segundo número: ")
		leia(numero2)

		escreva("\nInforme a operação aritimética desejada: ")
		leia(operacao)

		resultado = calculadora(numero1, numero2, operacao)

		escreva("\n\nO resultado de ", numero1, " ",operacao, " ",numero2, " é: ", resultado,"\n\n")
	}
}
