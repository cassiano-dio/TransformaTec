import { useState, useCallback } from "react";
import Todos from "./Todos";

const TodoListCallback = () => {
  const [count, setCount] = useState(0);
  const [todos, setTodos] = useState([]);

  console.log('Renderizado o componente pai')

  const increment = () => {
    setCount((c) => c + 1);
  };
  const addTodo = useCallback(() => {
    setTodos((t) => [...t, "New Todo"]);
  }, [todos]);

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

export default TodoListCallback