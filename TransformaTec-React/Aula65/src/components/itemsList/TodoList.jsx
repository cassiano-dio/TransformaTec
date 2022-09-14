import { useState } from "react";
import Todos from "./Todos";

const TodoList = () => {
  const [count, setCount] = useState(0);
  const [todos, setTodos] = useState([]);

  console.log('Renderizado o componente pai')

  const increment = () => {
    setCount((c) => c + 1);
  };
  const addTodo = () => {
    setTodos((t) => [...t, "Novo Item"]);
  };

  return (
    <>
      <Todos todos={todos} addTodo={addTodo} />
      <hr />
      <div>
        Count: {count}
        <button onClick={increment}>+</button>
      </div>
    </>
  );
};

export default TodoList