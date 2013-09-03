module("tribr_multi_image_select");

// In this test we call the example showAlert API method with an empty string
// In the example API method an empty string will immediately call the error callback
asyncTest("Attempt to show an alert with no text", 1, function() {
	forge.tribr_multi_image_select.showAlert("", function () {
		ok(false, "Expected failure, got success");
		start();
	}, function () {
		ok(true, "Expected failure");
		start();
	});
});