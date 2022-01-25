programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real peso, altura, imc
		
		escreva("Digite sua altura: ")
		leia(altura)

		escreva("Digite seu peso: ")
		leia(peso)

		imc = peso / mat.potencia(altura, 2.0) 
		
		
		se (imc < 18.5)
		{
		 	escreva("Seu IMC é ", imc, "\nMagreza")
		}
		senao se (imc > 18.5 e imc < 24.9)
		{
		 	escreva("Seu IMC é ", imc, "\nPeso normal")
		}
		senao se (imc > 25 e imc < 29.9)
		{
		 	escreva("Seu IMC é ", imc, "\nSobrepeso")
		}
		senao se (imc > 30 e imc < 34.9)
		{
		 	escreva("Seu IMC é ", imc, "\nObesidade Grau I")
		}
		senao se (imc > 35 e imc < 39.9)
		{
		 	escreva("Seu IMC é ", imc, "\nObesidade Grau II")
		}
		senao se (imc > 40)
		{
		 	escreva("Seu IMC é ", imc, "\nObesidade Grau III")
		}

		escreva("\n")
	}
}