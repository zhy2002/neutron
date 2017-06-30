import React from 'react';
import PropTypes from 'prop-types';
import CommonUtil from '../neutron/CommonUtil';
import UiService from '../neutron/UiService';
import DummyNavDropdownComponent from '../bootstrap3/DummyNavDropdownComponent';


export default class LodgementBannerComponent extends React.PureComponent {

    render() {
        return (
            <nav className="navbar navbar-default lodgement-banner-component">
                <div className="container-fluid">
                    <div className="navbar-header">
                        <img src={this.props.logoUrl} alt="Site Logo" height="50px"/>
                    </div>
                    <ul className="nav navbar-nav navbar-right">
                        <DummyNavDropdownComponent model={{}} onSelect={CommonUtil.noOp}>
                            {UiService.getCurrentUser().name} &nbsp; <span className="glyphicon glyphicon-user"/>
                        </DummyNavDropdownComponent>
                    </ul>
                </div>
            </nav>
        );
    }
}

LodgementBannerComponent.propTypes = {
    logoUrl: PropTypes.string.isRequired
};
