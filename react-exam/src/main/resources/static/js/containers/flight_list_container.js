/**
 * Created by osvaldas on 17.3.20.
 */

var array = [];

var FlightListContainer = React.createClass({
    getInitialState: function() {
        return { flights: [] };
    },

    componentWillMount: function() {
        var self = this;
        axios.get('http://localhost:8080/api/flights')
            .then(function (response) {
                self.setState({ flights: response.data });
                console.log(response.data);
            })
            .catch(function (error){
                console.log(error);
            })
    },

    addForRemoval: function (id) {
        if (array.includes(id)){
            console.log("id already added to array")
        } else {
            console.log("added new id to array: " + id);
            array.push(id);
        }
        console.log(array);
    },

    removeFromArray: function (id) {
        var index = array.indexOf(id);
        console.log(index);
        array.splice(index, 1);
    },

    removeMarkedFlights: function () {
        var self = this;
        array.map(function (id, index) {
            var URL = 'http://localhost:8080/api/flights/' + id;
            axios.delete(URL)
                .then(function (response) {
                    console.log("deleted flight with id " + id );
                    console.log(response.data);
                    axios.get('http://localhost:8080/api/flights')
                        .then(function (response) {
                            self.setState({ flights: response.data });
                            console.log(response.data);
                        })
                        .catch(function (error){
                            console.log(error);
                        })
                })
                .catch(function (error) {
                    console.log(error);
                })
        });
        array = [];
    },

    render: function() {
        return (
            <div>
                <h3>SKRYDŽIŲ SĄRAŠAS</h3>
                <FlightListComponent
                    flights={this.state.flights}
                    addForRemoval={this.addForRemoval}
                    removeFromArray={this.removeFromArray}
                />
                <button onClick={this.removeMarkedFlights} className="btn btn-danger" style={{ float: 'right' }} >IŠTRINTI PAŽYMĖTUS SKRYDŽIUS</button>
            </div>
        )
    }
});

window.FlightListContainer = FlightListContainer;