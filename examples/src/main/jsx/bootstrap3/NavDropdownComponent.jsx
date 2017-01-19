import React from 'react';

export default class NavDropdownComponent extends React.Component {

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
    }

    render() {
        return (
            <li className={`dropdown${this.state.open ? ' open' : ''}`}>
                <a tabIndex="0" className="dropdown-toggle" onClick={this.toggle} onBlur={this.toggle}>
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

NavDropdownComponent.propTypes = {
    children: React.PropTypes.any.isRequired
};
