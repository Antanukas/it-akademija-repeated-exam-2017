/**
 * Created by osvaldas on 17.3.20.
 */

var FlightLineComponent = function (props) {

    var styles = {
        lineColor: { backgroundColor: "white"},

    };

    var addForRemoval = function () {
        props.addForRemoval(props.id)
    };

    var removeFromArray = function () {
        props.removeFromArray(props.id)
    };

    var handleOnClick = function () {
        if(props.marked){
            props.changeColor();
            removeFromArray();
        } else {
            addForRemoval();
            props.changeColor();
        }
    };

    return (
        <tr style={props.backgroundColor}>
            <td>{props.id}</td>
            <td>{props.date}</td>
            <td>{props.time}</td>
            <td>{props.flightNumber}</td>
            <td>{props.company}</td>
            <td>{props.status}</td>
            <td><button onClick={handleOnClick}>Ruošti trynimui</button></td>
        </tr>
    )
};

window.FlightLineComponent = FlightLineComponent;