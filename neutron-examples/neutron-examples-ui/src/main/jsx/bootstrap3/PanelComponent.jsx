import React from 'react';
import PropTypes from 'prop-types';

export default class PanelComponent extends React.PureComponent {

    constructor(props) {
        super(props);

        this.state = {};
    }

    render() {
        return (
            <div className={`panel ${this.props.className} panel-component`}>
                <div className="panel-heading clearfix">
                    {
                        this.props.onAdd &&
                        <a tabIndex="0" onClick={this.props.onAdd}>
                            <span className="glyphicon glyphicon-plus-sign"/>
                            &nbsp;
                        </a>
                    }
                    <h3 className="panel-title small">{this.props.title} </h3>
                </div>
                <div className="panel-body">
                    {this.props.children}
                </div>
            </div>
        );
    }
}

PanelComponent.propTypes = {
    title: PropTypes.string.isRequired,
    children: PropTypes.any.isRequired,
    className: PropTypes.string,
    onAdd: PropTypes.func
};

PanelComponent.defaultProps = {
    className: 'panel-default',
    onAdd: null
};
