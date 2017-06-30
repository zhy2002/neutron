import React from 'react';
import ResizeAware from 'react-resize-aware';
import NeutronHoc from '../../neutron/NeutronHoc';
import FormattingService from '../../neutron/FormattingService';
import LocationService from '../services/LocationService';
import LodgementService from '../services/LodgementService';


function renderItems({result}) {
    const items = [];

    const array = result && result.hits ? result.hits.hits : [];
    for (let i = 0; i < array.length; i++) {
        const data = array[i]['_source'];
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
                        {
                            (data.applicants || []).map((item, index) => {
                                const key = index + 1;
                                return (
                                    <p key={key}>{item}</p>
                                );
                            })
                        }
                    </a>
                </td>
                <td width="10%">{data.username}</td>
                <td width="9%" className="text-right">{FormattingService.formatCurrency(data.amount)}</td>
                <td width="8%">{data.status}</td>
                <td width="12%">{FormattingService.formatDate(data.created)}</td>
                <td width="12%">{FormattingService.formatDate(data.updated)}</td>
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

class ApplicationListComponent extends React.PureComponent {

    constructor(props) {
        super(props);

        this.state = {};

        this.handleResize = ({height}) => {
            this.setState({
                headerHeight: height - 1
            });
        };
    }

    componentDidMount() {
        const props = this.props;
        LocationService.syncHashToState(props.model);
        console.debug('synced hash to app list');
    }

    render() {
        const props = this.props;

        return (
            <div className={props.componentClass}>
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
                            {renderItems(props)}
                            </tbody>
                        </table>
                    </div>
                }
            </div>
        );
    }
}

export default NeutronHoc(
    ApplicationListComponent,
    (model) => {
        const newState = {};
        newState.result = model.getValue();
        return newState;
    }
);
