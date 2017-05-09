import React from 'react';
import PropTypes from 'prop-types';
import ListNeutronComponent from '../../bootstrap3/ListNeutronComponent';
import CloseIconComponent from '../../bootstrap3/CloseIconComponent';

export default class ApplicationErrorsComponent extends ListNeutronComponent {

    focusOnField(errorNode) {
        const errorNodeName = errorNode.getName();
        this.model.setFocus(errorNodeName);

        //set focus to the element after next render
        const source = errorNode.getSource();
        if (source) {
            this.addCallback(() => {
                console.log(`Trying to set focus to element: ${source.getUniqueId()}`);
                const dom = document.getElementById(source.getUniqueId());
                if (dom) {
                    dom.focus();
                }
            });
            this.forceUpdate();
        }
    }

    extractNewState() {
        const newState = super.extractNewState();

        newState.count = this.model.getItemCount();

        return newState;
    }

    renderErrors() {
        const errors = [];

        this.model.getChildren().forEach(
            (item) => {
                errors.push(
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
        );

        return errors;
    }

    render() {
        return (
            <div className="application-errors-component">
                <div className="title-bar">
                    <div className="badge-link">
                        <span className="badge">{this.state.count}</span>
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

ApplicationErrorsComponent.propTypes = {
    onClose: PropTypes.func.isRequired
};
