import React from 'react';
import ListNeutronComponent from '../../../bootstrap3/ListNeutronComponent';


export default class AddListComponent extends ListNeutronComponent {

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

    render() {
        return (
            <div className="row add-list-component">
                <div className="col-md-12">
                    <div className="row">
                        <div className="col-md-2">
                            <button
                                id={this.model.getUniqueId()}
                                className="btn btn-sm btn-primary pull-right"
                                onClick={this.createNewItem}
                            >
                                Add
                            </button>
                        </div>
                        <div className="col-md-10"/>
                    </div>
                    <div className="row">
                        <div className="col-md-12">
                            {this.props.children}
                        </div>
                    </div>
                </div>
            </div>
        );
    }
}

AddListComponent.propTypes = {
    children: React.PropTypes.any.isRequired
};
