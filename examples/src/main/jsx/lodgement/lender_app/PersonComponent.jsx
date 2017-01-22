import React from 'react';
import NavPillsComponent from '../../bootstrap3/NavPillsComponent';

export default class PersonComponent extends React.PureComponent {

    constructor(props) {
        super(props);

        this.state = {
            selectedIndex: 0
        };

        this.selectTab = (selectedIndex) => {
            this.setState({selectedIndex});
        };
    }

    render() {
        const tabItems = this.props.model.getChildren();

        return (
            <div className="person-component">
                <NavPillsComponent
                    items={tabItems}
                    selectedIndex={this.state.selectedIndex}
                    onSelect={this.selectTab}
                />
                <div className="person-main-content">
                    <div className="container-fluid">
                        <div className="row">
                            <div className="col-md-12">
                                This is person component<br/>
                                This is person component<br/>
                                This is person component<br/>
                                This is person component<br/>
                                This is person component<br/>
                                This is person component<br/>
                                This is person component<br/>
                                This is person component<br/>
                                This is person component<br/>
                                This is person component<br/>
                                This is person component<br/>
                                This is person component<br/>
                                This is person component<br/>
                                This is person component<br/>
                                This is person component<br/>
                                This is person component<br/>
                                This is person component<br/>
                                This is person component<br/>
                                This is person component<br/>
                                This is person component<br/>
                                This is person component<br/>
                                This is person component<br/>
                                This is person component<br/>
                                This is person component<br/>
                                This is person component<br/>
                                This is person component<br/>
                                This is person component<br/>
                                This is person component<br/>
                                This is person component<br/>
                                This is person component<br/>
                                This is person component<br/>
                                This is person component<br/>
                                This is person component<br/>
                                This is person component<br/>
                                This is person component<br/>
                                This is person component<br/>
                                This is person component<br/>
                                This is person component<br/>
                                This is person component<br/>
                                This is person component<br/>
                                This is person component<br/>
                                This is person component<br/>
                                This is person component<br/>
                                This is person component<br/>
                                This is person component<br/>
                                This is person component<br/>
                                This is person component<br/>
                                This is person component<br/>
                                This is person component<br/>
                                This is person component<br/>
                                This is person component<br/>
                                This is person component<br/>
                                This is person component<br/>
                                This is person component<br/>
                                This is person component<br/>
                                This is person component<br/>
                                This is person component<br/>
                                This is person component<br/>
                                This is person component<br/>
                                This is person component<br/>
                                This is person component<br/>
                                This is person component<br/>
                                This is person component<br/>
                                This is person component<br/>
                                This is person component<br/>
                                This is person component<br/>
                                This is person component<br/>
                                This is person component<br/>
                                This is person component<br/>
                                This is person component<br/>
                                This is person component<br/>
                                This is person component<br/>
                                This is person component<br/>
                                This is person component<br/>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        );
    }

}

PersonComponent.propTypes = {
    model: React.PropTypes.object.isRequired
};
