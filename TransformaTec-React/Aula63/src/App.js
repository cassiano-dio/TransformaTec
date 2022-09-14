import logo from './logo.svg';
import './App.css';
import './components/UseStateClass'
import UseStateClass from './components/UseStateClass';
import UseStateFunction from './components/UseStateFunction';
import UseEffectClass from './components/UseEffectClass'
import UseEffectFunction from './components/UseEffectFunction';
import UseContext from './components/UseContext'
import UseRef from './components/UseRef';

function App() {
  return (
    <div className="App">
      <UseStateClass />
      <UseStateFunction />
      <UseEffectClass />
      <UseEffectFunction />
      <UseContext />
      <UseRef />

    </div>
  );
}

export default App;
