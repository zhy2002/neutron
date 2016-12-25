import React from 'react';

import NeutronComponent from "../../materialui/NeutronComponent.jsx";
import PersonDataComponent from "./PersonDataComponent.jsx";


export default class PersonListViewComponent extends NeutronComponent {

    constructor(props) {
        super(props);
    }

    render() {
        let model = this.model;
        if(model.getItemCount() == 0) {
            return <div/>;
        }

        let selectedIndex = model.getSelectedIndex();
        console.log("showing item: " + selectedIndex);
        let personData = model.getItem(selectedIndex);
        return <PersonDataComponent model={personData} />;
    }

}