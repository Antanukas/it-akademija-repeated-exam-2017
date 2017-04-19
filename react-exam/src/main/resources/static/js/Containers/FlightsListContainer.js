
var FlightsListContainer = React.createClass({
  getInitialState: function() {
    return {
      flights : []
    };
  },

  componentWillMount: function() {
    var self = this;
    axios.get('http://localhost:8080/api/flights')
    .then(function(response){
      self.setState({flights:response.data});
    }).catch(function(err){
      console.log(err);
    });
  },

  markForRemove: function(id){


  },

  render: function() {
    return (
      <FlightsListViewComponent
      flights={this.state.flights}
      onHandleDelete={this.onHandleDelete}
      />
    );
  }
});

window.FlightsListContainer = FlightsListContainer;
