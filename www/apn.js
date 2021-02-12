/*global cordova, module*/

module.exports = {
    addAPN: function (name, successCallback, errorCallback) {
        cordova.exec(successCallback, errorCallback, "APN", "add-apn", [name]);
    }
};