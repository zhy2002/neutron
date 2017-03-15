import React from 'react';
import StorageService from '../services/StorageService';


export default class ApplicationListComponent extends React.PureComponent {

    componentDidMount() {
        StorageService.getApplicationSummaries().then(
            (data) => {
                this.setState({result: data});
            }
        );
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
                    <td>
                        <a tabIndex="0" onClick={() => this.props.onLoadApp(data.id)}>
                            Application {i + 1}
                        </a>
                    </td>
                    <td>{data.applicants}</td>
                    <td>{data.amount}</td>
                    <td>{data.status}</td>
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
                <table className="table">
                    <thead>
                    <tr>
                        <th>Applicant Name</th>
                        <th>Owner</th>
                        <th>Loan Amount</th>
                        <th>Loan Status</th>
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
