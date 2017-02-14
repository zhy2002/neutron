import React from 'react';
import axios from 'axios';
import NeutronComponent from '../../bootstrap3/NeutronComponent';
import CommonUtil from '../CommonUtil';


export default class ApplicationToolbarComponent extends NeutronComponent {

    constructor(props) {
        super(props);

        this.validate = () => {
            console.log('validating...');
            this.model.refresh();
        };

        this.getJson = () => {
            const obj = CommonUtil.extractValue(this.model);
            const json = JSON.stringify(obj);
            console.log('extracted object:');
            console.log(json);
            window.alert(json);
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
            </div>
        );
    }
}
