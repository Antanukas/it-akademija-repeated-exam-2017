var SingleFlightComponent = React.createClass({


    getInitialState: function() {
        return {
            color: "FFFFFF"
        };
    },


    changeColor: function () {
        this.setState({color: "F83A3A"})
    },

    render: function() {
        return (
            <tr style={{ backgroundColor: this.state.color }}>
                <td onClick={() => {
                    this.props.onDeleteList(this.props.flight);
                    this.changeColor();
                }}>{this.props.flight.id}</td>
                <td>{this.props.flight.time}</td>
                <td>{this.props.flight.flightNumber}</td>
                <td>{this.props.flight.company}</td>
                <td>{this.props.flight.status}</td>

            </tr>
        );
    }
});

window.SingleFlightComponent = SingleFlightComponent;
