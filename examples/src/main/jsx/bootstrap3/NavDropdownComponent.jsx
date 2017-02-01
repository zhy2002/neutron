import React from 'react';
import NodeLabelComponent from './NodeLabelComponent';

export default class NavDropdownComponent extends React.PureComponent {

    constructor(props) {
        super(props);

        this.state = {
            open: false
        };

        this.toggle = () => {
            this.setState(
                state => ({open: !state.open})
            );
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
            const newItem = this.props.model.createItem();
            this.selectItem(newItem);
        };
    }

    isModelList() {
        return !!this.props.model.getItemCount;
    }

    renderItems() {
        const model = this.props.model;
        if (!this.isModelList())
            return null;

        const items = [];
        let key = 1;
        for (let i = 0; i < model.getItemCount(); i++) {
            const item = model.getItem(i);
            items.push(
                <li key={key}>
                    <a tabIndex="0" onClick={() => this.selectItem(item)}>
                        <NodeLabelComponent model={item} />
                    </a>
                </li>
            );
            key++;
        }
        items.push(<li key={key}><a tabIndex="0" onClick={this.createNewItem}>Create New</a></li>);

        return (
            <ul className="dropdown-menu">
                {items}
            </ul>
        );
    }

    renderDummy() {
        return (
            <li className={`dropdown${this.state.open ? ' open' : ''}`} onMouseLeave={this.close}>
                <a tabIndex="0" className="dropdown-toggle" onMouseEnter={this.open} onClick={this.toggle}>
                    {this.props.children} <span className="caret"/>
                </a>
                <ul className="dropdown-menu">
                    <li><a tabIndex="0">Action</a></li>
                    <li><a tabIndex="0">Another action</a></li>
                    <li><a tabIndex="0">Something else here</a></li>
                    <li role="separator" className="divider"/>
                    <li><a tabIndex="0">Separated link</a></li>
                    <li role="separator" className="divider"/>
                    <li><a tabIndex="0">One more separated link</a></li>
                </ul>
            </li>
        );
    }

    render() {
        if (!this.props.model.getName)
            return this.renderDummy();

        return (
            <li className={`dropdown${this.state.open ? ' open' : ''}`} onMouseLeave={this.close}>
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

NavDropdownComponent.propTypes = {
    model: React.PropTypes.object.isRequired,
    onSelect: React.PropTypes.func.isRequired,
    children: React.PropTypes.any.isRequired
};
