programa
{
	
inclua biblioteca Matematica --> mat

	real n1, n2
	caracter op

	funcao valores(){
		
		escreva("Informe o primeiro valor:\n")
		leia(n1)
		
		escreva("Informe o segundo valor:\n")
		leia(n2)
		
		escreva("Selecione a sua opção: \n")
		leia (op)
		
	}


	funcao menu(){
		
		escreva("\nSelecione uma das opções a seguir\n")
		escreva("+ para somar\n")
		escreva("- para subtrair\n")
		escreva("* para multiplicar\n")
		escreva("/ para dividir\n")
		escreva("^ para potência\n")
		
	}


	funcao real calculadora(real numero1, real numero2, caracter operacao){

		real resultado = 0.0

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
			caso '^':
				resultado = mat.potencia(numero1, numero2)
				pare
			caso contrario:
				escreva("\nOpção inválida!")
				pare	
			
		}

		retorne resultado
		
	}
	
	funcao inicio()
	{

		real result = 0.0
	
		escreva("Programa calculadora\n")

		menu()

		valores()

		result = calculadora(n1,n2,op)

		escreva("Resultado: ", n1, " ", op, " ", n2, " = ", result)
		
	}
}
