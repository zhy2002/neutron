import React from 'react';
import PropTypes from 'prop-types';
import NodeLabelComponent from '../bootstrap3/NodeLabelComponent';


export default function NavPillsComponent(props) {
    const selectedItem = props.selectedItem;

    return (
        <ul className="nav nav-pills small nav-pills-component">
            {
                props.items.map(
                    (item) => {
                        const itemClass = item === selectedItem ? 'active' : '';

                        return (
                            <li key={item.getUniqueId()} className={itemClass}>
                                <a tabIndex="0" onClick={() => props.onSelect(item)}>
                                    <NodeLabelComponent model={item} />
                                    {
                                        item.getShowErrorList &&
                                        <button
                                            className="close-icon"
                                            onClick={(e) => {
                                                props.onClose(item);
                                                e.preventDefault();
                                                e.stopPropagation();
                                            }}
                                        >
                                            <span className="glyphicon glyphicon-remove-sign"/>
                                        </button>
                                    }
                                </a>
                            </li>
                        );
                    }
                )
            }
        </ul>
    );
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
