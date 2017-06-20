import React from 'react';
import PropTypes from 'prop-types';

export default class PanelComponent extends React.PureComponent {

    constructor(props) {
        super(props);

        this.expanded = true;
        this.state = {
            expanded: this.expanded
        };

        this.toggleExpand = () => {
            this.expanded = !this.expanded;
            this.setState(
                {expanded: this.expanded}
            );
        };
    }

    renderArrow() {
        return (
            <span
                className={`glyphicon ${this.state.expanded ? 'glyphicon-chevron-down' : 'glyphicon-chevron-right'}`}
            />
        );
    }

    render() {
        const props = this.props;
        return (
            <div className={`panel ${props.className} panel-component`}>
                <div className="panel-heading clearfix">
                    {
                        props.onAdd &&
                        <a tabIndex="0" onClick={props.onAdd}>
                            <span className="glyphicon glyphicon-plus-sign"/>
                            &nbsp;
                        </a>
                    }
                    {
                        props.expandable &&
                        <a tabIndex="0" onClick={this.toggleExpand}>
                            {this.renderArrow()}
                            &nbsp;
                        </a>
                    }
                    <h3 className="panel-title small">{props.title} </h3>
                </div>
                <div className={`panel-body ${props.expandable && !this.state.expanded ? 'hide' : ''}`}>
                    {props.children}
                </div>
            </div>
        );
    }
}

PanelComponent.propTypes = {
    title: PropTypes.string.isRequired,
    children: PropTypes.any.isRequired,
    className: PropTypes.string,
    onAdd: PropTypes.func,
    expandable: PropTypes.bool
};

PanelComponent.defaultProps = {
    className: 'panel-default',
    onAdd: null,
    expandable: false
};
