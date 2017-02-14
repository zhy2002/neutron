import React from 'react';

export default class DummyNavDropdownComponent extends React.PureComponent {

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
    }

    render() {
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
}

DummyNavDropdownComponent.propTypes = {
    model: React.PropTypes.object.isRequired,
    onSelect: React.PropTypes.func.isRequired,
    children: React.PropTypes.any.isRequired
};
