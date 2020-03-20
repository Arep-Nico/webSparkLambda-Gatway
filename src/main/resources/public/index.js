$(document).ready(function(){
    $('#number').keypress(function (event) {
        var keycode = (event.keyCode ? event.keyCode : event.which);
        if (keycode == '13') {
            event.preventDefault();
            var str = $("#number").val();
            $.get("http://localhost:4567/api/v1/math/square?value=" + str, function (data) {
                    $("#res").html("El Cuadrado de " + str + " es: " + data);
                    $("#number").val("");
                }
            );
        }
    });
    // Get value on button click and show alert
    $("#send").click(function(){
        var str = $("#number").val();

        $.get("http://localhost:4567/api/v1/math/square?value=" + str, function (data) {
            $("#res").html("El Cuadrado de " + str + " es: " + data);
            $("#number").val("");
        }
        );

    });
});