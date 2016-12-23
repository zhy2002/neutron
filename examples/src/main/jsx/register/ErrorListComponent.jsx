import React from "react";
import NeutronComponent from "../bootstrap3/NeutronComponent.jsx";

export default class ErrorListComponent extends NeutronComponent {

    constructor(props) {
        super(props);
    }

    extractNewState() {
        let newState = super.extractNewState();
        newState.items = this.model.getChildren();
        return newState;
    }

    focusOnField(node) {
        return function () {
            let source = node.getSource();
            if (source) {
                let fieldId = window.fieldMap[source.getUniqueId()];
                if (fieldId) {
                    let element = document.getElementById(fieldId);
                    if (element) {
                        element.focus();
                    }
                }
            }
        };
    }

    render() {
        let items = this.state.items;
        let listItems = [];
        console.log(items);
        for (var i = 0; i < items.length; i++) {
            let errorNode = items[i];
            console.log(errorNode);
            listItems.push(
                <li key={errorNode.getName()} className="list-group-item">
                    <a onClick={this.focusOnField(errorNode)} href="javascript:void(0)"
                       className="text-warning">{errorNode.getMessage()}</a>
                </li>
            );
        }

        if (listItems.length) {
            return (
                <div className="row">
                    <div className="col-md-offset-1 col-md-10">
                        <h4>Errors</h4>
                        <ul className="list-group">
                            {listItems}
                        </ul>
                    </div>
                </div>
            );
        } else {
            return (<div/>);
        }

    }
}