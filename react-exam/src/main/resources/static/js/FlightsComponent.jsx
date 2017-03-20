
function getflightTable(self){
  var flightTable = [];
  if (self.props.flightsList) {
    flightTable = self.props.flightsList.map(function(flight,index){
      return (
        <tr key={index} className='small'>
          <td id="columnId"></td>
          <td>{flight.date}</td>
          <td>{flight.time}</td>
          <td>{flight.flightNumber}</td>
          <td>{flight.company}</td>
          <td>{flight.status}</td>
        </tr>
      );
    });
  }
  return flightTable;
}

var FlightsComponent = React.createClass({

  render: function() {
    var flightArrayList = getflightTable(this);
    return (
      <div>
        <div className="container">
          <h1 className='yellow'> Flights List</h1>
        </div>
        <div id="exTab1" className="container shadow">
          <div className="tab-content clearfix">
            <table width="100%" className="table table-striped table-hover" id="dataTables-example">
              <thead>
                <tr>
                  <th className='col-md-1 col-sm-1'>Id</th>
                  <th className='col-md-1 col-sm-2'>Date</th>
                  <th className='col-md-1 col-sm-1'>Time</th>
                  <th className='col-md-4 col-sm-2'>Flight Number</th>
                  <th className='col-md-1 col-sm-3'>Company</th>
                  <th className='col-md-4 col-sm-3'>Fight Status</th>
                  <th className='col-md-1 col-sm-1'></th>
                </tr>
              </thead>
              <tbody>
                {flightArrayList}
              </tbody>
            </table>
          </div>
          <div><button type='button' onClick={this.onHandleDelete} className='btn btn-danger btn-md'>Delete Flights</button></div>
        </div>
      </div>
    );
  }
});

window.FlightsComponent = FlightsComponent;
