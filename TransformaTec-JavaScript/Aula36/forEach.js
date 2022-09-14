let carros = [ 
    {
        modelo:"Celta",
        cor:"Preto",
        ano:"2014"
    },
    {
        modelo: "Uno super-sônico de escada",
        cor: "Branco",
        ano: 1991
    },
    {
        modelo: "Marea bomba",
        cor: "Queimado",
        ano: 2001
    },
    {
        modelo: "Lancer do Braia",
        cor:"verde limão",
        ano: 2002
    }
]

console.log(typeof(carros))

//vetor        //objeto do vetor
carros.forEach(carro => {
        //propriedade do objeto do vetor
        carro.cor = "branco"
        console.log(carro)
    }
);