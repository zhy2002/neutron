import React from "react";
import HeaderComponent from "./HeaderComponent";
import MainComponent from "./MainComponent";


export default class LodgementComponent extends React.PureComponent {

    constructor(props) {
        super(props);
    }

    render() {
        console.log("Rendering LodgementComponent...");
        return (
            <div>
                <HeaderComponent />
                <MainComponent />
            </div>
        );
    }
}