var PartyListComponent = React.createClass( {
    render: function() {
        var self = this;
        var flightList = this.props.flights.map( function( flight, index ) {
 
            return (
                <tr key={index}>
                    <td>{flights.company}</td>
               
                    
                </tr>
            );
        });


        return (
            <div>
                <table className="table table-hover">
                    <thead>
                        <tr>
                            <th>Partijos pavadinimas</th>
                            <th>Trumpinys</th>
                            <th>Trinti</th>
                        </tr>
                    </thead>
                    <tbody>
                        {flightList}
                    </tbody>
                </table>
            </div>
        )
    }
});

ConstituencyListComponent.propTypes = {
    flights: React.PropTypes.array.isRequired
};

window.PartyListComponent = PartyListComponent;