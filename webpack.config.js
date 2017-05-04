var path = require('path');
var webpack = require('webpack');

module.exports = {
    entry: __dirname + "/src/main/js/app.js",
    devtool: 'source-map',
    output: {
        filename: "bundle.js",
        path: __dirname + "/src/main/resources/static/built"
    },

    resolve: {
        extensions: [".js", ".json"]
    },

    module: {
        loaders: [
            {
                test: path.join(__dirname, '.'),
                loader: 'babel-loader',
                exclude: /node_modules/,
                query: {
                    presets: ['es2015', 'react']
                }
            }
        ]
    }    
};