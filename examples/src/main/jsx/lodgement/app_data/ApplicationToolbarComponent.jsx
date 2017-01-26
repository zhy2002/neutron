import React from 'react';
import NeutronComponent from '../../materialui/NeutronComponent';
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
            console.log('extracted object:');
            console.log(obj);
            window.alert(JSON.stringify(obj));
        };

        this.loadJson = () => {
            const model = this.model;
            $.get(
                'json/application/app1.json',
                (data) => {
                    const context = model.getContext();
                    context.beginSession();
                    CommonUtil.setValue(model, data);
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
                                <span className="glyphicon glyphicon-share"/>
                            </div>
                            <div>
                                <small>Get JSON</small>
                            </div>
                        </a>
                    </li>
                    <li>
                        <a tabIndex="0">
                            <div>
                                <span className="glyphicon glyphicon-refresh"/>
                            </div>
                            <div>
                                <small>Refresh 1</small>
                            </div>
                        </a>
                    </li>
                </ul>
            </div>
        );
    }
}
