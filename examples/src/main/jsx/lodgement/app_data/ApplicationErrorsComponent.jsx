import React from 'react';
import NeutronComponent from '../../bootstrap3/NeutronComponent';

export default class ApplicationErrorsComponent extends NeutronComponent {

    render() {
        if (this.props.visible) {
            return (
                <div className="application-errors-component">
                    <div className="title-bar">
                        <a tabIndex="0" onClick={this.props.onClose} alt="Close">
                            <span className="glyphicon glyphicon-remove"/>
                        </a>
                    </div>
                    <div className="header">
                        <div className="title clearfix">
                            <div className="col-p35">Source</div>
                            <div className="col-p65">Message</div>
                        </div>
                    </div>
                    <div className="content">
                        <div className="clearfix alert alert-warning">
                            <div className="col-p35">Source Source Source Source</div>
                            <div className="col-p65">Message</div>
                        </div>
                        <div className="clearfix alert alert-warning">
                            <div className="col-p35">Source</div>
                            <div className="col-p65">Message</div>
                        </div>
                        <div className="clearfix alert alert-warning">
                            <div className="col-p35">Source Source Source</div>
                            <div className="col-p65">Message</div>
                        </div>
                        <div className="clearfix alert alert-warning">
                            <div className="col-p35">Source</div>
                            <div className="col-p65">Message</div>
                        </div>
                        <div className="clearfix alert alert-warning">
                            <div className="col-p35">Source</div>
                            <div className="col-p65">Message</div>
                        </div>
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
