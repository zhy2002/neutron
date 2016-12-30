import React from 'react';

import NeutronComponent from "../materialui/NeutronComponent.jsx";


export default class ErrorListComponent extends NeutronComponent {

    constructor(props) {
        super(props);
    }

    render() {

        let errorList = this.model;
        let errorRows = [];

        for (let i = 0; i < errorList.getItemCount(); i++) {
            let item = errorList.getItem(i);
            errorRows.push(<tr key={item.getUniqueId()}>
                <td>{item.getMessage()}</td>
            </tr>);
        }

        return (
            <table>
                <thead>
                <tr>
                    <th>Message</th>
                </tr>
                </thead>
                <tbody>
                {errorRows}
                </tbody>

            </table>
        );
    }

}