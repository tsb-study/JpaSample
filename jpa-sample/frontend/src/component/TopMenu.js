import React from 'react';
import { Navbar } from 'react-bootstrap';
import { BrowserRouter as Router, Route } from 'react-router-dom';
import Main from './Main';
import Member from './Member';
import '../App.css';

const TopMenu = () => {
	return (
		<Router>
			<Navbar>
				<Navbar.Brand href="/" className="topmenu">
					Home
				</Navbar.Brand>
				<Navbar.Brand href="/member" className="topmenu">
					Member
				</Navbar.Brand>
			</Navbar>
			<Route path="/member" component={Member} />
		</Router>
	);
};

export default TopMenu;
