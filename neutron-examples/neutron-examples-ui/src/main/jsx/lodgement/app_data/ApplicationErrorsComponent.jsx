import React from 'react';
import PropTypes from 'prop-types';
import NeutronHoc from '../../neutron/NeutronHoc';
import CloseIconComponent from '../../bootstrap3/CloseIconComponent';

class ApplicationErrorsComponent extends React.PureComponent {

    componentDidUpdate() {
        //now the field to focus is displayed
        if (this.componentDidUpdateCallback) {
            this.componentDidUpdateCallback();
            delete this.componentDidUpdateCallback;
        }
    }

    focusOnField(errorNode) {
        const errorNodeName = errorNode.getName();
        this.props.model.setFocus(errorNodeName);

        //set focus to the element after next render
        const source = errorNode.getSource();
        if (source) {
            this.componentDidUpdateCallback = () => {
                console.log(`Trying to set focus to element: ${source.getUniqueId()}`);
                const dom = document.getElementById(source.getUniqueId());
                if (dom) {
                    dom.focus();
                }
            };
            this.forceUpdate(); //trigger componentDidUpdate
        }
    }

    renderErrors() {
        return this.props.model.getChildren().map(item =>
            <div key={item.getUniqueId()} className="clearfix alert alert-warning">
                <div className="error-path">
                    {item.getSource() ? item.getSource().getPathLabel() : ''}
                </div>
                <div className="error-text">
                    <a tabIndex="0" onClick={() => this.focusOnField(item)}>{item.getMessage()}</a>
                </div>
            </div>
        );
    }

    render() {
        return (
            <div className={this.props.componentClass} style={{top: `${this.props.top}px`}}>
                <div className="title-bar">
                    <div className="badge-link">
                        <span className="badge">{this.props.count}</span>
                    </div>
                    <CloseIconComponent onClose={this.props.onClose}/>
                </div>

                <div className="content small">
                    {this.renderErrors()}
                </div>
            </div>
        );
    }
}

export default NeutronHoc(
    ApplicationErrorsComponent,
    (model) => {
        const props = {};
        props.count = model.getItemCount();
        return props;
    },
    {
        onClose: PropTypes.func.isRequired,
        top: PropTypes.number.isRequired
    }
);
