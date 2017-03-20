
var FlightListComponent = React.createClass({


    getInitialState: function() {
        return {
            flights: [],
            deletingFlights: []
        };
    },


    componentWillMount: function () {
        axios.get("api/flights")
            .then(resp => {
                this.setState({flights: resp.data})
            })
    },

    flightList: function () {
        return this.state.flights.map(function(flight, index){
            return(
                <SingleFlightComponent flight={flight}
                                       key={index}
                                       onDeleteList={this.handleDeletingList}
                />
            )
        }.bind(this))
    },

    handleDeletingList: function (deletingFlight) {
            var deletingFlights = this.state.deletingFlights;
            deletingFlights.push(deletingFlight);
            this.setState({deletingFlights: deletingFlights})
            console.log(this.state.deletingFlights);
    },

    deleteFlightList: function () {
      return function () {
          this.state.deletingFlights.map(function (flight, index) {
              axios.delete("/api/flights/" + flight.id)
          }.bind(this));
          console.log("trinu")
          axios.get("api/flights")
              .then(resp => {
                  this.setState({flights: resp.data})
              })
      }.bind(this)
    },

    render: function() {
        return (
            <div>
              <table className="table table-striped">
                <thead>
                <tr>
                  <th>Id</th>
                  <th>Laikas</th>
                  <th>Skrydžio nr.</th>
                  <th>Įmonė</th>
                  <th>Skrydžio statusas</th>

                </tr>
                </thead>
                <tbody>
                {this.flightList()}
                </tbody>
              </table>
                <button type="button" className="btn btn-danger" onClick={this.deleteFlightList()}>Trinti Pažymėtus</button>
            </div>

        );
    }
});

window.FlightListComponent = FlightListComponent;
