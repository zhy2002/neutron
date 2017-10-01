import React from 'react';
import PropTypes from 'prop-types';
import i18next from 'i18next';
import {translate} from 'react-i18next';
import LodgementService from '../lodgement/services/LodgementService';

function languageChanged(err) {
    if (err) {
        console.warn(err);
    }
}

class DummyNavDropdownComponent extends React.PureComponent {

    constructor(props) {
        super(props);

        this.state = {
            open: false
        };

        this.toggle = () => {
            this.setState(
                state => ({open: !state.open})
            );
        };

        this.open = () => {
            this.setState({open: true});
        };

        this.close = () => {
            this.setState({open: false});
        };

        this.changeToEnglish = () => {
            i18next.changeLanguage('en', languageChanged);
            this.close();
        };

        this.changeToChinese = () => {
            i18next.changeLanguage('zh', languageChanged);
            this.close();
        };

        this.logout = () => {
            LodgementService.logout();
        };
    }

    render() {
        const {t} = this.props;

        return (
            <li className={`dropdown${this.state.open ? ' open' : ''}`} onMouseLeave={this.close}>
                <a tabIndex="0" className="dropdown-toggle" onMouseEnter={this.open} onClick={this.toggle}>
                    {this.props.children} <span className="caret"/>
                </a>
                <ul className="dropdown-menu">
                    <li><a tabIndex="0" onClick={this.changeToEnglish}>{t('English')}</a></li>
                    <li><a tabIndex="0" onClick={this.changeToChinese}>{t('Chinese')}</a></li>
                    <li><a tabIndex="0">Something else here</a></li>
                    <li role="separator" className="divider"/>
                    <li><a tabIndex="0">Separated link</a></li>
                    <li role="separator" className="divider"/>
                    <li><a tabIndex="0" onClick={this.logout}>Logout</a></li>
                </ul>
            </li>
        );
    }
}

DummyNavDropdownComponent.propTypes = {
    model: PropTypes.object.isRequired,
    onSelect: PropTypes.func.isRequired,
    children: PropTypes.any.isRequired
};

export default translate()(DummyNavDropdownComponent);
