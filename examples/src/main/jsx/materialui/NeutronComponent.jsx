import React from "react";

export default class NeutronComponent extends React.Component {

    constructor(props) {
        super(props);

        this.initialize(props);
        this.model.addChangeListener(this);
        this.state = this.extractNewState();
    }

    initialize(props) {
        this.id = props["id"];
        this.model = props["model"];
    }

    extractNewState() {
        return {};
    }

    componentWillReceiveProps(nextProps) {
        //todo might need to do somthing here...
    }

    onUiNodeChanged() {
        let newState = this.extractNewState();
        this.setState(newState);
    }
}

NeutronComponent.propTypes = {
    id: React.PropTypes.string,
    model: React.PropTypes.object.isRequired
};

