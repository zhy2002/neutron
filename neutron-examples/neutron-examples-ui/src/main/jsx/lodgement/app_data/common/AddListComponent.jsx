import React from 'react';
import PropTypes from 'prop-types';
import NeutronHoc from '../../../neutron/NeutronHoc';


class AddListComponent extends React.PureComponent {

    constructor(props) {
        super(props);

        this.createNewItem = () => {
            const item = this.props.model.createItem();
            this.componentDidUpdateCallback = () => {
                const dom = document.getElementById(item.getUniqueId());
                if (dom && dom.focus) {
                    dom.focus();
                }
            };
        };
    }

    componentDidUpdate() {
        if (this.componentDidUpdateCallback) {
            this.componentDidUpdateCallback();
            delete this.componentDidUpdateCallback;
        }
    }

    render() {
        const props = this.props;
        const model = props.model;

        return (
            <div className={`${props.componentClass} ${props.className} row`}>
                <div className="col-md-12">
                    <div className="row">
                        <div className="col-md-2">
                            <button
                                id={model.getUniqueId()}
                                className="btn btn-sm btn-primary pull-right"
                                onClick={this.createNewItem}
                            >
                                Add
                            </button>
                        </div>
                        <div className="col-md-10">
                            {React.Children.count(props.children) === 0 && props.emptyMessage ?
                                <div key="no_result" className="alert alert-info">
                                    {props.emptyMessage}
                                </div> :
                                props.children
                            }
                        </div>
                    </div>
                </div>
            </div>
        );
    }
}

export default NeutronHoc(
    AddListComponent,
    undefined,
    {
        children: PropTypes.any.isRequired,
        emptyMessage: PropTypes.string,
        className: PropTypes.string
    },
    {
        emptyMessage: null,
        className: ''
    }
);
