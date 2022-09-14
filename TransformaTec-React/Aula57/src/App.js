import './App.css';
import StateFunction from './components/StateFunction';
import StateClass from './components/StateClass';
import StateProps from './components/StateProps';
import FormExample from './components/FormExample';
import FormMultiple from './components/FormMultiple';

function App() {
  return (
    <div className="App">
      <StateFunction />
      <StateClass />
      <StateProps cor="verdinho" />
      <FormExample />
      <FormMultiple />
    </div>
  );
}

export default App;
