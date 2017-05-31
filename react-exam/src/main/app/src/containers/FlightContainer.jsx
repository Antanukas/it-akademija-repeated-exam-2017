/* eslint-disable indent */
import React, { Component } from 'react';
import axios from 'axios';
import FlightComponent from '../components/FlightComponent';


class FlightContainer extends Component {
  constructor(props) {
    super(props);
    this.state = {
        selected: [],
        flights: [],
        selectedFlights: [],
    }
    ;
    this.Select = this.Select.bind(this);
    this.Delete = this.Delete.bind(this);
  }
    componentDidMount() {
        const self = this;
        axios.get('http://127.0.0.1:8080/api/flights')
            .then((response) => {
                self.setState({
                    flights: response.data,
                });
                // console.log(response.data);
            });
    }
  Select(index, flight) {
    const temp = this.state.selected;
    const fakeFlights = this.state.selectedFlights;
    if (!(this.state.selected.indexOf(index) > -1)) {
      temp.push(index);
      fakeFlights.push(flight);
    } else if (this.state.selected.indexOf(index) > -1) {
      temp.splice(temp.indexOf(index), 1);
      fakeFlights.splice(temp.indexOf(index), 1);
    }
    this.setState({
      selected: temp,
      selectedFlights: fakeFlights,
    });

    // console.log(this.state.selected);
  }
  Delete() {
      const self = this;
      this.state.selectedFlights.forEach((flight) => {
          self.state.flights.splice(self.state.flights.indexOf(flight), 1);
          axios.delete('http://127.0.0.1:8080/api/flights/'+ flight.id)
          .then(() => {
              self.setState({
                  selected: [],
                  selectedFlights: [],
              });
          });
      });
  }

  render() {
    return (
      <div>
        <FlightComponent
          Select={this.Select}
          selected={this.state.selected}
          flights={this.state.flights}
          Delete={this.Delete}
        />
      </div>
    );
  }
}

export default FlightContainer;
