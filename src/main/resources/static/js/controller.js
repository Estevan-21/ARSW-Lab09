function saveCadena(cadena){
	
}

function getCadenas(){
	axios.get('/cadena/get').then(function (response) { 
			console.log("ENTRE");
			
            var tablas=document.getElementById('table');
            var textoHTML='<table class="table table-striped table-sm" > <thead> <tr> <th class="text-center">Cadenas</th> <th class="text-center">Fecha</th></tr> </thead> <tbody id="OrdersBody">';            
            for (i=0;i < response.data.length;i++){				
				console.log("COMPLETO"+response.data[i]);
				response.data[i]=response.data[i].split("--");
				console.log(response.data[i]);
				textoHTML+= '<tr> <td class="text-center">';
				textoHTML+= response.data[i][0];
				textoHTML+='</td> <td class="text-center">';
				textoHTML+=response.data[i][1];
				textoHTML+="</td> </tr>"
			}            
			textoHTML+="</tbody> </table>"            
			tablas.innerHTML+=textoHTML;                        
        })
        .catch(function (error) {
            order.innerHTML = "(There is a problem with our servers. We apologize for the inconvince, please try again later)";            
	});
}
