import React from 'react';
import PropTypes from 'prop-types';
import NeutronComponent from '../../bootstrap3/NeutronComponent';
import CommonUtil from '../services/CommonUtil';
import LocationService from '../services/LocationService';


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
        LocationService.syncHashToState(this.model);
        console.debug('synced hash to app list');
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
                    <td className="text-right">{CommonUtil.formatCurrency(data.amount)}</td>
                    <td>{data.status}</td>
                    <td>{CommonUtil.formatDate(data.created)}</td>
                    <td>{CommonUtil.formatDate(data.updated)}</td>
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
                        <th width="10%">Lender</th>
                        <th width="14%">Applicant Name</th>
                        <th width="10%">Owner</th>
                        <th className="text-right" width="10%">Loan Amount</th>
                        <th width="10%">Loan Status</th>
                        <th width="12%">Date Created</th>
                        <th width="12%">Date Updated</th>
                        <th width="12%">Date Lodged</th>
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
    model: PropTypes.object.isRequired,
    onLoadApp: PropTypes.func.isRequired
};
