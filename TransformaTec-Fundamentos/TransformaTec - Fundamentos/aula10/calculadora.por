programa
{
	funcao inicio()
	{
		caracter opcao
		
		real resultado = 0.0
		real operando1, operando2

		escreva("Digite o primeiro número: ")
		leia(operando1)
		
		escreva("Digite o segundo número: ")
		leia(operando2)
	
		escreva("\n")
		escreva("Escolha uma opção: ")
		escreva("\n")
	    escreva("+ Soma \n")
		escreva("- Subtração \n")
		escreva("* Multiplicação\n")
		escreva("/ Divisão\n")
		escreva("= Sair\n")
		
		leia(opcao)
		
		escolha (opcao)	
		{
			caso '+': 
		 		resultado = operando1 + operando2
		 		escreva("Resultado:\n\n")
		        escreva(operando1, " ", opcao, " ", operando2, " = ", resultado)
		 		pare   
		 	caso '-': 
		 		resultado = operando1 - operando2
		 		escreva("Resultado:\n\n")
		        escreva(operando1, " ", opcao, " ", operando2, " = ", resultado)
		 		pare   
		 	caso '*': 
		 		resultado = operando1 * operando2
		 		escreva("Resultado:\n\n")
	        	escreva(operando1, " ", opcao, " ", operando2, " = ", resultado)
		 		pare
		 	caso '/': 
		 		resultado = operando1 / operando2
		 		escreva("Resultado:\n\n")
		        escreva(operando1, " ", opcao, " ", operando2, " = ", resultado)
		 		pare
		 	caso '=': 
		 		escreva ("Saindo!")
		 		pare
		 	caso contrario: // Será executado para qualquer opção diferente de 1, 2 ou 3
		 		escreva ("Opção Inválida !")
		 		pare
		}
	}
}

