import React from "react";

export default class NeutronComponent extends React.Component {

    constructor(props) {
        super(props);

        this.initialize(props);
        this.model.addChangeListener(this);
        this.state = this.extractNewState();
        this.callbackQueue = [];
    }

    initialize(props) {
        this.id = props["id"];
        this.model = props["model"];
    }

    extractNewState() {
        return {};
    }

    addCallback(func) {
        if(func instanceof Function) {
            this.callbackQueue.push(func);
        }
    }

    componentWillReceiveProps(nextProps) {
        //todo might need to do somthing here...
    }

    onUiNodeChanged() {
        let newState = this.extractNewState();
        this.setState(newState);
    }

    componentWillUnmount() {
        this.model.removeChangeListener(this);
    }

    componentDidUpdate() {
        while(this.callbackQueue.length > 0) {
            let func = this.callbackQueue.shift();
            setTimeout(func, 0);
        }
    }
}

NeutronComponent.propTypes = {
    id: React.PropTypes.string,
    model: React.PropTypes.object.isRequired
};

