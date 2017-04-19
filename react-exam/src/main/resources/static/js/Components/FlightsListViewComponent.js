var FlightsListViewComponent = React.createClass({

  render: function() {
    var array = [];
    var self = this;
    this.props.flights.map(function(flight,index) {
      array.push(
        <FlightsListViewRowComponent
          id={flight.id}
          key={index}
          date={flight.date}
          time={flight.time}
          flightNumber={flight.flightNumber}
          company={flight.company}
          status={flight.status}
          markForRemove={props.markForRemove}
          remove={props.remove}
        />
      );
    });

    return (

          <div className="panel panel-default">
            <div className="panel-heading" style={{paddingTop:20,paddingBottom:20}}>
              <h4 style={{display:'inline'}}><i className="fa fa-table"></i>&nbsp; Lėktuvų skrydžių tvarkaraštis sąrašas</h4>
            </div>
              <div className="panel-body">
              </div>
                <table className="table table-striped table-hover">
                  <thead>
                    <tr>
                      <th>
                        Id
                      </th>
                      <th>
                        Data
                      </th>
                      <th>
                        Laikas
                      </th>
                      <th>
                        Skrydžio nr.
                      </th>
                      <th>
                        Įmonė
                      </th>
                      <th>
                        Skrydžio statusas
                      </th>
                    </tr>
                  </thead>

                  <tbody>
                    {array}
                  </tbody>
                </table>
            </div>
    );
  }

});

window.FlightsListViewComponent = FlightsListViewComponent;
