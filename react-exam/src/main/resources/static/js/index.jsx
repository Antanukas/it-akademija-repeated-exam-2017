var App = React.createClass({
  render: function() {
    return (
    <div style={{ paddingTop: '20px' }}>
      <nav className="navbar navbar-default">
        <div className="container-fluid">
            <ul className="nav navbar-nav">
              <li><a href="#/">Skrydžių tvarkaraštis</a></li>
            </ul>
        </div>
      </nav>
      {this.props.children}
    </div>
    );
  }
});

window.App = App;

var NoMatch = React.createClass({
  render: function() {
    document.title='Puslapis nerastas. 404 klaida';
    return(
      <div>
      <div style={{marginTop: '50px'}} className="jumbotron alert alert-danger erpage">
        <h1><i className="fa fa-meh-o" aria-hidden="true"></i> Puslapis nerastas</h1>
        <p>Įvestas puslapio adresas nerastas.</p>
      </div>
    </div>);
  }
});

var Router = ReactRouter.Router;
var Route = ReactRouter.Route;
var IndexRoute = ReactRouter.IndexRoute;
var hashHistory = ReactRouter.hashHistory;

ReactDOM.render((
  <Router history={hashHistory}>
    <Route path="/" component={App}>
      <IndexRoute component={FlightsListContainer} />
      <Route path="*" component={NoMatch}/>
    </Route>
  </Router>
), document.getElementById('root'));
