import React from 'react';
import NeutronHoc from '../neutron/NeutronHoc';
import TextInputComponent from '../bootstrap3/TextInputComponent';
import LoginService from './services/LoginService';

class LoginComponent extends React.PureComponent {

    constructor(props) {
        super(props);

        this.submit = (e) => {
            e.preventDefault();
            e.stopPropagation();
            const model = this.props.model;
            const username = model.getUsernameNode().getValue();
            const password = model.getPasswordNode().getValue();
            if (!username || !password) {
                model.refresh();
                return;
            }
            model.setLoginState('waiting');
            LoginService.login(username, password).catch(() => {
                model.setLoginState('failed');
            });
        };
    }

    render() {
        const {componentClass, model, loginState} = this.props;

        return (
            <div className={componentClass}>
                <form onSubmit={this.submit}>
                    <h3>Please Login</h3>
                    <div className="container-fluid">
                        <div className="row">
                            <div className="col-md-10 col-md-offset-1">
                                <TextInputComponent
                                    model={model.getUsernameNode()}
                                    disabled={loginState === 'waiting'}
                                />

                            </div>
                        </div>
                        <div className="row">
                            <div className="col-md-10 col-md-offset-1">
                                <TextInputComponent
                                    model={model.getPasswordNode()}
                                    isPassword
                                    disabled={loginState === 'waiting'}
                                />
                            </div>
                        </div>
                        <div className="row">
                            <div className="col-md-10 col-md-offset-1">
                                &nbsp;&nbsp;
                                {loginState === 'failed' &&
                                <span className="text-danger">Invalid username or password.</span>
                                }
                            </div>
                        </div>
                        <div className="row">
                            <div className="col-md-10 col-md-offset-1 text-right">
                                <button
                                    className="btn btn-default"
                                    type="submit"
                                    disabled={loginState !== '' && loginState !== 'failed'}
                                >
                                    Submit
                                </button>
                            </div>
                        </div>
                    </div>
                </form>
            </div>
        );
    }
}

export default NeutronHoc(
    LoginComponent,
    (model) => {
        const props = {};
        props.loginState = model.getLoginState();
        return props;
    }
);
