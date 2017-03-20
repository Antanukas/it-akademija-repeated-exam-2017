var FlightListComponent = React.createClass({
    getInitialState: function() {
        return {
          bgColor: {backgroundColor:'red'} 
        };
    },
    
    
    changeColor:function(){
      
        return {backgroundColor:'skyBlue'}
        
    },
    
    
    render: function() {
        var _this = this;
        var flightList = this.props.flights.map( function( flight, index ) {
          var rowColor = {};
            if(_this.props.deleteIdState.includes(flight.id)){
                rowColor= {backgroundColor:'red'}
            }
            
            
          return (
              <tr style={rowColor} key={index}>
                  
              <td id={flight.id} onClick={_this.props.selectDeletionId} >{flight.id}</td>
              <td>{flight.company}</td>
              <td>{flight.date}</td>
              <td>{flight.status}</td>
               <td>{flight.time}</td>
             
              </tr>
          );
        });
        
        
 
        
        
        return (
                <div className="container">
               
                <div className="panel panel-default">
                
                <div className="panel-heading">THE FLIGHT LIST</div>
                <table className="table table-hover">     
                <thead>  
                <tr>
                
                    <th>id</th>
                    <th>company</th>
                    <th>date</th>
                    <th>status</th>
                    <th>time</th>

                  </tr>
                    </thead>
                    <tbody>
                    {flightList}
                    </tbody>
                </table>
              
              </div>
                <button className="btn btn-danger" onClick={this.props.onClickDeleteSelected} >Trinti</button>
                </div>
                )
    }
    });



window.FlightListComponent = FlightListComponent;