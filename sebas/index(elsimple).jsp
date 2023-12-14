<!DOCTYPE html>
<html>
<h1>Estoy tratando de abrir un archivo xml</h1>
<body>

 
<button class="boton" id="botoncito">Leer xml</button>
<script>
//acá hay un video que explica muy bien: https://www.youtube.com/watch?v=1kA4DowJs08

document.querySelector("#botoncito").addEventListener("click",leerXML);

function leerXML(){
  console.log("función activada");
  const xmlhttp=new XMLHttpRequest();
  xmlhttp.open("GET","oradores.xml",true);
  xmlhttp.send();
//lo que sigue es la respuesta. es decir, ocurre cuando el xmlhttp cambia de estado
  xmlhttp.onreadystatechange=function(){
    if (this.readyState==4 && this.status==200){
      console.log(this.responseXML);
      document.write("<table style='border:2px solid black;'>");
        var x=xmlhttp.responseXML.getElementsByTagName("orador");
        
        for (i=0;i<x.length;i++){
          document.write("<tr><td style='border:1px solid black;'>");      
          document.write(xmlhttp.responseXML.getElementsByTagName("nombre").item(i).childNodes[0].nodeValue);
          document.write("</td><td style='border:1px solid black;'>");
          document.write(xmlhttp.responseXML.getElementsByTagName("edad").item(i).childNodes[0].nodeValue);
          document.write("</td><td style='border:1px solid black;'>");
          document.write(xmlhttp.responseXML.getElementsByTagName("ciudad").item(i).childNodes[0].nodeValue);  
          document.write("</td></tr>");
        }
        document.write("</table>");
      }
    
  }

  //elXML=xmlhttp.responseXML;

  //document.write("<table border='1'>");
  //var x=elXML.getElementsByTagName("orador");
  
  //for(i=1;i<=x.length;i++){
   // document.write(xmlhttp.responseXML.getElementsByTagName("nombre").item(1));
  //}

}



/*if (window.XMLHttpRequest)      .getElementsByTagName("orador")[0].childNodes[0].nodeValue

  {// code for IE7+, Firefox, Chrome, Opera, Safari

  xmlhttp=new XMLHttpRequest();

  }

else

  {// code for IE6, IE5

  xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");

  }
 //xmlhttp.open("GET","https://localhost/tpjava/oradores.xml",false);
 xmlhttp.open("GET","oradores.xml",true);
//xmlhttp.open("GET","oradores.xml",false);

xmlhttp.send();

xmlDoc=xmlhttp.responseXML;

 

document.write("<table border='1'>");

var x=xmlDoc.getElementsByTagName("CD");

for (i=0;i<x.length;i++)

  {

  document.write("<tr><td>");

  document.write(x[i].getElementsByTagName("ARTIST")[0].childNodes[0].nodeValue);

  document.write("</td><td>");

  document.write(x[i].getElementsByTagName("TITLE")[0].childNodes[0].nodeValue);

  document.write("</td></tr>");

  }

document.write("</table>");
*/
</script>

 

</body>

</html>