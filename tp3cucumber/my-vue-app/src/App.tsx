import { useState } from 'react'
import cucumberLogo from './assets/cucumber.png'
import './App.css'

function App() {
  const [count, setCount] = useState(0)

  return (
    <>
      <div>
        <a href="https://cucumber.io/" target="_blank">
          <img src={cucumberLogo} className="logo" alt="Cucumber logo" />
        </a>
      </div>
      <h1>Cucumber</h1>
      <div className="card">
        <button onClick={() => setCount((count) => count + 1)}>
          count is {count}
        </button>
        <p>
          Come to Blagnac IUT to learn more about Cucumber with JMB
        </p>
      </div>
      <p className="read-the-docs">
        Click on the cucumber to learn more
      </p>
    </>
  )
}

export default App
