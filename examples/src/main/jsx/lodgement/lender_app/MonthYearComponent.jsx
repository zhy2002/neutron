import React from "react";
import NeutronComponent from "../../materialui/NeutronComponent.jsx";
import SelectInputComponent from "../../materialui/SelectInputComponent.jsx";
import FieldErrorMessageComponent from "../../materialui/FieldErrorMessageComponent.jsx";

const inputColumnStyle = {
    paddingLeft: "0"
};

const columnStyle = {
    padding: "0"
};

export default class MonthYearComponent extends NeutronComponent {

    constructor(props) {
        super(props);
    }

    render() {
        const model = this.model;

        return (
            <div id={model.getUniqueId()} tabIndex="0" className="row expanded month-year">
                <div className="small-12 columns">
                    <label style={this.state.style}>{this.state.label}</label>
                    <div className="row expanded">
                        <div className="small-8 columns" style={columnStyle}>
                            <SelectInputComponent columnStyle={inputColumnStyle} model={model.getMonthNode()} />
                        </div>
                        <div className="small-4 columns" style={columnStyle}>
                            <SelectInputComponent columnStyle={inputColumnStyle} model={model.getYearNode()} />
                        </div>
                    </div>
                    <FieldErrorMessageComponent errorMessage={this.state.errorMessage}/>
                    <br/>
                    <br/>
                </div>
            </div>
        );
    }

}