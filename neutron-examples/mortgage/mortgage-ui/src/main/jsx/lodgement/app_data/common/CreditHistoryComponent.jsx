import React from 'react';
import NeutronHoc from '../../../neutron/NeutronHoc';
import TextInputComponent from '../../../bootstrap3/TextInputComponent';


class CreditHistoryComponent extends React.PureComponent {

    constructor(props) {
        super(props);

        this.removeItem = () => {
            const model = this.props.model;
            if (window.confirm('Are you sure you want to delete this employment record?')) {
                model.getParent().removeItem(model);
            }
        };
    }

    render() {
        const model = this.props.model;

        return (
            <div className="row">
                <div className="col-xs-4 col-xs-offset-2">
                    <p><em>Legal Issue</em></p>
                    <TextInputComponent model={model} hideLabel label=" "/>
                </div>
                <div className="col-xs-6">
                    <button className="btn btn-sm btn-warning" onClick={this.removeItem}>
                        Remove
                    </button>
                </div>
            </div>
        );
    }
}

export default NeutronHoc(CreditHistoryComponent);
