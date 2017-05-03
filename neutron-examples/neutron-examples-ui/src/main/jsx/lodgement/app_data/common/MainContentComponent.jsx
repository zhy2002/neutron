import React from 'react';
import PropTypes from 'prop-types';

export default class MainContentComponent extends React.PureComponent {

    render() {
        return (
            <div className={`container-fluid compact main-content-component ${this.props.className}`}>
                {this.props.children}
            </div>
        );
    }

}

MainContentComponent.propTypes = {
    className: PropTypes.string.isRequired,
    children: PropTypes.any.isRequired
};
