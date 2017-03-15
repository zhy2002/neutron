import React from 'react';
import NeutronComponent from '../../bootstrap3/NeutronComponent';
import ModalDialogComponent from '../../bootstrap3/ModalDialogComponent';
import CommonUtil from '../services/CommonUtil';
import StorageService from '../services/StorageService';


export default class ApplicationToolbarComponent extends NeutronComponent {

    constructor(props) {
        super(props);

        this.state.modelJson = null;

        this.validate = () => {
            console.log('validating...');
            this.model.refresh();
        };

        this.getJson = () => {
            const json = this.getModelValueJson();
            this.setState({modelJson: json});
        };

        this.saveJson = () => {
            StorageService.saveApplication(this.model).then(
                (response) => {
                    console.log(response);
                    alert('saved!');
                }
            );
        };
    }

    getModelValueJson() {
        const obj = CommonUtil.extractValue(this.model);
        const json = JSON.stringify(obj);
        console.log('extracted object:');
        console.log(json);
        return json;
    }

    render() {
        return (
            <div className="container-fluid application-toolbar-component">
                <ul className="nav navbar-nav toolbar">
                    <li>
                        <a tabIndex="0" onClick={this.validate}>
                            <div>
                                <span className="glyphicon glyphicon-check"/>
                            </div>
                            <div>
                                <small>Validate</small>
                            </div>
                        </a>
                    </li>
                    <li>
                        <a tabIndex="0" onClick={this.getJson}>
                            <div>
                                <span className="glyphicon glyphicon-open"/>
                            </div>
                            <div>
                                <small>Get JSON</small>
                            </div>
                        </a>
                    </li>
                    <li>
                        <a tabIndex="0" onClick={this.saveJson}>
                            <div>
                                <span className="glyphicon glyphicon-save-file"/>
                            </div>
                            <div>
                                <small>Save</small>
                            </div>
                        </a>
                    </li>
                    <li>
                        <a tabIndex="0">
                            <div>
                                <span className="glyphicon glyphicon-refresh"/>
                            </div>
                            <div>
                                <small>Refresh</small>
                            </div>
                        </a>
                    </li>
                    <li>
                        <a tabIndex="0">
                            <div>
                                <span className="glyphicon glyphicon-align-justify"/>
                            </div>
                            <div>
                                <small>Clear</small>
                            </div>
                        </a>
                    </li>
                </ul>
                <ModalDialogComponent
                    title="Application Value JSON"
                    model={this.model}
                    show={this.state.modelJson !== null}
                    onClose={() => this.setState({modelJson: null})}
                >
                    <p className="force-wrap">{this.state.modelJson}</p>
                </ModalDialogComponent>
            </div>
        );
    }
}
