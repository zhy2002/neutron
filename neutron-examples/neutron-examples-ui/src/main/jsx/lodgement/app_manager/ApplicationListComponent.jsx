import React from 'react';
import NeutronComponent from '../../bootstrap3/NeutronComponent';
import UiService from '../services/UiService';

function renderNames(array) {
    const result = [];
    if (array) {
        array.forEach((item, index) => {
            const key = index + 1;
            result.push(<p key={key}>{item}</p>);
        });
    }
    return result;
}

export default class ApplicationListComponent extends NeutronComponent {

    componentDidMount() {
        UiService.refreshApplicationList();
    }

    extractNewState() {
        const newState = super.extractNewState();
        newState.result = this.model.data;
        return newState;
    }

    renderItems() {
        const items = [];
        if (!this.state || !this.state.result)
            return items;

        const result = this.state.result.hits.hits;
        for (let i = 0; i < result.length; i++) {
            const data = result[i]['_source'];
            items.push(
                <tr key={data.id}>
                    <td>{data.lender}</td>
                    <td>
                        <a tabIndex="0" onClick={() => this.props.onLoadApp(data.id)}>
                            {renderNames(data.applicants)}
                        </a>
                    </td>
                    <td>{data.username}</td>
                    <td>{data.amount}</td>
                    <td>{data.status}</td>
                    <td>{data.created}</td>
                    <td>{data.updated}</td>
                    <td/>
                </tr>
            );
        }
        return items;
    }

    render() {
        return (
            <div className="application-list-component">
                <table className="table table-striped">
                    <thead>
                    <tr>
                        <th>Lender</th>
                        <th>Applicant Name</th>
                        <th>Owner</th>
                        <th>Loan Amount</th>
                        <th>Loan Status</th>
                        <th>Date Created</th>
                        <th>Date Updated</th>
                        <th>Date Lodged</th>
                    </tr>
                    </thead>
                    <tbody>
                    {this.renderItems()}
                    </tbody>
                </table>
            </div>
        );
    }
}

ApplicationListComponent.propTypes = {
    model: React.PropTypes.object.isRequired,
    onLoadApp: React.PropTypes.func.isRequired
};
