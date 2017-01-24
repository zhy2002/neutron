import React from 'react';
import NeutronComponent from '../../materialui/NeutronComponent';
import SelectInputComponent from '../../materialui/SelectInputComponent';
import FieldErrorMessageComponent from '../../materialui/FieldErrorMessageComponent';

const inputColumnStyle = {
    paddingLeft: '0'
};

const columnStyle = {
    padding: '0'
};

export default class MonthYearComponent extends NeutronComponent {

    render() {
        const model = this.model;

        return (
            <div id={this.id} tabIndex="0" className="row expanded month-year">
                <div className="small-12 columns">
                    <p style={this.state.style}>{this.label}</p>
                    <div className="row expanded">
                        <div className="small-8 columns" style={columnStyle}>
                            <SelectInputComponent columnStyle={inputColumnStyle} model={model.getMonthNode()}/>
                        </div>
                        <div className="small-4 columns" style={columnStyle}>
                            <SelectInputComponent columnStyle={inputColumnStyle} model={model.getYearNode()}/>
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
