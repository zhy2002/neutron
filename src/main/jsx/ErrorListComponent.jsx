import React from "react";

export default class ErrorListComponent extends React.Component {

    constructor(props) {
        super(props);

        this.model = props['model'];
        console.log('error list node');
        console.log(this.model);
    }

    render() {
        var items = [];
        for (var i = 0; i < this.model.getChildCount(); i++) {
            var errorNode = this.model.getItem(i);
            items.push(<li key={errorNode.getName()}>{errorNode.getMessage()}</li>);
        }
        return (
            <div>
                <h4>Errors</h4>
                <ul>
                    {items}
                </ul>
            </div>
        );
    }
}