import React from 'react';
import PropTypes from 'prop-types';
import axios from 'axios';
import debounce from 'throttle-debounce/debounce';
import InputComponent from './InputComponent';
import AutoCloseContainer from '../neutron/AutoCloseContainer';

const baseUrl = 'http://localhost:9200';
const reservedChars = '+-=&|><!(){}[]^"~*?:\\/';

/**
 * Convert keyword to elastic search literal.
 */
function encodeKeyword(key) {
    let result = '';
    for (let i = 0; i < key.length; i++) {
        const char = key[i];
        if (reservedChars.indexOf(char) >= 0) {
            result += '\\';
        }
        result += char;
    }

    result = result.trim();
    result = result.replace(/\s+/, ' AND ');
    return encodeURIComponent(`${result}`);
}

export default class TextInputComponent extends InputComponent {

    constructor(props) {
        super(props);

        this.state.showOptions = false;
        this.state.activeOptionIndex = -1;
        this.state.lastSearchKey = null;

        this.updateValue = (event) => {
            this.ensureDebouncingMode();
            this.model.setValue(event.target.value);
            this.flush();
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
            if (!this.shouldSendRequest(key)) {
                this.setState({
                    showOptions: true
                });
                return;
            }

            const url = baseUrl + this.props.searchPath.replace('{key}', `*${encodeKeyword(key)}*`);
            axios.get(url).then(
                (response) => {
                    const result = response.data.hits.hits;
                    const list = new GWT.StringOptionArrayBuilder();
                    result.forEach((item) => {
                        const source = item['_source'];
                        list.addItem(source.value, source.text);
                    });
                    this.model.setOptions(list.toArray());
                    this.setState({
                        showOptions: true,
                        activeOptionIndex: -1,
                        lastSearchKey: key
                    });
                }
            );
        };

        this.debouncedSearch = debounce(350, this.search);

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

        this.identifierClass = 'text-input-component';
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
                                            this.flushNow();
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
    searchPath: PropTypes.string
};

TextInputComponent.defaultProps = {
    searchPath: null
};
