function getPizza(event){

    event.preventDefault();

    const data = new FormData(event.target)

    const json_data = Object.fromEntries(data.entries());

    json_data.taste = data.getAll('taste')

    const pre = document.querySelector('pre')

    pre.innerText = JSON.stringify(json_data, null,2)

}

const form = document.getElementById("pizza_form");

form.addEventListener("submit",getPizza)