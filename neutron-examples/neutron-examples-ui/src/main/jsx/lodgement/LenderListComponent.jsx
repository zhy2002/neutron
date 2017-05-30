import React from 'react';
import PropTypes from 'prop-types';
import AutoCloseContainer from '../bootstrap3/AutoCloseContainer';

export default class LenderListComponent extends React.PureComponent {

    render() {
        const names = GWT.getApplicationProfileNames();
        return (
            <AutoCloseContainer className="lender-list-component" onHide={this.props.onQuit}>
                <div className="list-inline">
                    {
                        names.map(
                            item =>
                                <a
                                    key={item}
                                    className="list-group-item"
                                    tabIndex="0"
                                    onClick={() => this.props.onSelect(item)}
                                >
                                    {item}
                                </a>
                        )
                    }
                </div>
            </AutoCloseContainer>
        );
    }
}

LenderListComponent.propTypes = {
    onSelect: PropTypes.func.isRequired,
    onQuit: PropTypes.func.isRequired
};
