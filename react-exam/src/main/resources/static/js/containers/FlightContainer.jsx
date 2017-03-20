var FlightContainer = React.createClass( {
    getInitialState: function() {
        return {
            flights: []
        };
    },
    handleClick: function(){
        
    },
    componentWillMount: function() {
        var self = this;
        axios.get( '/api/flights' )
            .then( function( response ) {
                self.setState( {
                    flights: response.data
                });
                console.log(response.data)
            });
    },
    render: function() {
        return <FlightComponent
        flights={this.state.flights}
        />
    }

});



window.FlightContainer = FlightContainer;
