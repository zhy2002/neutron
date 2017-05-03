//see https://github.com/RaphaelHadjadj/webpack2-cssmodules-sass/blob/master/webpack.config.js
const path = require('path');
const ExtractTextPlugin = require('extract-text-webpack-plugin');

process.traceDeprecation = true;

var config = {
    entry: './src/main/jsx/main',
    output: {
        path: path.join(__dirname, 'src/main/webapp/js'),
        filename: 'main.js'
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
            { test: /\.css$/, loader: 'style-loader!css-loader' },
            {
                test: /\.scss$/,
                use: ExtractTextPlugin.extract({
                    fallback: 'style-loader',
                    use: ['css-loader', 'sass-loader']
                })
            }
        ]
    },
    plugins: [
        new ExtractTextPlugin("../css/main.css")
    ],
    resolve: {
        extensions: ['.js', '.jsx']
    }
};

module.exports = config;
