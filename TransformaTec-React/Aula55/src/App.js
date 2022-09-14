import './App.css';
import HelloWorld from './components/HelloWorld';
import Car from './components/Car'
import PersonRegister from './components/PersonRegister'
import GameScore from './components/GameScore';

function App() {
  return (
    <div className="App">
      <HelloWorld name="Isaque" />
      <Car owner="Spped Racer"/>
      <PersonRegister name="Isaque" age={21} lastName="Marques" job="Dev" />
      <GameScore points={0}/>
    </div>
  );
}

export default App;
