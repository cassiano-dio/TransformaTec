programa
{

	real n1, n2

	funcao operadores(){
		
		escreva("\n\nInforme o primeiro número: ")
		leia(n1)
		
		escreva("\n\nInforme o segundo número: ")
		leia(n2)
	} 


	funcao caracter menu(){

		caracter operacao

		//Escolha da opção de operação
		escreva("\n\n Escolha as seguintes opções de operação:")
		escreva("\n + para adição")
		escreva("\n - para subtração")
		escreva("\n * para multiplicação")
		escreva("\n / para divisão")
		escreva("\n\nSua opção: ")
		
		leia(operacao)

		retorne operacao
		
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
			caso contrario:
				escreva("\n\nOperação inválida")
				pare
		}

		retorne resultado
		
	}
	
	
	funcao inicio()
	{
		real result
		caracter op

		escreva("\n Calculadora:")
		//Inserção de valores de variáveis
		operadores()

		op = menu()


		result = calculadora(n1,n2,op)

		escreva("\n\nO resultado de ", n1, " ", op, " ", n2, " é = ",result)

		//limpa()
		
	}
}
