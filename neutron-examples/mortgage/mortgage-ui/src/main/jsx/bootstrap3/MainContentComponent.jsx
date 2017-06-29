import React from 'react';
import PropTypes from 'prop-types';

export default function MainContentComponent(props) {
    return (
        <div className={`container-fluid main-content-component ${props.className}`}>
            {props.children}
        </div>
    );
}

MainContentComponent.propTypes = {
    className: PropTypes.string.isRequired,
    children: PropTypes.any.isRequired
};
