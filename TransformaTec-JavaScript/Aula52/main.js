const calcular = () => {

    let numero_1 = document.getElementById("numero_1").value
    let numero_2 = document.getElementById("numero_2").value
    const operacao = document.getElementById("operacao").value

    numero_1 = Number(numero_1)
    numero_2 = Number(numero_2)

    obterResultado(numero_1,numero_2,operacao)

}

const obterResultado = (n1,n2,op) => {

    let resultado = 0

    switch (op) {
        case '+':
            resultado = n1+n2
            break;
        case '-':
            resultado = n1-n2
            break;
        case '*':
            resultado = n1*n2
            break;
        case '/':
            resultado = n1/n2
            break;
    
        default:
            console.log("Operação inválida")
            break;
    }

    console.log("Resultado: ", resultado)

}