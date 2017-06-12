import React from 'react';
import PropTypes from 'prop-types';
import NeutronHoc from '../neutron/NeutronHoc';
import CommonUtil from '../neutron/CommonUtil';


function ModelLinkComponent(props) {
    const model = props.model;

    function selectItem() {
        model.getContext().getRootNode().setContentNode(model);
    }

    return (
        <div className="form-group form-group-sm">
            <label>{props.title}</label>
            <div className="input-group static">
                <a tabIndex="0" className="form-control-static" onClick={selectItem}>
                    {props.label}
                </a>
            </div>
        </div>
    );
}

ModelLinkComponent.propTypes = NeutronHoc.suppressMissingPropTypes();
export default NeutronHoc(
    ModelLinkComponent,
    CommonUtil.mapToEmptyObject,
    {
        title: PropTypes.string.isRequired
    }
);
