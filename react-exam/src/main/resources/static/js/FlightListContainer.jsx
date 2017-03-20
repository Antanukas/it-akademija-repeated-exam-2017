

var deleteId =[]
var FlightListContainer = React.createClass({
   
   getInitialState: function() {
        return {
          flights: [], deleteIdState:[]
        };
    },
    
    handleSelectDeletionId:function(e){
        
        console.log( e.target.id);
        
       
        
        if(deleteId.includes(parseInt(e.target.id))){
           //
            //deleteId.remove(parseInt(e.target.id));
            var index = deleteId.indexOf(parseInt(e.target.id)); 
          if (index > -1) {
              deleteId.splice(index, 1);
          }
          this.setState({deleteIdState:deleteId});
        }else{
           
            
          deleteId.push(parseInt(e.target.id));
          this.setState({deleteIdState:deleteId});
        }
       
        console.log(this.state.deleteIdState);
    },
    
    handleOnClickDeleteSelected: function() {
        var _this = this;
        
        
        
        for (var index = 0; index < this.state.deleteIdState.length; index++) {
            
            axios.delete('/api/flights/' + _this.state.deleteIdState[index] ).then( function( response ) {
                
               
            });
            
	
}
        
        axios.get( '/api/flights' ).then( function( response ) {
            _this.setState( { flights: response.data });
        });

    },
    
    componentWillMount: function() {
        var _this = this;
        axios.get('/api/flights')
        .then(function (response) {
            _this.setState({ 
                flights: response.data 
            });
        });

    },
   
    render: function() {
        
        
       
             
        
        return (<FlightListComponent onClickDeleteSelected={this.handleOnClickDeleteSelected} deleteIdState={this.state.deleteIdState} flights={this.state.flights} selectDeletionId={this.handleSelectDeletionId}/>)
     
    }
    });



window.FlightListContainer = FlightListContainer;