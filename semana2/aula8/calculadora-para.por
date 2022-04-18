programa {
	funcao inicio() {
		
		inteiro numero, resultado, contador = 0
		
		escreva("\nInforme um número: ")
		leia(numero)
		
		para(contador = 0; contador <= 10; contador++){
		    resultado = numero * contador
		    escreva("\n Numero ", numero," multiplicado por ", contador, " é igual a: ", resultado)
		}
		
	}
}
