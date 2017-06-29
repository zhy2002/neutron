import React from 'react';
import {translate} from 'react-i18next';
import NeutronHoc from '../../neutron/NeutronHoc';
import ModalDialogComponent from '../../bootstrap3/ModalDialogComponent';
import EventService from '../../neutron/EventService';
import StorageService from '../services/StorageService';


class ApplicationToolbarComponent extends React.PureComponent {

    constructor(props) {
        super(props);

        this.state = {
            modelJson: null
        };

        this.validate = () => {
            const model = this.props.model;
            console.log('validating...');
            model.refresh();
            if (!model.getShowErrorList()) {
                EventService.fire(
                    'show_notification',
                    {
                        message: 'Application is valid.',
                        position: 'tc',
                        level: 'success'
                    }
                );
            }
            console.log('validation done.');
        };

        this.getJson = () => {
            const json = this.getModelValueJson();
            this.setState({modelJson: json});
        };

        this.saveJson = () => {
            const model = this.props.model;
            StorageService.saveApplication(model).then(
                (response) => {
                    console.log(response);
                    model.getContext().resetDirty();
                    EventService.fire(
                        'show_notification',
                        {
                            message: 'Application is saved.',
                            position: 'tc',
                            level: 'success'
                        }
                    );
                }
            );
        };

        this.clearErrors = () => {
            this.props.model.resetValidationState();
        };

        this.refresh = () => {
            const model = this.props.model;
            if (!model.isDirty() || confirm('Changes in this application will be lost. Continue?')) {
                EventService.fire(
                    'refresh_application',
                    model
                );
            }
        };
    }

    getModelValueJson() {
        const obj = StorageService.extractApplicationValue(this.props.model);
        const json = JSON.stringify(obj);
        console.log('extracted object:');
        console.log(json);
        return json;
    }

    render() {
        const {t} = this.props;
        return (
            <div className={`${this.props.componentClass} container-fluid`}>
                <ul className="nav navbar-nav toolbar">
                    <li>
                        <a tabIndex="0" onClick={this.validate}>
                            <div>
                                <span className="glyphicon glyphicon-check"/>
                            </div>
                            <div>
                                <small>{t('Validate')}</small>
                            </div>
                        </a>
                    </li>
                    <li>
                        <a tabIndex="0" alt="Clear Errors" onClick={this.clearErrors}>
                            <div>
                                <span className="glyphicon glyphicon-align-justify"/>
                            </div>
                            <div>
                                <small>{t('Clear')}</small>
                            </div>
                        </a>
                    </li>
                    <li>
                        <a tabIndex="0" onClick={this.getJson}>
                            <div>
                                <span className="glyphicon glyphicon-open"/>
                            </div>
                            <div>
                                <small>{t('Get JSON')}</small>
                            </div>
                        </a>
                    </li>
                    <li>
                        <a tabIndex="0" onClick={this.saveJson}>
                            <div>
                                <span className="glyphicon glyphicon-save-file"/>
                            </div>
                            <div>
                                <small>{t('Save')}</small>
                            </div>
                        </a>
                    </li>
                    <li>
                        <a tabIndex="0" onClick={this.refresh}>
                            <div>
                                <span className="glyphicon glyphicon-refresh"/>
                            </div>
                            <div>
                                <small>{t('Refresh')}</small>
                            </div>
                        </a>
                    </li>
                </ul>
                <ModalDialogComponent
                    title="Application Value JSON"
                    show={this.state.modelJson !== null}
                    onClose={() => this.setState({modelJson: null})}
                >
                    <div className="json-container">
                        <p className="force-wrap">{this.state.modelJson}</p>
                    </div>
                </ModalDialogComponent>
            </div>
        );
    }
}

export default translate()(NeutronHoc(ApplicationToolbarComponent));
