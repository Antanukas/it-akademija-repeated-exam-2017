var MainPageContainer = React.createClass({

    getInitialState: function () {
        return {
            flights: [],
            selectedRowId: 0,
            selectedRows: [],
        };
    },

    componentWillMount: function () {
        axios.get('/api/flights')
            .then(function (response) {
                this.setState({
                    flights: response.data
                });
            }.bind(this));
    },

    // handleDeleteDist: function (district) {
    //     return function () {
    //         var constId = district.constituency_id;
    //         axios.delete('/api/districts/' + district.id).then(function (response) {
    //             axios.get('/api/constituencies/' + constId)
    //                 .then(function (response) {
    //                     var x = district.id;
    //                     var y = "#Delete_district" + x;
    //                     var z = "#x_district" + x;
    //                     $(y).hide();
    //                     $(z).html("Trinti");
    //                     this.setState({districts: response.data.districts});
    //                 }.bind(this))
    //         }.bind(this));
    //     }.bind(this);
    // },

    handleDeleteFlight: function (flight) {
            axios.delete('/api/flights/' + flight.id)
    },

    render: function () {
        return <MainPageComponent flights={this.state.flights}
                                  onDeleteFlightClick={this.handleDeleteFlight}
                                  selectedRowId={this.state.selectedRowId}
        />
    }
});

MainPageContainer.contextTypes = {
    router: React.PropTypes.object.isRequired,
};

window.MainPageContainer = MainPageContainer;