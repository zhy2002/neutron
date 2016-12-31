import React from 'react';

import NeutronComponent from "../materialui/NeutronComponent.jsx";


export default class ErrorListComponent extends NeutronComponent {

    constructor(props) {
        super(props);
    }

    focusOnField(errorNode) {
        this.model.setFocus(errorNode.getName());
    }

    render() {

        let errorList = this.model;
        let errorRows = [];

        for (let i = 0; i < errorList.getItemCount(); i++) {
            let item = errorList.getItem(i);
            errorRows.push(
                <tr key={item.getUniqueId()}>
                    <td><a href="javascript:void(0)" onClick={()=>this.focusOnField(item)}>{item.getMessage()}</a></td>
                </tr>
            );
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