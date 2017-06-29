import React from 'react';
import PropTypes from 'prop-types';
import axios from 'axios';
import debounce from 'throttle-debounce/debounce';
import InputComponent from './InputComponent';
import AutoCloseContainer from '../neutron/AutoCloseContainer';
import CommonUtil from '../neutron/CommonUtil';


const baseUrl = 'http://localhost:9200';

export default class TextInputComponent extends InputComponent {

    constructor(props) {
        super(props);

        this.state.showOptions = false;
        this.state.activeOptionIndex = -1;
        this.state.lastSearchKey = null;

        this.updateValue = (event) => {
            const context = this.model.getContext();
            context.enterDebouncingMode();
            this.model.setValue(event.target.value);
            context.debouncedExitDebouncingMode();
            if (this.props.searchPath) {
                this.debouncedSearch();
            }
        };

        this.acceptValue = () => {
            this.model.dispatchAcceptValueAction();
        };

        this.shouldSendRequest = (key) => {
            const lastKey = this.state.lastSearchKey;
            if (key === lastKey)
                return false;

            const options = this.state.options;
            if (lastKey !== null && key.indexOf(lastKey) >= 0) {
                if (!options || options.length === 0)
                    return false;

                if (options.length === 1 && options[0].getValue() === lastKey) {
                    return false;
                }
            }

            return true;
        };

        this.search = () => {
            const key = this.state.value;
            const searchAdaptor = this.props.searchAdaptor;
            if (!searchAdaptor.shouldSearch(key)) {
                this.setState({
                    showOptions: false
                });
                return;
            }

            if (!this.shouldSendRequest(key)) {
                this.setState({
                    showOptions: true
                });
                return;
            }

            const encodedKey = searchAdaptor.encodeKeyword(key);
            const url = baseUrl + this.props.searchPath.replace('{key}', `${encodedKey}`);
            axios.get(url).then(
                (response) => {
                    const options = searchAdaptor.buildOptions(key, response);
                    this.model.setOptions(options);
                    this.setState({
                        showOptions: true,
                        activeOptionIndex: -1,
                        lastSearchKey: key
                    });
                }
            );
        };

        this.debouncedSearch = debounce(400, this.search);

        this.handleFocus = () => {
            this.search();
        };

        this.handleKeyDown = (e) => {
            const keyCode = e.keyCode;
            if (keyCode === 27) {
                this.handleHide();
                return;
            }

            const options = this.state.options;
            if (this.state.showOptions && options && options.length > 0) {
                let index = this.state.activeOptionIndex;
                if (keyCode === 39 || keyCode === 40 || keyCode === 9 && !e.shiftKey) {
                    index = (index + 1) % options.length;
                    this.setState({activeOptionIndex: index});
                    e.preventDefault();
                    e.stopPropagation();
                    return;
                }

                if (keyCode === 37 || keyCode === 38 || keyCode === 9 && e.shiftKey) {
                    if (index === -1) {
                        index = options.length - 1;
                    } else {
                        index--;
                        if (index < 0) {
                            index += options.length;
                        }
                    }
                    this.setState({activeOptionIndex: index});
                    e.preventDefault();
                    e.stopPropagation();
                    return;
                }

                if (keyCode === 32) {
                    if (index >= 0) {
                        this.model.setValue(options[index].getValue());
                        e.preventDefault();
                        e.stopPropagation();
                        this.handleHide();
                    }
                }
            }
        };

        this.handleHide = (eventTarget) => {
            if (eventTarget && eventTarget.id === this.model.getUniqueId()) {
                return;
            }

            this.setState({
                showOptions: false,
                activeOptionIndex: -1
            });
        };
    }

    extractNewState() {
        const newState = super.extractNewState();
        if (this.model.getOptions) {
            newState.options = this.model.getOptions();
        }
        return newState;
    }

    shouldRenderOptions() {
        const options = this.state.options;
        if (!options || !this.state.showOptions)
            return false;

        if (options.length === 1 && options[0].getValue() === this.state.value) {
            return false;
        }

        return true;
    }

    renderOptions() {
        if (!this.shouldRenderOptions()) {
            return null;
        }

        const activeIndex = this.state.activeOptionIndex;
        return (
            <AutoCloseContainer key="options" className="input-options-panel" onHide={this.handleHide}>
                <div className="list-group">
                    {
                        this.state.options.map(
                            (item, index) =>
                                <a
                                    key={item.getValue()}
                                    className={`list-group-item${activeIndex === index ? ' active' : ''}`}
                                    tabIndex={0}
                                    onClick={
                                        () => {
                                            this.model.setValue(item.getValue());
                                            this.model.getContext().exitDebouncingMode();
                                            this.handleHide();
                                        }
                                    }
                                >
                                    {item.getText()}
                                </a>
                        )
                    }
                </div>
            </AutoCloseContainer>
        );
    }

    renderContent() {
        const model = this.model;
        const conditionalProps = {};
        if (this.props.hideLabel) {
            conditionalProps.placeholder = this.state.label;
        }
        if (this.props.searchPath) {
            conditionalProps.onKeyDown = this.handleKeyDown;
            conditionalProps.onFocus = this.handleFocus;
        }

        return [
            <input
                type="text"
                className="form-control"
                id={model.getUniqueId()}
                key="input"
                value={this.state.value}
                onChange={this.updateValue}
                onBlur={this.acceptValue}
                disabled={this.state.disabled}
                readOnly={this.state.readonly}
                {...conditionalProps}
            />,
            this.renderOptions()
        ];
    }
}

TextInputComponent.propTypes = {
    searchPath: PropTypes.string,
    searchAdaptor: PropTypes.object
};

TextInputComponent.defaultProps = {
    searchPath: null,
    searchAdaptor: CommonUtil.defaultSearchAdaptor()
};
