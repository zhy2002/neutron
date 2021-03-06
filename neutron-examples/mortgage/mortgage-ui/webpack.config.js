//see https://github.com/RaphaelHadjadj/webpack2-cssmodules-sass/blob/master/webpack.config.js
const path = require('path');
const ExtractTextPlugin = require('extract-text-webpack-plugin');
const CleanWebpackPlugin = require('clean-webpack-plugin');

process.traceDeprecation = true;

var config = {
    entry: {
        login: ['babel-polyfill', './src/main/jsx/login'],
        manager: ['babel-polyfill', './src/main/jsx/manager']
    },
    output: {
        path: path.join(__dirname, 'src/main/webapp/js'),
        filename: '[name].js'
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
                loader: 'babel-loader'
            },
            {
                test: /\.css$/,
                loader: 'style-loader!css-loader'
            },
            {
                test: /\.scss$/,
                use: ExtractTextPlugin.extract({
                    fallback: 'style-loader',
                    use: [
                        {
                            loader: 'css-loader',
                            options: {
                                minimize: false
                            }
                        },
                        'sass-loader'
                    ]
                })
            },
            {
                test: /\.(eot|svg|ttf|woff|woff2)$/,
                loader: 'file-loader?name=../fonts/[name].[ext]' //'url-loader?limit=100000' //
            }
        ]
    },
    plugins: [
        new CleanWebpackPlugin(['src/main/webapp/css', 'src/main/webapp/fonts', 'src/main/webapp/js']),
        new ExtractTextPlugin("../css/[name].css")
    ],
    resolve: {
        extensions: ['.js', '.jsx']
    }
};

module.exports = config;
