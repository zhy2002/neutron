import React from 'react';
import PropTypes from 'prop-types';
import axios from 'axios';
import debounce from 'throttle-debounce/debounce';
import InputComponent from './InputComponent';


export default class TextInputComponent extends InputComponent {

    constructor(props) {
        super(props);

        this.state.showOptions = false;

        this.updateValue = (event) => {
            this.ensureDebouncingMode();
            this.model.setValue(event.target.value);
            this.flush();
        };

        this.fetchSearchList = debounce(300, () => {
            let url = this.props.searchUrl;
            if (!url)
                return;
            url = url.replace('{key}', `*${this.state.value}*`);
            axios.get(url).then(
                (response) => {
                    const result = response.data.hits.hits;
                    const list = new GWT.StringOptionArrayBuilder();
                    result.forEach((item) => {
                        const source = item['_source'];
                        list.addItem(source.value, source.text);
                    });
                    this.model.setOptions(list.toArray());
                }
            );
        });

        this.showOptions = () => {
            this.setState({showOptions: true});
            if (this.model.getOptions) {
                const options = this.model.getOptions();
                if (options === null) {
                    this.fetchSearchList();
                }
            }
        };

        this.hideOptions = debounce(250, () => {
            this.setState({showOptions: false});
        });
    }

    extractNewState() {
        const newState = super.extractNewState();
        if (this.model.getOptions) {
            newState.options = this.model.getOptions();
        }
        return newState;
    }

    renderOptions() {
        const options = this.state.options;
        if (!options || !this.state.showOptions)
            return null;

        const result = [];
        let index = 0;
        options.forEach((item) => {
            result.push(
                <a
                    className="list-group-item"
                    tabIndex={0}
                    onClick={
                        () => {
                            this.model.setValue(item.getValue());
                            this.flushNow();
                            this.hideOptions();
                            this.fetchSearchList();
                        }
                    }
                    key={index++}
                >
                    {item.getText()}
                </a>
            );
        });
        return (
            <div className="input-options-panel">
                <div className="list-group">
                    {result}
                </div>
            </div>
        );
    }

    render() {
        const model = this.model;
        const conditionalProps = {};
        if (this.props.hideLabel) {
            conditionalProps.placeholder = this.label;
        }
        if (this.props.searchUrl) {
            conditionalProps.onKeyDown = this.fetchSearchList;
            conditionalProps.onFocus = this.showOptions;
            conditionalProps.onBlur = this.hideOptions;
        }
        return (
            <div className={super.renderContainerClass('text-input-component')}>
                {!this.props.hideLabel &&
                <label htmlFor={model.getUniqueId()}>{this.state.label}</label>
                }
                <input
                    type="text"
                    className="form-control"
                    id={model.getUniqueId()}
                    value={this.state.value}
                    onChange={this.updateValue}
                    disabled={this.state.disabled}
                    readOnly={this.state.readonly}
                    {...conditionalProps}
                />
                {this.renderOptions()}
                {this.state.errorMessage &&
                <div className="error-message text-warning">{this.state.errorMessage}</div>
                }
            </div>
        );
    }
}

TextInputComponent.propTypes = {
    searchUrl: PropTypes.string
};

TextInputComponent.defaultProps = {
    searchUrl: null
};

