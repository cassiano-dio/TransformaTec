import HelloPlus from './HelloPlus'

function HelloCalc(){

    const calcNumbers = (n1,n2) => {

        return n1 * n2
    }

    return (

        <HelloPlus calcNumbers={calcNumbers}/>

    )
}

export default HelloCalc