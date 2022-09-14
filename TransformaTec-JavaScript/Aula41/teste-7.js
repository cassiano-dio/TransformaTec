//string contendo JSON
const dado = '{"nome":"João", "idade":30, "carro":"chevelho sofrência"}';

//conversão de string para objeto
const pessoa = JSON.parse(dado);

//imprimindo o NOME das propriedades do objeto
for (const prop in pessoa) {
  console.log("Propriedade: ",prop);
}

//imprimindo o VALOR das propriedades do objeto
for (const prop in pessoa) {
console.log("Valor: ",pessoa[prop]);
}