import React from 'react'

const CryptoTile = ({data, selectedTile, onClick}) => {

    const {name, rate, icon} = data // name = data.name rate = data.rate icon = data.icon

    const handleClick = () => onClick(data)

    return (
        <div 
            className={`card ${selectedTile && 'selected'}`}
            onClick={handleClick}
        >
            <div>
                <img src={icon} alt="icon" className='coin-icon'/>
                <div>{name}</div>
                <div>{rate}</div>
            </div>
        </div>
    )

}

export default CryptoTile