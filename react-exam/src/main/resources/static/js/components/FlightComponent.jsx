var FlightComponent = React.createClass( {
    render: function() {
        var self = this;
        var flightList = this.props.flights.map( function( flight, index ) {
            return (
                <tr id="bookList" key={index}>
                    <td>{flight.id}</td>
                    <td>{flight.flightNumber}</td>
                    <td>{flight.date}</td>
                    <td>{flight.time}</td>
                    <td>{flight.company}</td>
                    <td>{flight.status}</td>
                </tr >
            );
        });
        return (
            <div className="list">
                <div className="panel panel-default">
                    <table id="Parties_Lits" className="table table-striped">
                        <thead>
                            <tr>
                                <th>Skydzio Id</th>
                                <th>Lektuvo numeris</th>
                                <th>Data</th>
                                <th>Laikas</th>
                                <th>Kompanija</th>
                                <th>Statusas</th>
                         </tr>
                        </thead>
                        <tbody>
                            {flightList}
                        </tbody>
                    </table>
                </div>
            </div>

        )
    }
});

window.FlightComponent = FlightComponent;