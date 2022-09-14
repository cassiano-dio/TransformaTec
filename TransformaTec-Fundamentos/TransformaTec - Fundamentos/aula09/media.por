programa
{
	
	funcao inicio()
	{
		real numero1, numero2, resultado = 0.0
		caracter operacao

		escreva("\nInforme o primeiro número: ")
		leia(numero1)

		escreva("\nInforme o segundo número: ")
		leia(numero2)

		escreva("\nInforme a operação aritimética desejada: ")
		leia(operacao)

		escolha(operacao){

			caso '+':
				resultado = numero1 + numero2
				pare
			caso '-':
				resultado = numero1 - numero2
				pare
			caso '*':
				resultado = numero1 * numero2
				pare
			caso '/':
				resultado = numero1 / numero2
				pare
			caso contrario:
				escreva("\nOperação inválida!")
			
		}

		escreva("\n\nO resultado de ", numero1, operacao, numero2, " é: ", resultado,"\n\n")
	}
}
