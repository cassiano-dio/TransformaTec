import React from 'react';
import ReactDOM from 'react-dom/client';
import App from './App';
import reportWebVitals from './reportWebVitals';
import {
  BrowserRouter,
  Routes,
  Route
}from 'react-router-dom'

import Expenses from './routes/expenses';
import Invoice from './routes/invoice';
import Invoices from './routes/invoices'



const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <BrowserRouter>
    <Routes>
      <Route path="/" element={<App/>}>
        <Route path="expenses" element={<Expenses />}/>
        <Route path="invoices" element={<Invoices />} > 

          <Route 
            index
            element={
              <main style={{ padding: "1rem" }}>
                Selecione uma conta
              </main>
            }
          />
          <Route path=":invoiceId" element={<Invoice />}/>
          
        </Route>
        
      </Route>
      <Route
        path="*"
        element={
            <main style={{ padding: "1rem" }}>

              <p>
                Nada a ver por aqui.
              </p>
            </main>
        }
      
      >

      </Route>
    </Routes>

  </BrowserRouter>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
