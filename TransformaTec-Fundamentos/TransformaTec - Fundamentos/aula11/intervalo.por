programa
{
	funcao inicio()
	{
		inteiro comeco, fim, soma = 0
		
		escreva("Digite o numero de inicio: ")
		leia(comeco)
		
		escreva("Digite o numero de fim: ")
		leia(fim)
		
		enquanto (comeco <= fim) 
		{
			soma = soma + comeco
			comeco = comeco + 1
		}
		
		escreva("A soma é: ", soma,  "\n")
	}
}
