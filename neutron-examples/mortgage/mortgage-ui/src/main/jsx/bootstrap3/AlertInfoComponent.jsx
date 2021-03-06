import React from 'react';
import PropTypes from 'prop-types';

export default function AlertInfoComponent(props) {
    return (
        <div className="alert alert-info">
            <span>{props.children}</span>
        </div>
    );
}

AlertInfoComponent.propTypes = {
    children: PropTypes.any.isRequired
};

