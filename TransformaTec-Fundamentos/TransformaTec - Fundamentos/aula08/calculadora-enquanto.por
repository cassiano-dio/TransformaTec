programa {
	funcao inicio() {
		
		inteiro numero, resultado, contador = 0
		
		escreva("\nInforme um número: ")
		leia(numero)
		
		enquanto(contador <= 10){
		    resultado = numero * contador
		    escreva("\n Numero ", numero," multiplicado por ", contador, " é igual a: ", resultado)
		    contador++
		}
		
	}
}
