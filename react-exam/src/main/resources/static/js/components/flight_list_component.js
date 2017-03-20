/**
 * Created by osvaldas on 17.3.20.
 */

var FlightListComponent = function (props) {

    var flighs = props.flights.map(function (flight, index) {
        return (
            <FlightLineContainer
                key={index}
                company={flight.company}
                date={flight.date}
                flightNumber={flight.flightNumber}
                id={flight.id}
                status={flight.status}
                time={flight.time}
                addForRemoval={props.addForRemoval}
                removeFromArray={props.removeFromArray}
            />
        );
    });
    return (
        <div>
            <table style={{width: "100%", border: "1px solid black"}}>
                <tr style={{border: "1px solid black"}}>
                    <th>ID</th>
                    <th>DATA</th>
                    <th>LAIKAS</th>
                    <th>SKRYDŽIO NUMERIS</th>
                    <th>SKRAIDINANTI ĮMONĖ</th>
                    <th>SKRYDŽIO STATUSAS</th>
                    <th>VEIKSMAS</th>
                </tr>
                {flighs}
            </table>
        </div>
    );

};

window.FlightListComponent = FlightListComponent;