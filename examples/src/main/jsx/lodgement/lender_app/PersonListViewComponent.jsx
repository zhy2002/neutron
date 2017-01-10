import React from 'react';
import NeutronComponent from '../../materialui/NeutronComponent';
import PersonDataComponent from './PersonDataComponent';


export default class PersonListViewComponent extends NeutronComponent {

    render() {
        const model = this.model;
        const selectedIndex = model.getSelectedIndex();
        const personDataList = [];

        for (let i = 0; i < model.getItemCount(); i++) {
            if (i === selectedIndex) {
                const personData = model.getItem(selectedIndex);
                personDataList.push(<PersonDataComponent key={personData.getUniqueId()} model={personData}/>);
            }
        }

        return (
            <div>
                {personDataList}
            </div>
        );
    }

}
