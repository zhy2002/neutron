import React from 'react';

export default class AppManagerComponent extends React.PureComponent {

    constructor(props) {
        super(props);

        this.renderCount = 0;
    }

    render() {
        this.renderCount++;
        return (
            <div>rendered {this.renderCount} time(s)!</div>
        );
    }
}
