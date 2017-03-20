var styles = {
    marginTop: {
        marginTop: '20px'
    },
    cursor: {
        cursor: 'pointer'
    },
};

var MainPageComponent = React.createClass({
    render: function () {
        var flightsList = this.props.flights.map(function (flight, index) {
            return (
                <tr key={index}>
                    <td className="col-md-1">{flight.id}</td>
                    <td className="col-md-2">{flight.flightNumber}</td>
                    <td className="col-md-2">{flight.date}</td>
                    <td className="col-md-2">{flight.time}</td>
                    <td className="col-md-2">{flight.company}</td>
                    <td className="col-md-2">{flight.status}</td>
                    <td className="col-md-1">
                        <button type="button" className="btn btn-danger"
                                //onClick={this.props.onDeleteFlightClick(flight)}
                        >
                            Trinti
                        </button>
                    </td>

                </tr>
            );
        }.bind(this));

        return (
            <div>
                <div className="panel panel-default" style={styles.marginTop}>
                    <table id="Books_Table" className="table table-striped">
                        <thead>
                        <tr>
                            <th>Nr.</th>
                            <th>Skrydžio numeris</th>
                            <th>Data</th>
                            <th>Laikas</th>
                            <th>Kompanija</th>
                            <th>Statusas</th>
                        </tr>
                        </thead>
                        <tbody>
                        {flightsList}
                        </tbody>
                    </table>
                </div>
            </div>
        );
    }
});

window.MainPageComponent = MainPageComponent;
