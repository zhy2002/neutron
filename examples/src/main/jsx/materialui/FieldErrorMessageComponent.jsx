import React from 'react';

export default class FieldErrorMessageComponent extends React.PureComponent {

    render() {
        return (
            <div
                style={{
                    marginTop: '0.5em',
                    fontSize: '12px',
                    lineHeight: '12px',
                    color: 'rgb(244, 67, 54)',
                    transition: 'all 450ms cubic-bezier(0.23, 1, 0.32, 1) 0ms'
                }}
            >
                {this.props.errorMessage}
            </div>
        );
    }
}

FieldErrorMessageComponent.propTypes = {
    errorMessage: React.PropTypes.string.isRequired
};
