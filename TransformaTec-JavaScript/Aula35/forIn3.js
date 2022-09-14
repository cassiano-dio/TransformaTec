let carro = {
    marca: 'ford',
    modelo: 'fiesta',
    cor: 'prata',
    }
    for (propriedade in carro) {
        console.log(propriedade +":"+carro[propriedade]);
    }
    //marca:ford, modelo:fiesta, cor:prata
    