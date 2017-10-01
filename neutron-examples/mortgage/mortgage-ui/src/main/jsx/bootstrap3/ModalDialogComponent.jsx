import React from 'react';
import PropTypes from 'prop-types';

export default class ModalDialogComponent extends React.PureComponent {

    render() {
        if (!this.props.show) {
            return null;
        }

        return (
            <div className="modal-dialog-component">
                <div className="modal-backdrop fade in"/>
                <div className="modal fade in" tabIndex="-1" role="dialog">
                    <div className="modal-dialog" role="document">
                        <div className="modal-content">
                            <div className="modal-header">
                                {
                                    this.props.onClose &&
                                    <button
                                        type="button"
                                        className="close"
                                        aria-label="Close"
                                        onClick={this.props.onClose}
                                    >
                                        <span aria-hidden="true">&times;</span>
                                    </button>
                                }

                                <h4 className="modal-title">{this.props.title || 'This is the default title'}</h4>
                            </div>
                            <div className="modal-body">
                                {this.props.children}
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        );
    }
}

ModalDialogComponent.propTypes = {
    show: PropTypes.bool.isRequired,
    onClose: PropTypes.func,
    title: PropTypes.string,
    children: PropTypes.any
};

ModalDialogComponent.defaultProps = {
    title: '',
    onClose: null,
    children: null
};
