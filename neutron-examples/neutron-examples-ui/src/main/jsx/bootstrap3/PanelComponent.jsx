import React from 'react';

export default class PanelComponent extends React.PureComponent {

    constructor(props) {
        super(props);

        this.state = {};
    }

    render() {
        return (
            <div className={`panel ${this.props.className} panel-component`}>
                <div className="panel-heading clearfix">
                    <h3 className="panel-title small">{this.props.title} </h3>
                    {this.props.onAdd &&
                    <a tabIndex="0" onClick={this.props.onAdd}>
                        <span className="glyphicon glyphicon-plus-sign"/>
                    </a>
                    }
                </div>
                <div className="panel-body">
                    {this.props.children}
                </div>
            </div>
        );
    }
}

PanelComponent.propTypes = {
    title: React.PropTypes.string.isRequired,
    children: React.PropTypes.any.isRequired,
    className: React.PropTypes.string,
    onAdd: React.PropTypes.func
};

PanelComponent.defaultProps = {
    className: 'panel-default',
    onAdd: null
};
