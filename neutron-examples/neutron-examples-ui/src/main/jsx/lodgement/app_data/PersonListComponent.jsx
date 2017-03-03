import React from 'react';

export default class PersonListComponent extends React.PureComponent {

    render() {
        return (
            <div>this is PersonListComponent</div>
        );
    }

}

PersonListComponent.propTypes = {
    model: React.PropTypes.object.isRequired
};

