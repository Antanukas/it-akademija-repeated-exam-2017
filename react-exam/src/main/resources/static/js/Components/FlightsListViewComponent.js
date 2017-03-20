var FlightsListViewComponent = React.createClass({
  delete : function(){
    this.props.onHandleDelete(this.props.id);
  },

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

                  <tfoot>
                    <button type="button" onClick={this.delete} id={'delete-button' + this.props.id} className='btn btn-danger'>Ištrinti</button>
                  </tfoot>
                </table>
            </div>
    );
  }

});

window.FlightsListViewComponent = FlightsListViewComponent;
