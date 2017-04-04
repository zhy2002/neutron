import React from 'react';
import ListNeutronComponent from '../../../bootstrap3/ListNeutronComponent';
import PanelComponent from '../../../bootstrap3/PanelComponent';
import NodeValueComponent from '../../../bootstrap3/NodeValueComponent';
import ModalDialogComponent from '../../../bootstrap3/ModalDialogComponent';
import MainContentComponent from '../common/MainContentComponent';
import ProductFeeEditorComponent from './ProductFeeEditorComponent';

export default class ProductFeeListComponent extends ListNeutronComponent {

    constructor(props) {
        super(props);

        this.state.editModel = null;

        this.addItem = () => {
            const item = this.model.createItem();
            item.isFresh = true;
            this.setState({
                editModel: item
            });
        };

        this.deleteEditModel = () => {
            if (this.state.editModel) {
                this.model.removeItem(this.state.editModel);
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

    renderItems() {
        const result = [];
        result.push(
            <div className="row">
                <div className="col-md-1">#</div>
                <div className="col-md-2">Type</div>
                <div className="col-md-2">Amount</div>
                <div className="col-md-5">Description</div>
                <div className="col-md-2">Pay fees from</div>
            </div>
        );

        const items = this.model.getChildren();
        items.forEach((item, index) => {
            if (!item.isFresh) {
                result.push(
                    <a
                        key={item.getUniqueId()}
                        className="row"
                        tabIndex="0"
                        onClick={() => this.selectEditModel(item)}
                    >
                        <div className="col-md-1">{index + 1}</div>
                        <div className="col-md-2">
                            <NodeValueComponent model={item.getFeeTypeNode()}/>
                        </div>
                        <div className="col-md-2">
                            <NodeValueComponent model={item.getFeeAmountNode()}/>
                        </div>
                        <div className="col-md-5">
                            <NodeValueComponent model={item.getFeeDescriptionNode()}/>
                        </div>
                        <div className="col-md-2">
                            <NodeValueComponent model={item.getFeePayFromNode()}/>
                        </div>
                    </a>
                );
            }
        });
        return result;
    }

    render() {
        return (
            <MainContentComponent className="product-fee-list-component">
                <PanelComponent title="Fees" onAdd={this.addItem} className="panel-primary">
                    {this.renderItems()}
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
                        <div className="text-center col-sm-offset-2 col-sm-8">
                            <button className="btn btn-sm btn-primary" onClick={this.saveEditModel}>Ok</button>
                            &nbsp;
                            <button
                                className="btn btn-sm btn-warning"
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
