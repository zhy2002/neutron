import React from 'react';


export default class ApplicationListComponent extends React.Component {

    constructor(props) {
        super(props);
    }

    render() {
        return (
            <table>
                <thead>
                <tr>
                    <th>Column1</th>
                    <th>Column2</th>
                    <th>Column3</th>
                    <th>Column4</th>
                </tr>
                </thead>
                <tbody>
                <tr>
                    <td>data</td>
                    <td>more data</td>
                    <td>event more data</td>
                    <td>1111</td>
                </tr>
                </tbody>
            </table>
        );
    }
}