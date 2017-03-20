/**
 * Created by osvaldas on 17.3.20.
 */

var FlightLineContainer = React.createClass({

    getInitialState: function() {
        return {
            background: {backgroundColor: "white"},
            marked: false
        };
    },

    changeColor: function () {
        if (this.state.marked){
            this.setState({background: {backgroundColor: "white"}})
            this.setState({marked: !this.state.marked})
        } else {
            this.setState({background: {backgroundColor: "red"}})
            this.setState({marked: !this.state.marked})
        }
    },


    render: function () {
        return (
            <FlightLineComponent
                key={this.props.key}
                company={this.props.company}
                date={this.props.date}
                flightNumber={this.props.flightNumber}
                id={this.props.id}
                status={this.props.status}
                time={this.props.time}
                addForRemoval={this.props.addForRemoval}
                backgroundColor={this.state.background}
                changeColor={this.changeColor}
                removeFromArray={this.props.removeFromArray}
                marked={this.state.marked}
            />
        )
    }

});

window.FlightLineContainer = FlightLineContainer;