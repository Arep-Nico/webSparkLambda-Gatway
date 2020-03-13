$(document).ready(function(){
    // Get value on button click and show alert
    $("#send").click(function(){
        var str = $("#number").val();

        $.get("http://localhost:4567/api/v1/math/square?value=" + str, function(data) {
               alert('page content: ' + data);
            }
        );

        $("#res").html(str);
    });
});