import React from "react";

export default class ErrorListComponent extends React.Component {

    constructor(props) {
        super(props);

        this.model = props['model'];
        this.model.addChangeListener(this);
        this.state = this.extractNewState();
    }

    extractNewState() {
        var newState = {};
        newState.items = this.model.getChildren();
        return newState;
    }

    componentDidMount() {
        console.log("ErrorList did mount");
    }

    onUiNodeChanged() {
        var newState = this.extractNewState();
        this.setState(newState);
    }

    render() {
        var items = this.state.items;

        var listItems = [];
        console.log(items);
        for (var i = 0; i < items.length; i++) {
            var errorNode = items[i];
            console.log(errorNode);
            listItems.push(<li key={errorNode.getName()}>{errorNode.getMessage()}</li>);
        }

        if (listItems.length) {
            return (
                <div>
                    <h4>Errors</h4>
                    <ul>
                        {listItems}
                    </ul>
                </div>
            );
        } else {
            return (<div/>);
        }

    }
}