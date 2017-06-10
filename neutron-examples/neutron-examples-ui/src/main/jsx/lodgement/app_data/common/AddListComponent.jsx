import React from 'react';
import PropTypes from 'prop-types';
import NeutronHoc from '../../../neutron/NeutronHoc';
import CommonUtil from '../../../neutron/CommonUtil';


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
        const model = this.props.model;

        return (
            <div className={`${this.props.componentClass} row`}>
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
                            {React.Children.count(this.props.children) === 0 && this.props.emptyMessage ?
                                <div key="no_result" className="alert alert-info">
                                    {this.props.emptyMessage}
                                </div> :
                                this.props.children
                            }
                            {}
                        </div>
                    </div>
                </div>
            </div>
        );
    }
}

AddListComponent.propTypes = NeutronHoc.suppressMissingPropTypes();

export default NeutronHoc(
    AddListComponent,
    CommonUtil.mapToEmptyObject,
    {
        children: PropTypes.any.isRequired,
        emptyMessage: PropTypes.string
    }
);
