import './App.css';
import StateColor from './components/StateColor'
import StateCar from './components/StateCar'
import StatePerson from './components/StatePerson'
import StateClock from './components/StateClock'
import Cor from './components/Cor'
import Carro from './components/Carro'
import Avaliacao from './components/Avaliacao';
import Relogio from './components/Relogio'

function App() {
  return (
    <div className="App">
      <StateColor color="azul"/>
      <StateCar />
      <StatePerson nome="Joao" profissao="Pintor" idade={33} />
      <StateClock />
      <Cor cor="cinza"/>
      <Carro />
      <Avaliacao tema="Introdução a algoritmos" questoes={30} tempoTotal={180} peso={50}/>
      <Relogio />
    </div>
  );
}

export default App;
