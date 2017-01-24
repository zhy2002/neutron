import React from 'react';
import NeutronComponent from '../../bootstrap3/NeutronComponent';

export default class ApplicationErrorsComponent extends NeutronComponent {

    renderRows() {
        if (this.model) {
            return (
                <tr>
                    <td>
                        sss<br/>
                        sss<br/>
                        sss<br/>
                        sss<br/>
                        sss<br/>
                        sss<br/>
                        sss<br/>
                        sss<br/>
                        sss<br/>
                        sss<br/>
                        sss<br/>
                        sss<br/>
                        sss<br/>
                        sss<br/>
                        sss<br/>
                        sss<br/>
                        sss<br/>
                        sss<br/>
                        sss<br/>
                        sss<br/>
                        sss<br/>
                        sss<br/>
                        sss<br/>
                        sss<br/>
                        sss<br/>
                        sss<br/>
                        sss<br/>
                        sss<br/>
                        sss<br/>
                        sss<br/>
                        sss<br/>
                        sss<br/>
                        sss<br/>
                        sss<br/>
                        sss<br/>
                        sss<br/>
                        sss<br/>
                        sss<br/>
                        sss<br/>
                        sss<br/>
                        sss<br/>
                        sss<br/>
                    </td>
                    <td>ddd</td>
                </tr>
            );
        }
        return null;
    }

    render() {
        return (
            <table className="table application-errors-component">
                <thead>
                <tr>
                    <th width="30%">Source</th>
                    <th>Message</th>
                </tr>
                </thead>
                <tbody>{this.renderRows()}</tbody>
            </table>
        );
    }
}
