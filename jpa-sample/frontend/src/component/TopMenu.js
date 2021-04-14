import React from 'react';
import { Navbar } from 'react-bootstrap';
import { BrowserRouter as Router, Route } from 'react-router-dom';
import Main from './Main';
import Member from './Member';

const TopMenu = () => {
	return (
		<Router>
			<Navbar bg="dark" variant="dark" className="mb-4">
				<Navbar.Brand href="/">Home</Navbar.Brand>
				<Navbar.Brand href="/main">Main</Navbar.Brand>
				<Navbar.Brand href="/member">Member</Navbar.Brand>
			</Navbar>
			<Route path="/main" component={Main} />
			<Route path="/member" component={Member} />
		</Router>
	);
};

export default TopMenu;
