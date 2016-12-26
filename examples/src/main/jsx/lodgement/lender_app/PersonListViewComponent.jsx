import React from 'react';

import NeutronComponent from "../../materialui/NeutronComponent.jsx";
import PersonDataComponent from "./PersonDataComponent.jsx";


export default class PersonListViewComponent extends NeutronComponent {

    constructor(props) {
        super(props);
    }

    render() {
        let model = this.model;
        let selectedIndex = model.getSelectedIndex();
        let personDataList = [];

        for(let i=0; i<model.getItemCount(); i++) {
            if(i == selectedIndex) {
                let personData = model.getItem(selectedIndex);
                personDataList.push(<PersonDataComponent key={personData.getUniqueId()} model={personData} />);
            }
        }

        return (
            <div>
                {personDataList}
            </div>
        );
    }

}