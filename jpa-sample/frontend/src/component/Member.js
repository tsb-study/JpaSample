import React, { useEffect, useState } from 'react';
import axios from 'axios';

const Member = () => {
	const [data, setData] = useState('');
	const getApi = () => {
		axios.get('/api/v1/member').then((res) => {
			setData(res.data);
		});
	};

	useEffect(() => {
		getApi();
	}, [data]);

	return (
		<>
			회원목록
			<p />
			<table>
				<tr>
					<th>id</th>
					<th>name</th>
				</tr>
				{data.map(({ id, name }) => (
					<tr>
						<td>{id}</td>
						<td>{name}</td>
					</tr>
				))}
			</table>
		</>
	);
};

export default Member;
