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