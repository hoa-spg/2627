import './App.css'
import HalloKlasse from './HalloKlasse'

function App() {
 

  return (
    <>
    {/* ein Kommentar...*/}
      <h1>Begrüßung</h1>
      <p>Hello World!</p>
      <HalloKlasse klassenName="5AKIF" stufe="Basisjahr"/>
      <HalloKlasse klassenName="5AKIF" stufe="Abschlussjahr"/>
      
      <HalloKlasse klassenName="5BKIF" stufe="Abschlussjahr"/>
    </>
  )
}

export default App
