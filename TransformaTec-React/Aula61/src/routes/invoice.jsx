import {
    useParams,
    useNavigate,
    useLocation
} from "react-router-dom"

import { getInvoice, deleteInvoice } from "../data"

export default function Invoice(){

    let navigate = useNavigate()
    let location = useLocation()
    let params = useParams()
    let invoice= getInvoice(parseInt(params.invoiceId,10))

    return (
        <main>
            <h2> Valor total: {invoice.amount}</h2>
            <p>
                {invoice.name} : {invoice.number}
            </p>
            <p>
                Data de vencimento: {invoice.due}
            </p>
            <p>
                <button
                onClick={
                    () => {
                        deleteInvoice(invoice.number)
                        navigate("/invoices" + location.search)
                    }
                }
                >
                    Excluir
                </button>
            </p>
        </main>
    )

}
