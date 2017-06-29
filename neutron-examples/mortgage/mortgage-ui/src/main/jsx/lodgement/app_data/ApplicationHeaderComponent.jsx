import React from 'react';
import PropTypes from 'prop-types';
import ResizeAware from 'react-resize-aware';
import ApplicationNavComponent from './ApplicationNavComponent';
import ApplicationTabsComponent from './ApplicationTabsComponent';


export default class ApplicationHeaderComponent extends React.PureComponent {

    constructor(props) {
        super(props);

        this.handleResize = ({height}) => {
            this.props.onHeightChanged(height);
        };
    }

    render() {
        return (
            <ResizeAware
                style={{position: 'relative'}}
                onlyEvent
                onResize={this.handleResize}
            >
                <ApplicationNavComponent model={this.props.applicationNode}/>
                <ApplicationTabsComponent model={this.props.contentNode}/>
            </ResizeAware>
        );
    }
}

ApplicationHeaderComponent.propTypes = {
    applicationNode: PropTypes.object.isRequired,
    contentNode: PropTypes.object.isRequired,
    onHeightChanged: PropTypes.func.isRequired
};
