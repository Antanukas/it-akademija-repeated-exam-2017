var array = [];

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
      if (array.includes(id)){
          console.log("id already added to array")
      } else {
          console.log("added new id to array: " + id);
          array.push(id);
      }
      console.log(array);
  },
  
  remove: function(id){
	  var index = array.indexOf(id);
      console.log(index);
      array.splice(index, 1);
  },

  delete: function(){
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
      <FlightsListViewComponent
      flights={this.state.flights}
      markForRemove={this.markForRemove}
      remove={this.remove}
      delete={this.delete}
      />
    );
  }
});

window.FlightsListContainer = FlightsListContainer;
