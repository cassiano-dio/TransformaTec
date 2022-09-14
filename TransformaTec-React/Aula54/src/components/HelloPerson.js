function HelloPerson(props){

    return(
        <div>
            <p> Salve! {props.person.name} {props.person.surName}</p>
        </div>
    )

}

export default HelloPerson