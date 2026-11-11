
interface HalloKlasseProps {
    klassenName: string;
    stufe: string
}

function HalloKlasse(props: HalloKlasseProps) {
    
    console.log("Hallo Klasse");

    return (
        <p>Hallo {props.klassenName} <span>({props.stufe})</span></p>
        
    )
}

export default HalloKlasse