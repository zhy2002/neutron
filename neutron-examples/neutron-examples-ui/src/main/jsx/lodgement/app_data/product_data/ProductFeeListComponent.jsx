import React from 'react';
import NeutronHoc from '../../../neutron/NeutronHoc';
import PanelComponent from '../../../bootstrap3/PanelComponent';
import NodeValueComponent from '../../../bootstrap3/NodeValueComponent';
import ModalDialogComponent from '../../../bootstrap3/ModalDialogComponent';
import MainContentComponent from '../common/MainContentComponent';
import ProductFeeEditorComponent from './ProductFeeEditorComponent';

class ProductFeeListComponent extends React.PureComponent {

    constructor(props) {
        super(props);

        this.state = {
            editModel: null
        };

        this.addItem = () => {
            const item = this.props.model.createItem();
            item.isFresh = true;
            this.setState({
                editModel: item
            });
        };

        this.deleteEditModel = () => {
            if (this.state.editModel) {
                this.props.model.removeItem(this.state.editModel);
                this.setState({
                    editModel: null
                });
            }
        };

        this.saveEditModel = () => {
            if (this.state.editModel) {
                this.state.editModel.refresh();
                if (!this.state.editModel.hasError()) {
                    this.state.editModel.isFresh = false;
                    this.setState({
                        editModel: null
                    });
                }
            }
        };

        this.selectEditModel = (model) => {
            this.setState({
                editModel: model
            });
        };
    }

    render() {
        const model = this.props.model;

        return (
            <MainContentComponent className={this.props.componentClass}>
                <PanelComponent title="Fees" onAdd={this.addItem} className="panel-primary">
                    {model.getItemCount() === 0 ?
                        <div className="alert alert-info">Click &apos;+&apos; to add fees.</div> :
                        <table className="table table-striped table-hover table-bordered">
                            <thead>
                            <tr>
                                <th width="15%">#</th>
                                <th width="20%">Type</th>
                                <th width="15%">Amount</th>
                                <th width="15%">Pay fees from</th>
                                <th width="25%">Description</th>
                                <th width="10%"/>
                            </tr>
                            </thead>
                            <tbody>
                            {
                                model.getChildren().filter(item => !item.isFresh).map((item, index) =>
                                    <tr key={item.getUniqueId()}>
                                        <th width="15%">{index + 1}</th>
                                        <th width="20%">
                                            <NodeValueComponent model={item.getFeeTypeNode()}/>
                                        </th>
                                        <th width="15%">
                                            <NodeValueComponent model={item.getFeeAmountNode()}/>
                                        </th>
                                        <th width="15%">
                                            <NodeValueComponent model={item.getFeePayFromNode()}/>
                                        </th>
                                        <td width="25%">
                                            <NodeValueComponent model={item.getFeeDescriptionNode()}/>
                                        </td>
                                        <th width="10%">
                                            <a
                                                tabIndex="0"
                                                onClick={() => this.selectEditModel(item)}
                                            >
                                                Edit
                                            </a>
                                        </th>
                                    </tr>
                                )
                            }
                            </tbody>
                        </table>
                    }

                </PanelComponent>
                <ModalDialogComponent
                    title="Edit Fee"
                    show={this.state.editModel !== null}
                >
                    {
                        this.state.editModel &&
                        <ProductFeeEditorComponent model={this.state.editModel}/>
                    }
                    <div className="row">
                        <div className="col-sm-12 modal-buttons">
                            <button className="btn btn-sm btn-primary" onClick={this.saveEditModel}>Ok</button>
                            <button
                                className="btn btn-sm btn-sm btn-warning"
                                onClick={this.deleteEditModel}
                            >
                                Delete
                            </button>
                        </div>
                    </div>
                </ModalDialogComponent>
            </MainContentComponent>
        );
    }
}

export default NeutronHoc(ProductFeeListComponent);
