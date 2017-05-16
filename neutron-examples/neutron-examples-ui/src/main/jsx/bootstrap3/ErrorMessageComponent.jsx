import React from 'react';
import PropTypes from 'prop-types';

export default function ErrorMessageComponent(props) {
    if (!props.message)
        return null;

    return (
        <div className="tooltip bottom error-message " role="tooltip">
            <div className="tooltip-inner text-warning">
                {props.message}
            </div>
            <div className="tooltip-arrow"/>
        </div>
    );
}

ErrorMessageComponent.propTypes = {
    message: PropTypes.string.isRequired
};
