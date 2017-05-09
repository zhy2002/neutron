import React from 'react';
import PropTypes from 'prop-types';


export default function CloseIconComponent(props) {
    return (
        <button
            className="close-icon-component"
            tabIndex="0"
            title={props.title}
            onClick={props.onClose}
        >
            <span className="glyphicon glyphicon-remove"/>
        </button>
    );
}

CloseIconComponent.propTypes = {
    onClose: PropTypes.func.isRequired,
    title: PropTypes.string
};

CloseIconComponent.defaultProps = {
    title: 'Close'
};
