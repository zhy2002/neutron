import React from 'react';
import PropTypes from 'prop-types';
import AutoCloseContainer from '../neutron/AutoCloseContainer';
import CommonUtil from '../neutron/CommonUtil';


export default class LenderListComponent extends React.PureComponent {

    render() {
        if (!this.props.show)
            return null;

        const names = GWT.getApplicationProfileNames();
        return (
            <AutoCloseContainer className="lender-list-component" onHide={this.props.onQuit}>
                <div className="list-inline">
                    {names.map(item =>
                        <a
                            key={item}
                            className="list-group-item"
                            tabIndex="0"
                            onClick={() => this.props.onSelect(item)}
                        >
                            {item}
                        </a>
                    )}
                </div>
            </AutoCloseContainer>
        );
    }
}

LenderListComponent.propTypes = {
    show: PropTypes.bool,
    onSelect: PropTypes.func,
    onQuit: PropTypes.func
};

LenderListComponent.defaultProps = {
    show: false,
    onSelect: CommonUtil.noOp,
    onQuit: CommonUtil.noOp
};
