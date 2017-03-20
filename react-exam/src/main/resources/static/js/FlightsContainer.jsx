function getFlights(self) {
  axios
  .get('/api/flights')
  .then(function(response){
    self.setState({
      flightsList :  response.data,
    });
  })
  .catch(function(err){
    console.error('FlightsContainer.getFlights.axios.get.flights', err);
  });
}

var FlightsContainer = React.createClass({
  getInitialState: function() {
      return {
        flightsList : [],
      };
    },

componentWillMount: function() {
  getFlights(this);
  },
onHandleDelete : function(){
    var self = this;
    axios
    .delete('/api/flights/1')
    .then(function(response){
      getFlights(self);
    })
    .catch(function(err){
      console.error('FlightsContainer.delete.axios.delete.flight', err);
    });
  },
  render: function() {
    return (
      <FlightsComponent
        flightsList={this.state.flightsList}
        onHandleDelete={this.onHandleDelete}
       />
    );
  }

});

window.FlightsContainer = FlightsContainer;
