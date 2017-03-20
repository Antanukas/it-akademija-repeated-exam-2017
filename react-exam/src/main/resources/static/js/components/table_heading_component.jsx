

var TableHeadingComponent = React.createClass({
    render: function() {
        return (
                <div className="container">
                <table className="table">
                    <thead>
                    <tr>
                      <th>Id</th>
                      <th>Company</th>
                      <th>Date</th>
                      <th>Flight Number</th>
                      <th>Status</th>
                      <th>Time</th>
                    </tr>
                  </thead>    
                </table>
              </div> 
        );
    }
});


window.TableHeadingComponent = TableHeadingComponent;