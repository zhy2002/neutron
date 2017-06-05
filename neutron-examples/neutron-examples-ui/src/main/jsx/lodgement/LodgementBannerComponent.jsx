import React from 'react';
import CommonUtil from '../neutron/CommonUtil';
import DummyNavDropdownComponent from '../bootstrap3/DummyNavDropdownComponent';

export default class LodgementBannerComponent extends React.PureComponent {

    render() {
        return (
            <nav className="navbar navbar-default lodgement-banner-component">
                <div className="container-fluid">
                    <div className="navbar-header">
                        <img src="img/site_logo.png" alt="Site Logo" height="50px"/>
                    </div>
                    <ul className="nav navbar-nav navbar-right">
                        <DummyNavDropdownComponent model={{}} onSelect={CommonUtil.noOp}>
                            Demo User
                        </DummyNavDropdownComponent>
                        <DummyNavDropdownComponent model={{}} onSelect={CommonUtil.noOp}>
                            <span className="glyphicon glyphicon-user"/>
                        </DummyNavDropdownComponent>
                    </ul>
                </div>
            </nav>
        );
    }
}
