import React from 'react';
import ApplicationListComponent from './app_manager/ApplicationListComponent';

export default class AppBodyComponent extends React.PureComponent {

    render() {
        const model = this.props.items[this.props.selectedIndex];

        if (this.props.selectedIndex === 0) {
            return (
                <ApplicationListComponent model={model}/>
            );
        }

        return (
            <div>application gui</div>
        );
    }

}

AppBodyComponent.propTypes = {
    selectedIndex: React.PropTypes.number.isRequired,
    items: React.PropTypes.array.isRequired
};
