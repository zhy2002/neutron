import React from 'react';

export default class ApplicationListComponent extends React.PureComponent {

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
                    <tr>
                        <td>
                            <a tabIndex="0" onClick={() => this.props.onLoadApp(1)}>
                                Test User<br/>
                                Test Partner
                            </a>
                        </td>
                        <td>Loan Admin</td>
                        <td>$300,000</td>
                        <td>Created</td>
                        <td>2017-02-11 14:32:11</td>
                        <td />
                    </tr>
                    <tr>
                        <td>
                            <a tabIndex="0" onClick={() => this.props.onLoadApp(2)}>
                                John Rambo
                            </a>
                        </td>
                        <td>Loan Admin</td>
                        <td>$450,000</td>
                        <td>Created</td>
                        <td>2017-02-12 09:34:22</td>
                        <td/>
                    </tr>
                    <tr>
                        <td>
                            <a tabIndex="0" onClick={() => this.props.onLoadApp(3)}>
                                Michael Jackson
                            </a>
                        </td>
                        <td>Loan Assistant</td>
                        <td>$420,000</td>
                        <td>Lodged</td>
                        <td>2017-02-13 11:24:21</td>
                        <td>2017-02-13 12:05:01</td>
                    </tr>
                    <tr>
                        <td>
                            <a tabIndex="0" onClick={() => this.props.onLoadApp(4)}>
                                Terminator<br/>
                                Robocop
                            </a>
                        </td>
                        <td>Loan Assistant</td>
                        <td>$250,200</td>
                        <td>Approved</td>
                        <td>2017-01-22 10:12:59</td>
                        <td>2017-02-08 13:42:11</td>
                    </tr>
                    <tr>
                        <td>
                            <a tabIndex="0" onClick={() => this.props.onLoadApp(5)}>
                                Will Smith
                            </a>
                        </td>
                        <td>Loan Assistant</td>
                        <td>$375,000</td>
                        <td>Created</td>
                        <td>2017-02-13 15:30:47</td>
                        <td />
                    </tr>
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
