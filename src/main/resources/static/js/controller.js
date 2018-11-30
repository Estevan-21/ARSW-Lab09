function saveCadena() {
   var cadena=document.getElementById('cadena').value
   axios.post('/cadena', cadena)
  .then(function (response) {
    console.log(response);
  })
  .catch(function (error) {
    console.log(error);
  });
  getCadenas();
}

function getCadenas() {
    axios.get('/cadena/get').then(function (response) {
        console.log("ENTRE");

        var tablas = document.getElementById('table');
        tablas.innerHTML="";
        var textoHTML = '<table class="table table-striped table-sm" > <thead> <tr> <th class="text-center">Cadenas</th> <th class="text-center">Fecha</th></tr> </thead> <tbody id="OrdersBody">';
        for (i = response.data.length-1; i >= 0; i--) {               
            console.log(i);
            console.log("COMPLETO" + response.data[i]);
            response.data[i] = response.data[i].split("--");
            console.log(response.data[i]);
            textoHTML += '<tr> <td class="text-center">';
            textoHTML += response.data[i][0];
            textoHTML += '</td> <td class="text-center">';
            textoHTML += response.data[i][1];
            textoHTML += "</td> </tr>"
        }
        textoHTML += "</tbody> </table>"
        tablas.innerHTML += textoHTML;
        })
        .catch(function (error) {
            alert("Error");
        });
}
