var Router = ReactRouter.Router;
var Route = ReactRouter.Route;
var hashHistory = ReactRouter.hashHistory;
var IndexRoute = ReactRouter.IndexRoute;


var routes = (
 <Router history={hashHistory}>
        <Router>
     <Route path="/" component={App}>
      <IndexRoute component={FlightContainer} />
                     
        </Route>
       </Router>
  </Router>
        );

window.routes = routes;