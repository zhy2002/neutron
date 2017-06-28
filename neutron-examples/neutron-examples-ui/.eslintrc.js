var OFF = 0, WARN = 1, ERROR = 2;

module.exports = {
    "parser": "babel-eslint",
    "failOnWarning": false,
    "failOnError": false,
    "extends": "airbnb",
    "env": {
        "browser": true,
        "jquery": true
    },
    "globals": {
        "GWT": true
    },
    "plugins": [
        "react",
        "jsx-a11y",
        "import"
    ],
    "rules": {
        "linebreak-style": [
            "error",
            "windows"
        ],
        "eol-last": [
            OFF
        ],
        "class-methods-use-this": [
            OFF
        ],
        "react/prefer-stateless-function": [
            OFF
        ],
        "react/no-find-dom-node": [
            OFF
        ],
        "no-mixed-operators": [
            OFF
        ],
        "no-console":[
            OFF
        ],
        "dot-notation":[
            OFF
        ],
        "indent": [
            ERROR,
            4
        ],
        "no-alert": [
            OFF
        ],
        "max-len": [
            ERROR,
            120
        ],
        "react/jsx-indent-props": [
            ERROR,
            4
        ],
        "react/jsx-indent": [
            OFF
        ],
        "no-param-reassign": [
            ERROR,
            {"props": false}
        ],
        "no-restricted-syntax": [
            OFF
        ],
        "arrow-body-style": [
            OFF
        ],
        "react/no-unused-prop-types": [
            OFF
        ],
        "react/prop-types": [
            OFF
        ],
        "curly": [
            OFF
        ],
        "no-use-before-define": [
            OFF
        ],
        "comma-dangle": [
            OFF
        ],
        "react/forbid-prop-types": [
            OFF
        ],
        "react/jsx-space-before-closing": [
            OFF
        ],
        "react/jsx-tag-spacing": [
            OFF
        ],
        "object-curly-spacing": [
            OFF
        ],
        "spaced-comment": [
            OFF
        ],
        "no-plusplus": [
            OFF
        ],
        "jsx-a11y/label-has-for": [
            OFF
        ]
    }
};