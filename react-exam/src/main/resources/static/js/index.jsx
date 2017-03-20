var App = React.createClass({
  render: function() {
    return (
      <FlightListComponent />
    );
  }
});

ReactDOM.render(<App />, document.getElementById('root'));
