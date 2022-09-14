import {
    NavLink,
    Outlet,
    useSearchParams
} from "react-router-dom"

import {getInvoices} from '../data'

export default function Invoices(){

    let invoices = getInvoices()

    let [searchParams, setSearchParams] = useSearchParams();

    return (
        <div style={{ display: "flex" }}>
            <nav style={{
            borderRight: "solid 1px",
            padding: "1rem",
            }}>
            
            <input type="text" 
                value={searchParams.get("filter") || ""}
                onChange={(event) => {
                    let filter = event.target.value
                    if (filter){
                        setSearchParams({filter})
                    }else{
                        setSearchParams({})
                    }
                }
            }
            />

            {
                invoices.filter(
                    (invoice) =>{
                        let filter = searchParams.get("filter")
                        if (!filter){
                            return true
                        };

                        let name = invoice.name.toLowerCase();

                        return name.startsWith(filter.toLowerCase())

                    }
                ).map(
                    (invoice) => (
                        
                        <NavLink 
                            className="nav"
                            style={({ isActive }) => ({
                            display: "block",
                            margin: "1rem 0",
                            color: isActive ? "red" : "",
                            })}
                            
                            to={`/invoices/${invoice.number}`}
                            key={invoice.number}
                            
                            >
                                {invoice.name}
                        </NavLink>
                    )
                )
            }

            </nav>
            
            <Outlet />
        </div>
        
    )

}