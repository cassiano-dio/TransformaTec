import './App.css';
import UseStateClass from './components/UseStateClass';
import UseStateFunction from './components/UseStateFunction';
import UseStateLazy from './components/UseStateLazy';
import UsePrevState from './components/UsePrevState';
import UseStateObject from './components/UseStateObject';
import UseEffectClass from './components/UseEffectClass';
import UseEffectFunction from './components/UseEffectFunction';
import TodoList from './components/TodoList/TodoList';

function App() {
  return (
    <div className="App">
      {/* <UsePrevState />
      <UseStateClass />
      <UseStateFunction />
      <UseStateLazy /> */}
      {/* <UseStateObject /> */}
      {/* <UseEffectClass /> */}
      {/* <UseEffectFunction /> */}
      <TodoList />
    </div>
  );
}

export default App;
