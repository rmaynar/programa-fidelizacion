$("#consultarPuntos").click(function(){
	
	$.ajax({
		   type:'GET',
		   url :"consultaPuntos",
		   success: function(data) {
		        console.log('success',data);
		        $("#puntos").text("Estos son sus puntos: "+data.puntos);
		        $("#puntos").css("visibility", "visible");
		   },
		   error:function(exception){alert('Exeption:'+exception);}
		}); 
});

$("#operadorradio").click(function(){
	$("#clienteradio").prop('checked', false);
	$(".ciff-class").removeClass("d-none");
});

$("#clienteradio").click(function(){
	$("#operadorradio").prop('checked', false);
	$(".ciff-class").addClass("d-none");
});

$(".comprar").click(function(){
	if(this.value > misPuntos){
		alert("No tienes puntos suficientes!");
	}else{
		alert("Comprado!");

	}
	
});