import React from 'react';
import NeutronComponent from '../../../bootstrap3/NeutronComponent';
import PersonEmploymentComponent from './PersonEmploymentComponent';

export default class PersonEmploymentListComponent extends NeutronComponent {

    constructor(props) {
        super(props);

        this.createNewItem = () => {
            const item = this.model.createItem();
            //todo rename to afterUpdate or something.
            this.addCallback(() => {
                //todo extract method
                const dom = document.getElementById(item.getUniqueId());
                if (dom && item.focus) {
                    dom.focus();
                }
            });
        };
    }

    renderEmployments() {
        const items = [];
        this.model.getChildren().forEach((item) => {
            items.push(<PersonEmploymentComponent key={item.getUniqueId()} model={item}/>);
        });
        return items;
    }

    render() {
        return (
            <div className="person-current-employment-list-component">
                {this.renderEmployments()}
                <div className="container-fluid">
                    <div className="row">
                        <div className="col-md-1">
                            <button className="btn btn-primary" onClick={this.createNewItem}>Add</button>
                        </div>
                        <div className="col-md-11"/>
                    </div>
                </div>
            </div>
        );
    }
}
