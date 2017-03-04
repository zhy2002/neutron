import React from 'react';

export default class MainContentComponent extends React.PureComponent {

    render() {
        return (
            <div className={`container-fluid compact ${this.props.className}`}>
                {this.props.children}
            </div>
        );
    }

}

MainContentComponent.propTypes = {
    className: React.PropTypes.string.isRequired,
    children: React.PropTypes.any.isRequired
};
