import React from 'react';


export default class NavPillsComponent extends React.PureComponent {

    renderPills() {
        const listItems = [];
        const selectedItem = this.props.selectedItem;
        this.props.items.forEach(
            (item) => {
                const itemClass = item === selectedItem ? 'active' : '';
                listItems.push(
                    <li key={item.getUniqueId()} className={itemClass}>
                        <a tabIndex="0" onClick={() => this.props.onSelect(item)}>
                            {item.getNodeLabel()}
                        </a>
                        {
                            item.getSimpleClassName() === 'ApplicationNode' &&
                            <button
                                className="close-icon"
                                onClick={() => {
                                    this.props.onClose(item);
                                    return false;
                                }}
                            >
                                <span className="glyphicon glyphicon-remove-sign"/>
                            </button>
                        }
                    </li>
                );
            }
        );
        return listItems;
    }

    render() {
        return (
            <ul className="nav nav-pills small nav-pills-component">
                {this.renderPills()}
            </ul>
        );
    }
}

NavPillsComponent.propTypes = {
    selectedItem: React.PropTypes.object.isRequired,
    items: React.PropTypes.array.isRequired,
    onSelect: React.PropTypes.func.isRequired,
    onClose: React.PropTypes.func
};

NavPillsComponent.defaultProps = {
    onClose: () => {
    }
};

