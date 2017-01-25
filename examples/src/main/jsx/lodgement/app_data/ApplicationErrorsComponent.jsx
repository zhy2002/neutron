import React from 'react';
import NeutronComponent from '../../bootstrap3/NeutronComponent';

export default class ApplicationErrorsComponent extends NeutronComponent {

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
        }
    }

    renderErrors() {
        const errors = [];

        this.model.getChildren().forEach(
            (item) => {
                errors.push(
                    <div key={item.getUniqueId()} className="clearfix alert alert-warning">
                        <div className="col-p35">
                            {item.getSource() ? item.getSource().getPathLabel() : ''}
                        </div>
                        <div className="col-p65">
                            <a tabIndex="0" onClick={() => this.focusOnField(item)}>{item.getMessage()}</a>
                        </div>
                    </div>
                );
            }
        );

        return errors;
    }

    render() {
        if (this.props.visible) {
            return (
                <div className="application-errors-component">
                    <div className="title-bar">
                        <a tabIndex="0" onClick={this.props.onClose} alt="Close">
                            <span className="glyphicon glyphicon-remove"/>
                        </a>
                    </div>
                    <div className="header small">
                        <div className="title clearfix">
                            <div className="col-p35">Source</div>
                            <div className="col-p65">Message</div>
                        </div>
                    </div>
                    <div className="content small">
                        {this.renderErrors()}
                    </div>
                </div>
            );
        }
        return null;
    }
}

ApplicationErrorsComponent.propTypes = {
    visible: React.PropTypes.bool.isRequired,
    onClose: React.PropTypes.func.isRequired
};
