import React from 'react';
import PropTypes from 'prop-types';
import ResizeAware from 'react-resize-aware';
import NeutronComponent from '../../bootstrap3/NeutronComponent';
import CommonUtil from '../services/CommonUtil';
import LocationService from '../services/LocationService';
import LodgementService from '../services/LodgementService';

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

    constructor(props) {
        super(props);

        this.handleResize = ({height}) => {
            this.setState({
                headerHeight: height - 1
            });
        };
    }

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
                    <td width="4%">
                        <input
                            tabIndex="0"
                            type="radio"
                            name="select_application"
                            onClick={() => LodgementService.setCurrentAppId(data.id)}
                        />
                    </td>
                    <td width="9%">{data.lender}</td>
                    <td width="14%">
                        <a tabIndex="0" onClick={() => LodgementService.openApp(data.id)}>
                            {renderNames(data.applicants)}
                        </a>
                    </td>
                    <td width="10%">{data.username}</td>
                    <td width="9%" className="text-right">{CommonUtil.formatCurrency(data.amount)}</td>
                    <td width="8%">{data.status}</td>
                    <td width="12%">{CommonUtil.formatDate(data.created)}</td>
                    <td width="12%">{CommonUtil.formatDate(data.updated)}</td>
                    <td width="12%"/>
                </tr>
            );
        }
        if (items.length === 0) {
            items.push(
                <tr key="no_result">
                    <td colSpan="9">
                        <div className="alert alert-info">
                            No application found.
                        </div>
                    </td>
                </tr>
            );
        }
        return items;
    }

    render() {
        return (
            <div className="application-list-component">
                <ResizeAware
                    className="lodgement-header-component"
                    style={{position: 'relative'}}
                    onlyEvent
                    onResize={this.handleResize}
                >
                    <table className="table application-table-header">
                        <thead>
                        <tr>
                            <th width="4%"/>
                            <th width="9%">Lender</th>
                            <th width="14%">Applicant Name</th>
                            <th width="10%">Owner</th>
                            <th width="9%" className="text-right">Loan Amount</th>
                            <th width="8%">Loan Status</th>
                            <th width="12%">Date Created</th>
                            <th width="12%">Date Updated</th>
                            <th width="12%">Date Lodged</th>
                        </tr>
                        </thead>
                    </table>
                </ResizeAware>
                {
                    !isNaN(this.state.headerHeight) &&
                    <div className="fill-all" style={{top: `${this.state.headerHeight}px`}}>
                        <table className="table table-striped table-hover application-table">
                            <tbody>
                            {this.renderItems()}
                            </tbody>
                        </table>
                    </div>
                }
            </div>
        );
    }
}

ApplicationListComponent.propTypes = {
    model: PropTypes.object.isRequired
};
