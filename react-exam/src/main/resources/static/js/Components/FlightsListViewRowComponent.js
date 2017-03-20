var FlightsListViewRowComponent = React.createClass({

    getInitialState: function() {
      return {bgColor: default};
    },

    onHandleClick : function(event){
      this.setState({ bgColor: 'red' });
      return function(){
      this.props.onHandleDelete(this.props.id)};
    },

  render: function() {
    return (
                    <tr id={this.props.id} style={{backgroundColor:this.state.bgColor}}>
                      <th href={"#deleteButton" + this.props.id} onClick={this.onHandleClick} id={'delete-button-' + this.props.id} data-toggle="button">
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
    );
  }
});
FlightsListViewRowComponent.contextTypes = {
  router: React.PropTypes.object.isRequired,
};
window.FlightsListViewRowComponent = FlightsListViewRowComponent;
