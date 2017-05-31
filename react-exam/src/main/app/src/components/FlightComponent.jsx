/* eslint-disable react/jsx-indent,react/jsx-indent-props */
import React from 'react';
import { Table, Button} from 'react-bootstrap';

const flights = props => (
    props.flights.map((flight, index) => (
        <tr
            key={index} onClick={props.Select.bind(this, index, flight)}
            className={props.selected.indexOf(index) > -1 ? 'aktyvus' : ' '}
        >
            <td>{flight.id}</td>
            <td>{flight.flightNumber}</td>
            <td>{flight.date}</td>
            <td>{flight.time}</td>
            <td>{flight.company}</td>
            <td>{flight.status}</td>
        </tr>
    ))
);

const FlightComponent = props => (
    <div>
        <Table bordered>
            <thead>
                <tr>
                    <td>Skrydžio Id</td>
                    <td>Skrydžio Numeris</td>
                    <td>Data</td>
                    <td>Laikas</td>
                    <td>Kompanija</td>
                    <td>Statusas</td>
                </tr>
            </thead>
            <tbody>
                {flights(props)}
                {/*{console.log(flights(props))}*/}
            </tbody>
        </Table>
        <Button bsStyle="danger" onClick={props.Delete}>Trinti</Button>
    </div>
);

export default FlightComponent;
