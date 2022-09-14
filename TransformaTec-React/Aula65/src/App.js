import './App.css';
import UseEffectClass from './components/UseEffectClass';
import UseEffectFunction from './components/UseEffectFunction';
import FetchAPIData from './components/api/FetchAPIData';
import TodoList from './components/itemsList/TodoList'
import TodoListCallback from './components/itemsList/TodoListCallback'
import CallbackMemo from './components/CallbackMemo';

function App() {
  return (
    <div className="App">
      {/* <UseEffectClass />
      <UseEffectFunction />
      <FetchAPIData /> */}
      {/* <TodoList /> */}
      {/* <TodoListCallback /> */}
      <CallbackMemo />


    </div>
  );
}

export default App;
