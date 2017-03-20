var FlightListContainer = React.createClass({
    getInitialState: function() {
        return {
          flights: [] 
        };
    },
    
    componentWillMount: function() {
        var self = this;
        axios.get('api/flights')
        .then(function (response) {
            self.setState({ 
                flights: response.data 
            });
        });

    },
       
    
    render: function() {
        return <FlightListComponent 
        flights={this.state.flights} 
        />
    }
});

FlightListContainer.contextTypes = {
        router: React.PropTypes.object.isRequired,
};

window.FlightListContainer = FlightListContainer;