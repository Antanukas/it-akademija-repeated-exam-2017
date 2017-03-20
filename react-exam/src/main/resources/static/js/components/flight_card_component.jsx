var Link = ReactRouter.Link;
var PropTypes = React.PropTypes;

var FlightCardComponent = React.createClass({
    onSelect: function(e){
        return rowColor = "danger";
     },
    render: function() {
        var rowColor = "success";
        
        return (
                <div className="container">
                <table className="table">
                  <tbody>
                    <tr className={rowColor}>
                      <td onClick={this.onSelect}> {this.props.id}</td>
                      <td>{this.props.company}</td>
                      <td>{this.props.date}</td>
                      <td>{this.props.flightNumber}</td>
                      <td>{this.props.status}</td>
                      <td>{this.props.time}</td>
                    </tr>      
                  </tbody>
                </table>
              </div> 
        );
    }
});


FlightCardComponent.propTypes = {
        id: PropTypes.number.isRequired,
        company: PropTypes.string.isRequired,
        date: PropTypes.string.isRequired,
        flightNumber: PropTypes.string.isRequired,
        status: PropTypes.string.isRequired,
        time: PropTypes.string.isRequired
};

window.FlightCardComponent = FlightCardComponent;