import React from 'react'
import styled from 'styled-components'

const Input = styled.input`
    width: 75%;
    margin-top: 20px;
    padding-top: 2.5%;
    padding-bottom: 2.5%;
    border-radius: 5px;
    border: transparent;
    margin: 10px;
    color:dimgray;
`

const InputBase = ({label, ...props}) => (
    <>
        <Input type="number" {...props} placeholder={label}/>
    </>
)

export default InputBase

