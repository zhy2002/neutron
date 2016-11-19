var config = {
    entry: './src/main/jsx/main.jsx',

    output: {
        path: './src/main/webapp/js',
        filename: 'index.js'
    },

    module: {
        loaders: [
            {
                test: /\.jsx?$/,
                exclude: /node_modules/,
                loader: 'babel',

                query: {
                    presets: ['es2015', 'react']
                }
            }
        ]
    }
};

module.exports = config;