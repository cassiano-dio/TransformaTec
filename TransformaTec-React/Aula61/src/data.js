let invoices = [
    {
        name:"Farmacia",
        number: 2022,
        amount:"15.000,00",
        due: "03/06/2022"
    },
    {
        name:"Mercado",
        number: 7022,
        amount:"5.000,00",
        due: "03/06/2022"
    },
    {
        name:"Loteria",
        number: 7756,
        amount:"500,00",
        due: "03/06/2022"
    },
    {
        name:"Mensalidade",
        number: 2002,
        amount:"300,00",
        due: "03/06/2022"
    },
]

export function getInvoices(){
    return invoices
}

export function getInvoice(number){
    return invoices.find(
        (invoice) => invoice.number === number
    )
}

export function deleteInvoice(number){
    invoices = invoices.filter(invoice => invoice.number !== number)
}