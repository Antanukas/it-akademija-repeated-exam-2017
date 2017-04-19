var FlightsListViewRowComponent = React.createClass({

    getInitialState: function() {
      return {backgroundColor: default};
    },

    changeColor: function(){
        this.setState({color: ""})
    },

  render: function() {
    return (
                    <tr style={backgroundColor: this.state.color}>
                      <td>
                        {props.id}
                      </td>
                      <td>
                        {props.date}
                      </td>
                      <td>
                        {props.time}
                      </td>
                      <td>
                        {props.flightNumber}
                      </td>
                      <td>
                        {props.company}
                      </td>
                      <td>
                        {props.status}
                      </td>
                      <td>
                        <button onClick={onHandleClick}>Pasirinkti trinamus elementus</button>
                      </td>
                    </tr>
    );
  }
});
FlightsListViewRowComponent.contextTypes = {
  router: React.PropTypes.object.isRequired,
};
window.FlightsListViewRowComponent = FlightsListViewRowComponent;
