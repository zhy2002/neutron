import React from 'react';
import NeutronComponent from '../materialui/NeutronComponent';


export default class ErrorListComponent extends NeutronComponent {

    focusOnField(errorNode) {
        const errorNodeName = errorNode.getName();
        this.model.setFocus(errorNodeName);

        //set focus to the element after next render
        const source = errorNode.getSource();
        if (source) {
            this.addCallback(() => {
                console.log(`Trying to set focus to element: ${source.getUniqueId()}`);
                const dom = document.getElementById(source.getUniqueId());
                if (dom) {
                    dom.focus();
                }
            });
        }
    }

    render() {
        const errorList = this.model;
        const errorRows = [];

        for (let i = 0; i < errorList.getItemCount(); i++) {
            const item = errorList.getItem(i);
            errorRows.push(
                <tr key={item.getUniqueId()}>
                    <td>{item.getSource() ? item.getSource().getPathLabel() : ''}</td>
                    <td>
                        <a tabIndex="0" onClick={() => this.focusOnField(item)}>{item.getMessage()}</a>
                    </td>
                </tr>
            );
        }

        return (
            <table>
                <thead>
                <tr>
                    <th width="20%">Source</th>
                    <th>Message</th>
                </tr>
                </thead>
                <tbody>{errorRows}</tbody>

            </table>
        );
    }
}
