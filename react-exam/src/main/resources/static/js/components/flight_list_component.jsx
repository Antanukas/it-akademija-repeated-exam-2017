var styles = {
    red: {
        bacgournd: 'red'
    },
}

var FlightListComponent = React.createClass( {
    render: function() {
        var self = this;
        var flightList = this.props.flights.map( function( flight, index ) {

            return (
                <tr key={index}>
                    <td >{flight.id}</td>
                    <td>{flight.date}</td>
                    <td>{flight.time}</td>
                    <td>{flight.flightNumber}</td>                    
                    <td>{flight.company}</td>
                    <td>{flight.status}</td>   
                    <td style={styles.width}>
                    <button id="CandidateDelete" type="button" className="btn btn-default" 
                    data-toggle="tooltip" data-placement="top" title="Delete" onClick={self.props.onRemoveItem( flight )}>
                    <span className="glyphicon glyphicon-remove"></span></button>
                    </td>
                </tr>
            );
        });


        return (
            <div className="container">


                <div className="panel panel-default">
                    <div className="panel-heading">THE FLIGHTS LIST</div>
                    <table className="table table-hover">
                        <thead>
                            <tr>
                                <th>ID</th>
                                <th>FLIGHT DATE</th>
                                <th>TIME</th>
                                <th>NUMBER</th>
                                <th>COMPANY</th>
                                <th>STATUS</th>
                                <th>DELETE</th>
                            </tr>
                        </thead>
                        <tbody>
                            {flightList}
                        </tbody>
                    </table>      
                </div>
                        <button type="button"  className="btn btn-danger" onClick={this.props.onDeleteClick}>
                        DELETE</button>  <br/><br/>
            </div>
        )
    }
});

FlightListComponent.propTypes = {
    flights: React.PropTypes.array.isRequired,
    
};

window.FlightListComponent = FlightListComponent;