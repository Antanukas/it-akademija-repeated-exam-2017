var FlightListContainer = React.createClass({
    getInitialState: function() {
        return { 
            flights: [],
            deleted: false  
        };
    },
    
    componentWillMount: function() {
        var self = this;
        axios.get('http://localhost:8080/api/flights').then(function (response){
            console.log(response.data);
            self.setState({ flights: response.data});
        })
    },
    
//    handleSelect: function() {
//        
//    },
    
    render: function () {
        return <FlightListComponent flights={this.state.flights} deleted={this.state.deleted} />
    }
});

window.FlightListContainer = FlightListContainer;