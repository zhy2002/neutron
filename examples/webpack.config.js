/**
 * References
 * - https://shellmonger.com/2016/01/26/using-eslint-with-webpack/
 */

//var modelName = process.argv[2].substr(2);

var config = {
    entry: './src/main/jsx/lodgement/main.jsx',
    output: {
        path: './src/main/webapp/js',
        filename: 'index.js'
    },
    devtool: '#inline-source-map',
    module: {
        preLoaders: [
            {
                test: /\.jsx?$/,
                exclude: /node_modules/,
                loader: 'eslint'
            }
        ],
        loaders: [
            {
                test: /\.jsx?$/,
                exclude: /node_modules/,
                loader: 'babel',
                query: {
                    presets: ['es2015', 'stage-0', 'react']
                }
            }
        ]
    },
    resolve: {
        extensions: ['', '.js', '.jsx']
    }
};

module.exports = config;
