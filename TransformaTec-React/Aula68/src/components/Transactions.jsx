import React from 'react';
import styles from './styles.module.css';

const Transactions = ({list}) => {

    return (
        <div className={styles.transactionsListContainer}>

            <h4>Lista de transações</h4>
            {

                list.length ? list.map(

                    (item) => (
                        <div>
                            <div key={item.id} className={styles.transactionLine}>
                                <div className='transaction-name'>{item.id}</div>
                                <div className='transaction-name'><strong>{item.name}</strong></div>
                                <div className='transaction-value'>{item.converted}</div>
                            </div>
                        </div>
                        
                    )

                ):(
                    <div>
                        <h5>
                            Lista de transações vazia
                        </h5>
                    </div>
                )

            }
        </div>
    )
}

export default Transactions