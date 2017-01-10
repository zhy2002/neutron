import React from "react";


export default class HeaderComponent extends React.PureComponent {

    constructor(props) {
        super(props);
    }

    render() {
        return (
            <div className="top-bar">
                <div className="top-bar-left">
                    <h3 className="text-primary">Some Logo</h3>
                </div>
            </div>
        );
    }
}