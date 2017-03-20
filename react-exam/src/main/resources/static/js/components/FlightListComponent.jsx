var FlightListComponent = React.createClass({
	render: function() {

		var FlightList = this.props.flights.map(function(flight, index) {
			return (
				<tr key={index}>
					<td>{flight.id}</td>
					<td>{flight.flightNumber}</td>
					<td>{flight.date}</td>
					<td>{flight.time}</td>
					<td>{flight.company}</td>
					<td>{flight.status}</td>
				</tr>
			);
		});


		return (
			<div className="container-fluid">
				<h3>Flights List</h3>
					<table className="table table-striped table-bordered">
						<thead>
							<tr>
								<th>ID</th>
								<th>Flight Number</th>
								<th>Date</th>
								<th>Time</th>
								<th>Company</th>
								<th>Status</th>
							</tr>
						</thead>
						<tbody>
							{FlightList}
						</tbody>
					</table>
			</div>
		);
	}
});

FlightListComponent.propTypes = {
        flights: React.PropTypes.array.isRequired,
};

window.FlightListComponent = FlightListComponent;

