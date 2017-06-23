import React from 'react';
import PropTypes from 'prop-types';
import InputComponent from './InputComponent';
import ModalDialogComponent from './ModalDialogComponent';
import NodeLabelComponent from '../neutron/NodeLabelComponent';


export default class ReferenceInputComponent extends InputComponent {

    constructor(props) {
        super(props);

        this.state.showModal = false;

        this.closeList = () => {
            this.setState({
                showModal: false
            });
        };

        this.clearValue = () => {
            this.model.setValue(null);
            this.setState({showModal: false});
        };

        this.showList = () => {
            this.setState({
                showModal: true
            });
        };

        this.identifierClass = 'reference-input-component';
    }

    renderOptions() {
        const result = [];
        const nodeArray = this.props.getOptionNodes();
        for (let i = 0; i < nodeArray.length; i++) {
            const node = nodeArray[i];
            result.push(
                <li key={node.getUniqueId()} className="list-group-item">
                    <a
                        tabIndex="0"
                        onClick={() => {
                            this.model.setValue(node.getPath());
                            this.setState({
                                showModal: false
                            });
                        }}
                    >
                        {node.getNodeLabel()}
                    </a>
                </li>
            );
        }
        return result;
    }

    renderContent() {
        const model = this.model;

        return [
            <div key="container" className="reference-container">
                {this.model.getReferencedNode() &&
                <NodeLabelComponent model={this.model.getReferencedNode()}/>
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
