import React from "react";
import HeaderComponent from "./HeaderComponent.jsx";
import MainComponent from "./MainComponent.jsx";


export default class LodgementComponent extends React.Component {

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