var argscheck = require('cordova/argscheck'),
    exec = require('cordova/exec');

/**
 * @constructor
 */
var Empty = {

    doNothing: function() {
      var success = function() {
        console.log("successfully did nothing");
      };
      var error = function() {
        console.log("failed to do nothing");
      }
      exec(success, error, 'Empty', 'doNothing', []);
    }
};

module.exports = Empty;
