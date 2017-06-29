import React from 'react';
import PropTypes from 'prop-types';

export default function ErrorMessageComponent({messages}) {
    if (!messages || messages.length === 0)
        return null;

    return (
        <div className="tooltip bottom error-message " role="tooltip">
            <div className="tooltip-inner text-warning">
                <ul>
                    {messages.map(message => <li key={message}>{message}</li>)}
                </ul>
            </div>
            <div className="tooltip-arrow"/>
        </div>
    );
}

ErrorMessageComponent.propTypes = {
    messages: PropTypes.array.isRequired
};
