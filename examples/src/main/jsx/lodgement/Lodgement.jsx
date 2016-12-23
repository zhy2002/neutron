import React from "react";
import AppBar from "material-ui/AppBar";
import {Tabs, Tab} from 'material-ui/Tabs';

export default class LodgementComponent extends React.Component {

    constructor(props) {
        super(props);
    }

    render() {
        return (
            <div>
                <AppBar
                    title="Lodgement Test"
                    iconClassNameRight="muidocs-icon-navigation-expand-more"
                />

                <div className="">
                    <br/>
                </div>
                <Tabs>
                    <Tab label="TAB A">
                        <div>
                            <h2>Controllable Tab A</h2>
                            <p>
                                Tabs are also controllable if you want to programmatically pass them their values.
                                This allows for more functionality in Tabs such as not
                                having any Tab selected or assigning them different values.
                            </p>
                        </div>
                    </Tab>
                    <Tab label="TAB B">
                        <div>
                            <h2>Controllable Tab B</h2>
                            <p>
                                This is another example of a controllable tab. Remember, if you
                                use controllable Tabs, you need to give all of your tabs values or else
                                you wont be able to select them.
                            </p>
                        </div>
                    </Tab>
                    <Tab label="TAB C">
                        <div>
                            <h2>Controllable Tab B</h2>
                            <p>
                                This is another example of a controllable tab. Remember, if you
                                use controllable Tabs, you need to give all of your tabs values or else
                                you wont be able to select them.
                            </p>
                        </div>
                    </Tab>
                    <Tab label="TAB D">
                        <div>
                            <h2>Controllable Tab B</h2>
                            <p>
                                This is another example of a controllable tab. Remember, if you
                                use controllable Tabs, you need to give all of your tabs values or else
                                you wont be able to select them.
                            </p>
                        </div>
                    </Tab>

                </Tabs>
            </div>
        );
    }
}