import React from 'react';


export default class NavPillsComponent extends React.PureComponent {

    render() {
        const listItems = [];
        const selectedIndex = this.props.selectedIndex;

        this.props.items.forEach(
            (item, index) => {
                const itemClass = index === selectedIndex ? 'active' : '';
                const key = index + 1;
                listItems.push(
                    <li key={key} className={itemClass}>
                        <a tabIndex="0" onClick={() => this.props.onSelect(index)}>
                            {item.name}
                        </a>
                        {
                            index > 0 &&
                            <button
                                className="close-icon"
                                onClick={() => {
                                    this.props.onClose(index);
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

        return (
            <ul className="nav nav-pills small">
                {listItems}
            </ul>
        );
    }
}

NavPillsComponent.propTypes = {
    selectedIndex: React.PropTypes.number.isRequired,
    items: React.PropTypes.array.isRequired,
    onSelect: React.PropTypes.func.isRequired,
    onClose: React.PropTypes.func.isRequired
};
