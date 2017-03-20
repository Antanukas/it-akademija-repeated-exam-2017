var FlightListContainer = React.createClass( {
    getInitialState: function() {
        return {

            bgColor: 'white',
            flights: [],
            flight: {
                id: '',
                flightNumber: '',
                date: '',
                time: '',
                company: '',
                status: ''
            },
        };
    },

    componentWillMount: function() {
        var self = this;
        axios.get( '/api/flights' )
            .then( function( response ) {
                self.setState( {
                    flights: response.data
                });
            });

    },

    handleDeleteClick: function( e ) {
        e.preventDefault();
        var self = this;
        alert( 'deleted' );
        axios.delete( '/api/flights/{id}', this.state.flights ).then( function() {
            console.log( 'flights deleted' );
            self.context.router.push( '/' );
        });
    },

    handleRowClick: function() {
        return function() {
            this.state.bgColor == "white"
                ? this.setState( { bgColor: "red" })
                : this.setState( { bgColor: "white" })
        }
    },

    handleCandidateRemove: function( flight ) {
        var self = this;
        return function() {
            axios.delete( '/api/flights/' + flight.id ).then( function( response ) {
                self.componentWillMount();
            });
        };
    },

    render: function() {
        return <FlightListComponent flights={this.state.flights}
            onDeleteClick={this.handleDeleteClick}
            onRowClick={this.handleRowClick}
            onRemoveItem={this.handleCandidateRemove} />
    }
});

FlightListContainer.contextTypes = {
    router: React.PropTypes.object.isRequired,
};

window.FlightListContainer = FlightListContainer;