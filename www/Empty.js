var argscheck = require('cordova/argscheck'),
    exec = require('cordova/exec');

/**
 * @constructor
 */
var Empty = {

    doNothing: function() {
        console.log("did nothing");
    }
};

module.exports = Empty;
