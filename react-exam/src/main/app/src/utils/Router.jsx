import React, { Component } from 'react';
import { BrowserRouter, Route, Link, Switch } from 'react-router-dom';
import {Browserhistory} from 'react-history';
import Nav from './Nav';
import ContainerArray from '../containers/FlightContainer';


const Router = () => (
  <BrowserRouter history={Browserhistory}>
    <div className="container">
      <Nav />
      <Switch>
        <Route exact path="/" component={ContainerArray} />
        <Route path="/popular" />
          <Route render={() => (<p><b>Not Found 404, sorry mate</b></p>)} />
      </Switch>
    </div>
  </BrowserRouter>
    );


export default Router;
