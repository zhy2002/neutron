var OFF = 0, WARN = 1, ERROR = 2;

module.exports = {
    "parser": "babel-eslint",
    "failOnWarning": false,
    "failOnError": false,
    "extends": "airbnb",
    "env": {
        "browser": true
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
            ERROR,
            {"ignorePureComponents": true}
        ],
        "indent": [
            ERROR,
            4
        ],
        "react/jsx-indent": [
            WARN,
            4
        ],
        "react/jsx-indent-props": [
            ERROR,
            4
        ],
        "arrow-parens": [
            WARN
        ],
        "no-useless-constructor": [
            WARN
        ],
        "eol-last": [
            WARN
        ],
        "no-param-reassign": [
            WARN
        ],
        "no-restricted-syntax": [
            WARN
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
        "max-len": [
            ERROR,
            120
        ],
        "object-curly-spacing": [
            OFF
        ],
        "spaced-comment": [
            OFF
        ],
        "no-plusplus": [
            OFF
        ]
    }
};