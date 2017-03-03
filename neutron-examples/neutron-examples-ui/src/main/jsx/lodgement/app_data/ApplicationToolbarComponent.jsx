import React from 'react';
import axios from 'axios';
import NeutronComponent from '../../bootstrap3/NeutronComponent';
import ModalDialogComponent from '../../bootstrap3/ModalDialogComponent';
import CommonUtil from '../services/CommonUtil';


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

        this.loadJson = () => {
            const model = this.model;
            axios.get('json/application/app1.json').then(
                (response) => {
                    console.log('response is:');
                    console.log(response);
                    const context = model.getContext();
                    context.beginSession();
                    CommonUtil.setValue(model, response.data);
                    context.commitSession();
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
                        <a tabIndex="0" onClick={this.loadJson}>
                            <div>
                                <span className="glyphicon glyphicon-save"/>
                            </div>
                            <div>
                                <small>Load JSON</small>
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
