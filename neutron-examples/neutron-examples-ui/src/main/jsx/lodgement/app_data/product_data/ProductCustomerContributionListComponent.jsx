import React from 'react';
import NeutronHoc from '../../../neutron/NeutronHoc';
import PanelComponent from '../../../bootstrap3/PanelComponent';
import NodeValueComponent from '../../../bootstrap3/NodeValueComponent';
import ModalDialogComponent from '../../../bootstrap3/ModalDialogComponent';
import MainContentComponent from '../common/MainContentComponent';
import ProductCustomerContributionEditorComponent from './ProductCustomerContributionEditorComponent';

class ProductCustomerContributionListComponent extends React.PureComponent {

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
                <PanelComponent title="Contributions" onAdd={this.addItem} className="panel-primary">
                    {model.getItemCount() === 0 ?
                        <div className="alert alert-info">Click &apos;+&apos; to add contribution fees.</div> :
                        <table className="table table-striped table-hover table-bordered">
                            <thead>
                            <tr>
                                <th width="15%">#</th>
                                <th width="20%">Type</th>
                                <th width="20%">Amount</th>
                                <th width="30%">Description</th>
                                <th width="15%"/>
                            </tr>
                            </thead>
                            <tbody>
                            {
                                model.getChildren().filter(item => !item.isFresh).map((item, index) =>
                                    <tr key={item.getUniqueId()}>
                                        <td width="15%">{index + 1}</td>
                                        <td width="20%">
                                            <NodeValueComponent model={item.getContributionTypeNode()}/>
                                        </td>
                                        <td width="20%">
                                            <NodeValueComponent model={item.getContributionAmountNode()}/>
                                        </td>
                                        <td width="30%">
                                            <NodeValueComponent model={item.getContributionDescriptionNode()}/>
                                        </td>
                                        <td width="15%">
                                            <a
                                                tabIndex="0"
                                                onClick={() => this.selectEditModel(item)}
                                            >
                                                Edit
                                            </a>
                                        </td>
                                    </tr>
                                )
                            }
                            </tbody>
                        </table>
                    }
                </PanelComponent>
                <ModalDialogComponent
                    title="Edit Contribution"
                    show={this.state.editModel !== null}
                >
                    {
                        this.state.editModel &&
                        <ProductCustomerContributionEditorComponent model={this.state.editModel}/>
                    }
                    <div className="row">
                        <div className="col-sm-12 modal-buttons">
                            <button className="btn btn-sm btn-primary" onClick={this.saveEditModel}>Ok</button>
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

ProductCustomerContributionListComponent.propTypes = NeutronHoc.suppressMissingPropTypes();
export default NeutronHoc(
    ProductCustomerContributionListComponent
);
