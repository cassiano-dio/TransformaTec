programa {
	funcao inicio() {
		
		inteiro idade
		
		escreva("Informe a sua idade: \n")
		leia(idade)
		
		se(idade < 0){
		    escreva("Idade inválida")
		}senao se(idade <= 12){
		    escreva("\nÉ criança")
		}senao se(idade > 12 e idade < 18){
		    escreva("\nÉ adolescente")
		}senao se(idade >= 18 e idade < 65){
		    escreva("\nÉ adulto")
		}senao{
		    escreva("É idoso")
		}
	}
}
