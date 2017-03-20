var PartyListContainer = React.createClass( {

    getInitialState: function() {
        return {
            flights: []
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

   

    render: function() {
        return (
            <div>
                <PartyListComponent parties={this.state.parties} onRemoveItem={this.handleRemoveItem} />
                <AddNewContainer redirectTo={'/add-party'} />
            </div>
        )
    }
});

window.PartyListContainer = PartyListContainer;