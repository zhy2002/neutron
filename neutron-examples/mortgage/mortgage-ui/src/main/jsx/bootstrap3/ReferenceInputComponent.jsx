import React from 'react';
import PropTypes from 'prop-types';
import InputComponent from './InputComponent';
import ModalDialogComponent from './ModalDialogComponent';
import NodeLabelComponent from '../neutron/NodeLabelComponent';


export default class ReferenceInputComponent extends InputComponent {

    constructor(props) {
        super(props);

        this.state.showModal = false;

        this.showList = () => {
            this.setState({
                showModal: true
            });
        };

        this.closeList = () => {
            this.setState({
                showModal: false
            });
        };

        this.clearValue = () => {
            this.model.setValue(null);
            this.setState({showModal: false});
        };
    }

    renderOptions() {
        return this.props.getOptionNodes().map(node =>
            <li key={node.getUniqueId()} className="list-group-item">
                <a
                    tabIndex="0"
                    onClick={() => {
                        this.model.setValue(node.getPath());
                        this.closeList();
                    }}
                >
                    {node.getNodeLabel()}
                </a>
            </li>
        );
    }

    renderContent() {
        const model = this.model;

        return [
            <div key="container" className="reference-container">
                {model.getReferencedNode() &&
                <NodeLabelComponent model={model.getReferencedNode()}/>
                }
                <button
                    id={model.getUniqueId()}
                    className="btn btn-sm btn-primary"
                    disabled={this.state.disabled || this.state.readonly}
                    onClick={this.showList}
                >
                    Select
                </button>
            </div>,
            <ModalDialogComponent
                key="dialog"
                show={this.state.showModal}
                title={this.state.label}
                onClose={this.closeList}
            >
                <div>
                    <ul className="list-group">
                        {this.renderOptions()}
                    </ul>
                </div>
                <button
                    onClick={this.clearValue}
                    className="btn btn-sm btn-danger"
                >
                    Clear
                </button>
            </ModalDialogComponent>
        ];
    }
}

ReferenceInputComponent.propTypes = {
    getOptionNodes: PropTypes.func.isRequired
};
