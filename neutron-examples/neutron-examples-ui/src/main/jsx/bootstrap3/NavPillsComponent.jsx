import React from 'react';
import PropTypes from 'prop-types';
import NodeLabelComponent from '../bootstrap3/NodeLabelComponent';


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
                            <NodeLabelComponent model={item} />
                        </a>
                        {
                            item.getShowErrorList &&
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
    selectedItem: PropTypes.object.isRequired,
    items: PropTypes.array.isRequired,
    onSelect: PropTypes.func.isRequired,
    onClose: PropTypes.func
};

NavPillsComponent.defaultProps = {
    onClose: () => {
    }
};

