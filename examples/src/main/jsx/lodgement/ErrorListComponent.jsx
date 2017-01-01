import React from 'react';

import NeutronComponent from "../materialui/NeutronComponent.jsx";


export default class ErrorListComponent extends NeutronComponent {

    constructor(props) {
        super(props);
    }

    focusOnField(errorNode) {
        const errorNodeName = errorNode.getName();
        this.model.alwaysTrackChangeOnce();
        this.model.setFocus(errorNodeName);
        const source = errorNode.getSource();
        if(source) {
            this.addCallback(function() {
                console.log('Trying to set focus to element: ' + source.getUniqueId());
                const dom = document.getElementById(source.getUniqueId());
                if(dom) {
                    dom.focus();
                }
            });
        }
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