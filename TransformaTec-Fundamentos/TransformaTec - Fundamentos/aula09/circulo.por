programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio() 
	{
		real raio, area
		real pi = 3.1415
		
		escreva("Informe o raio do circulo: ") 
		leia(raio)

		area = pi * mat.potencia(raio, 2.0) 

		escreva("\nO raio do círculo é: ", area, "\n")
	}
}
