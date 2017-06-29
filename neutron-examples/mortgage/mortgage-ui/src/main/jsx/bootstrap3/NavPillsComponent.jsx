import React from 'react';
import PropTypes from 'prop-types';
import NodeLabelComponent from '../neutron/NodeLabelComponent';
import CloseIconComponent from '../bootstrap3/CloseIconComponent';


export default function NavPillsComponent(props) {
    const selectedItem = props.selectedItem;

    return (
        <ul className={`nav nav-pills${props.large ? '' : ' small'} nav-pills-component`}>
            {
                props.items.map(
                    (item) => {
                        const itemClass = item === selectedItem ? 'active' : '';

                        return (
                            <li key={item.getUniqueId()} className={itemClass}>
                                <a tabIndex="0" onClick={() => props.onSelect(item)}>
                                    <NodeLabelComponent model={item}/>
                                    {
                                        item.getShowErrorList &&
                                        <CloseIconComponent
                                            onClose={(e) => {
                                                props.onClose(item);
                                                e.preventDefault();
                                                e.stopPropagation();
                                            }}
                                        />
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
    onClose: PropTypes.func,
    large: PropTypes.bool
};

NavPillsComponent.defaultProps = {
    onClose: () => {
    },
    large: false
};
