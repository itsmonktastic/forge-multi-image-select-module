// Expose the native API to javascript
forge.tribr_multi_image_select = {
    showAlert: function (text, success, error) {
        forge.internal.call('tribr_multi_image_select.showAlert', {text: text}, success, error);
    }
};

// Register for our native event
forge.internal.addEventListener("tribr_multi_image_select.resume", function () {
	alert("Welcome back!");
});
