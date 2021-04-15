import React, { useEffect, useState } from 'react';
import axios from 'axios';
import { Table } from 'react-bootstrap';

const Member = () => {
	const [data, setData] = useState([]);

	useEffect(async () => {
		try {
			const result = await axios.get('/api/v1/member');
			setData(result.data);
		} catch (e) {
			console.log(e);
		}
	}, []);
	return (
		<>
			<Table striped bordered hover>
				<thead>
					<tr>
						<th>id</th>
						<th>name</th>
					</tr>
				</thead>
				<tbody>
					{data.map(({ id, name }) => (
						<tr key={id + name}>
							<td>{id}</td>
							<td>{name}</td>
						</tr>
					))}
				</tbody>
			</Table>
		</>
	);
};

export default Member;
