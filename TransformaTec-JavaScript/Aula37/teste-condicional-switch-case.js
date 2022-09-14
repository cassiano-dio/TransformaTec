let opcao = "**"
let numero1 = 3;
let numero2 = 4;

switch(opcao){
    case "+":
        console.log(numero1 + numero2)
        break
    case "-":
        console.log(numero1 - numero2)
        break
    //operador exponencial
    case "**":
        console.log(numero1 ** numero2)
        break
    case "/":
        console.log(numero1 / numero2)
        break
    default:
        console.log("Operacao invalida")
        break
}