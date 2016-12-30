import React from 'react';

export default class FieldErrorMessageComponent extends React.Component {

    constructor(props) {
        super(props);

        this.state = {
            errorMessage: props["errorMessage"]
        };
    }

    componentWillReceiveProps(nextProps){
        this.setState({errorMessage: nextProps["errorMessage"]});
    }

    render() {
        return (
            <div style={{marginTop: "0.5em", fontSize: "12px", lineHeight: "12px", color: "rgb(244, 67, 54)", transition: "all 450ms cubic-bezier(0.23, 1, 0.32, 1) 0ms"}}>
                {this.state.errorMessage}
            </div>
        );
    }

}

FieldErrorMessageComponent.propTypes = {
    errorMessage: React.PropTypes.string.isRequired
};