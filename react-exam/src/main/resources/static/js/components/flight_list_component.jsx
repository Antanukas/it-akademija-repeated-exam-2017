var FlightListComponent = function(props) {
    var flightCards = props.flights.map(function (flight,index) {
        return (
             <FlightCardComponent
               key={index}
               id={flight.id}
               company={flight.company}
               flightNumber={flight.flightNumber}
               date={flight.date}
               status={flight.status}
               time={flight.time}
                />
        );
    });
    
    return (
         <div>
            <TableHeadingComponent />
                <div className="row">
                    {flightCards}
                </div>
             <DeleteButtonComponent />
         </div>
        );
};



window.FlightListComponent = FlightListComponent;

  
  