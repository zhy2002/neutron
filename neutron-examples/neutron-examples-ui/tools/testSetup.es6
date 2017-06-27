// This assures the .babelrc dev config (which includes
// hot module reloading code) doesn't apply for tests.
process.env.NODE_ENV = 'test';

// Disable webpack-specific features for tests since
// Mocha doesn't know what to do with them.
require.extensions['.css'] = function () {
    return null;
};
require.extensions['.png'] = function () {
    return null;
};
require.extensions['.jpg'] = function () {
    return null;
};

// https://github.com/airbnb/enzyme/blob/master/docs/guides/jsdom.md
require('babel-register')();

const {JSDOM} = require('jsdom');
const jsdom = new JSDOM('<!doctype html><html><body></body></html>');
const {window} = jsdom;
global.window = window;
global.document = window.document;
global.navigator = {
    userAgent: 'node.js'
};
copyProps(window, global);

function copyProps(src, target) {
    const props = Object.getOwnPropertyNames(src)
        .filter(prop => typeof target[prop] === 'undefined')
        .map(prop => Object.getOwnPropertyDescriptor(src, prop));
    Object.defineProperties(target, props);
}

//mock gwt stuff
window.GWT = {
    NodeStatusEnum: {
        Loaded: {}
    }
};
