
var FlightsListContainer = React.createClass({
  getInitialState: function() {
    return {
      flights : []
    };
  },

  onHandleDelete : function(id, name){
    var self = this;
    axios
      .delete('/api/flights/'+id)
      .then(function(response){
        self.setState({flights:response.data});
      })
      .catch(function(err){
        console.error('FlightsListContainer.onHandleDelete.axios.', err);
      });
  },

  componentWillMount: function() {
    var self = this;
    axios.get('/api/flights')
    .then(function(response){
      self.setState({flights:response.data});
    }).catch(function(err){
      console.log(err);
    });
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
