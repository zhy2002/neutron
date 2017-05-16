import React from 'react';
import PropTypes from 'prop-types';
import InputComponent from './InputComponent';
import ModalDialogComponent from './ModalDialogComponent';
import NodeLabelComponent from './NodeLabelComponent';
import ErrorMessageComponent from './ErrorMessageComponent';


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

    render() {
        const model = this.model;

        return (
            <div className={super.renderContainerClass('reference-input-component')}>
                {!this.props.hideLabel &&
                <label htmlFor={model.getUniqueId()}>{this.state.label}</label>
                }
                <div className="reference-container">
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
                </div>
                <ErrorMessageComponent message={this.state.errorMessage} />
                <ModalDialogComponent
                    show={this.state.showModal}
                    title={this.label}
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
            </div>
        );
    }
}

ReferenceInputComponent.propTypes = {
    getOptionNodes: PropTypes.func.isRequired
};
