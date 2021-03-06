import React from 'react';
import PropTypes from 'prop-types';
import NodeLabelComponent from '../neutron/NodeLabelComponent';
import NeutronHoc from '../neutron/NeutronHoc';


class NavDropdownComponent extends React.PureComponent {

    constructor(props) {
        super(props);

        this.state = {
            open: false
        };

        this.open = () => {
            this.setState({open: true});
        };

        this.close = () => {
            this.setState({open: false});
        };

        this.selectItem = (model) => {
            if (this.state.open) {
                this.close();
            }

            this.props.onSelect(model);
        };

        this.createNewItem = () => {
            let newItem;
            if (this.props.childList !== null) {
                newItem = this.props.childList.createItem();
            } else {
                newItem = this.props.model.createItem();
            }
            this.selectItem(newItem);
        };
    }

    getClass(model, item) {
        if (model.getSelectedName) {
            if (model.getSelectedName() === item.getName())
                return 'active';
        } else if (model === this.props.childList) {
            if (this.props.model.getSelectedName() === model.getName() && model.getSelectedIndex() === item.getIndex())
                return 'active';
        } else if (model.getSelectedIndex() === item.getIndex()) {
            return 'active';
        }

        return '';
    }

    isModelList() {
        return !!this.props.model.getItemCount || !!this.props.childList;
    }

    renderItems() {
        let model = this.props.model;
        if (!this.isModelList())
            return null;

        const items = [];
        for (let i = 0; i < this.props.childItems.length; i++) {
            const item = this.props.childItems[i];
            const key = item.getUniqueId();
            items.push(
                <li key={key} className={this.getClass(model, item)}>
                    <a tabIndex="0" onClick={() => this.selectItem(item)}>
                        <NodeLabelComponent model={item}/>
                    </a>
                </li>
            );
        }
        if (this.props.childList !== null) {
            model = this.props.childList;
        }
        for (let i = 0; i < model.getItemCount(); i++) {
            const item = model.getItem(i);
            const key = item.getUniqueId();
            items.push(
                <li key={key} className={this.getClass(model, item)}>
                    <a tabIndex="0" onClick={() => this.selectItem(item)}>
                        <NodeLabelComponent model={item}/>
                    </a>
                </li>
            );
        }
        items.push(
            <li key="create">
                <a tabIndex="0" onClick={this.createNewItem}>
                    Create New
                </a>
            </li>
        );

        return (
            <ul className="dropdown-menu">
                {items}
            </ul>
        );
    }

    render() {
        const extraClass = `${this.state.open ? ' open' : ''}${this.props.selected ? ' selected' : ''}`;

        return (
            <li
                className={`nav-dropdown-component dropdown${extraClass}`}
                onMouseLeave={this.close}
            >
                <a
                    tabIndex="0"
                    className="dropdown-toggle"
                    onMouseEnter={this.open}

                    onClick={() => {
                        this.selectItem(this.props.model);
                    }}
                >
                    {this.props.children}
                    {
                        this.isModelList() &&
                        <span className="caret"/>
                    }
                </a>
                {this.renderItems()}
            </li>
        );
    }
}

export default NeutronHoc(
    NavDropdownComponent,
    undefined,
    {
        onSelect: PropTypes.func.isRequired,
        children: PropTypes.any.isRequired,
        childItems: PropTypes.array,
        childList: PropTypes.object,
        selected: PropTypes.bool
    },
    {
        childItems: [],
        childList: null,
        selected: false
    }
);
