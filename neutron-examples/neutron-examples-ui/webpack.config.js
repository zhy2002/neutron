var path = require('path');

process.traceDeprecation = true;

var config = {
    entry: './src/main/jsx/lodgement/main.jsx',
    output: {
        path: path.join(__dirname, 'src/main/webapp/js'),
        filename: 'index.js'
    },
    devtool: '#inline-source-map',
    module: {
        rules: [
            {
                test: /\.jsx?$/,
                exclude: /node_modules/,
                loader: 'eslint-loader',
                enforce: "pre"
            },
            {
                test: /\.jsx?$/,
                exclude: /node_modules/,
                loader: 'babel-loader',
                query: {
                    presets: ['es2015', 'stage-0', 'react'],
                    plugins: [
                        ["import", {libraryName: "antd", style: 'css'}]
                    ]
                }
            },
            { test: /\.css$/, loader: 'style-loader!css-loader' }
        ]
    },
    resolve: {
        extensions: ['.js', '.jsx']
    }
};

module.exports = config;
