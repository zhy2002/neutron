import React from 'react';
import ReactDOM from 'react-dom';
import PropTypes from 'prop-types';
import EventService from './common/EventService';


export default class AutoCloseContainer extends React.PureComponent {

    constructor(props) {
        super(props);

        this.acceptInstance = (refInstance) => {
            this.refInstance = refInstance;
        };

        this.hideIfNecessary = (eventTarget) => {
            if (this.refInstance) {
                const domElement = ReactDOM.findDOMNode(this.refInstance);
                if (domElement) {
                    if (!domElement.contains(eventTarget)) {
                        this.props.onHide(eventTarget);
                    }
                }
            }
        };
    }

    componentDidMount() {
        EventService.subscribe('root_click', this.hideIfNecessary);
        EventService.subscribe('root_keyup', this.hideIfNecessary);
    }

    componentWillUnmount() {
        EventService.unsubscribe('root_click', this.hideIfNecessary);
        EventService.unsubscribe('root_keyup', this.hideIfNecessary);
        console.debug('un-mounting AutoCloseContainer...');
    }

    render() {
        return (
            <div className={`auto-close-container ${this.props.className}`} ref={this.acceptInstance}>
                {this.props.children}
            </div>
        );
    }
}

AutoCloseContainer.propTypes = {
    onHide: PropTypes.func.isRequired,
    className: PropTypes.string,
    children: PropTypes.any
};

AutoCloseContainer.defaultProps = {
    className: '',
    children: []
};
