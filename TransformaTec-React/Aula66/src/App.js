import './App.css';
import Todos from './TodoList/Todos'
import TrafficLight from './TrafficLights/TrafficLight';
import './TrafficLights/styles.css'
import FetchGithubUsers from './API/FetchGithubUsers';

function App() {
  return (
    <div className="App">
      {/* <Todos /> */}
      {/* <TrafficLight initialValue={0}/>
      <TrafficLight initialValue={1}/> */}
      <FetchGithubUsers />
      
    </div>
  );
}

export default App;
