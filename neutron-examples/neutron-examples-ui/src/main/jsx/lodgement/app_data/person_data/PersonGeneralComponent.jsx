import React from 'react';
import moment from 'moment';
import NeutronHoc from '../../../neutron/NeutronHoc';
import RadioInputComponent from '../../../bootstrap3/RadioInputComponent';
import CheckboxInputComponent from '../../../bootstrap3/CheckboxInputComponent';
import SelectInputComponent from '../../../bootstrap3/SelectInputComponent';
import TextInputComponent from '../../../bootstrap3/TextInputComponent';
import DateInputComponent from '../../../bootstrap3/DateInputComponent';
import ReferenceInputComponent from '../../../bootstrap3/ReferenceInputComponent';
import MainContentComponent from '../../../bootstrap3/MainContentComponent';


class PersonGeneralComponent extends React.PureComponent {

    constructor(props) {
        super(props);

        this.getOtherPersonApplicants = () => {
            const me = this.props.model.getParent();
            return me.getParent().getChildren().filter(person => person !== me);
        };
    }

    render() {
        const model = this.props.model;
        return (
            <MainContentComponent className={this.props.componentClass}>
                <div className="row">
                    <div className="col-md-6 col-lg-4">
                        <div className="row">
                            <div className="col-sm-12">
                                <SelectInputComponent model={model.getTitleNode()}/>
                            </div>
                            <div className="col-sm-12">
                                <TextInputComponent model={model.getFirstNameNode()}/>
                            </div>
                            <div className="col-sm-12">
                                <TextInputComponent model={model.getLastNameNode()}/>
                            </div>
                            <div className="col-sm-12">
                                <RadioInputComponent model={model.getGenderNode()}/>
                            </div>
                            <div className="col-sm-12">
                                <DateInputComponent model={model.getDateOfBirthNode()}/>
                            </div>
                        </div>
                    </div>
                    <div className="col-md-6 col-lg-4">
                        <div className="row">
                            <div className="col-sm-12">
                                <RadioInputComponent model={model.getPersonApplicantTypeNode()}/>
                            </div>
                            <div className="col-sm-12">
                                <SelectInputComponent model={model.getApplicationTypeNode()}/>
                            </div>
                            <div className="col-sm-12">
                                <CheckboxInputComponent model={model.getPrimaryApplicantFlagNode()}/>
                            </div>
                            <div className="col-sm-12">
                                <CheckboxInputComponent model={model.getFirstHomeBuyerFlagNode()}/>
                            </div>
                            <div className="col-sm-12">
                                <CheckboxInputComponent model={model.getPermanentResidentFlagNode()}/>
                            </div>
                        </div>
                    </div>
                    <div className="col-md-6 col-lg-4">
                        <div className="row">
                            <div className="col-sm-12">
                                <SelectInputComponent model={model.getMaritalStatusNode()}/>
                            </div>
                            <div className="col-sm-12">
                                <ReferenceInputComponent
                                    model={model.getSpouseNode()}
                                    getOptionNodes={this.getOtherPersonApplicants}
                                />
                            </div>
                            <div className="col-sm-12">
                                <SelectInputComponent model={model.getHousingStatusNode()}/>
                            </div>
                            <div className="col-sm-12">
                                <TextInputComponent model={model.getDriversLicenseNode()}/>
                            </div>
                        </div>
                    </div>
                </div>
            </MainContentComponent>
        );
    }
}

export default NeutronHoc(PersonGeneralComponent);
