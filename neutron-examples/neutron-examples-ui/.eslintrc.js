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
        "react/prefer-stateless-function": [
            OFF
        ],
        "no-console":[
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
        "react/no-unused-prop-types": [
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