

const borrar=document.getElementById("btnBorrar")
const nombre=document.getElementById("nombre")
const apellido=document.getElementById("apellido")
const cantidad=document.getElementById("cantidad")
const categoria=document.getElementById("categoria")
const correo=document.getElementById("email")
const calcular_total=document.getElementById("btn_calcular")
const los_oradores=document.getElementById("btn_oradores")



const validarCorreo=()=>{
var expReg =  /^[^\s@]+@[^\s@]+\.[^\s@]+$/

var verificacion=expReg.test(correo.value)
return verificacion
}


function limpiarForm(){
  
  let formulario=document.getElementById("formulario")
    formulario.reset()
    total.innerHTML=""
    }

function calcular(){
  
    if (nombre.value.trim()==""){
        alert("Debe ingresar un Nombre")
        nombre.focus()
        return
    }
    if (apellido.value.trim()==""){
        alert("Debe ingresar un Apellido")
        apellido.focus()
        return
    }
   
    if (!validarCorreo()){
        
        alert("Debe ingresar un correo válido")
        correo.focus()
        return
    }



    if (Number.isNaN(cantidad)||cantidad.value==0){
        alert("Debe ingresar una cantidad válida de Tickets a Comprar")
        cantidad.focus()
        return
    }
    if (categoria.value=="--Seleccione--"){
        alert("Debe seleccionar una categoría")
        categoria.focus()
        return
    }
    var precio=200
    var porcentaje=0
    switch (categoria.value) {
       
        case "Estudiante":
            porcentaje=80;
            break;
        case "Trainee":
            porcentaje=50;
            break;
        case "Junior": 
            porcentaje=15   
            break;
            
        default:
            porcentaje=0
            break;
    }
    resultado=(precio-(precio*porcentaje)/100)*cantidad.value;

    total.innerHTML=resultado

}


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
        document.write("<a href='index.jsp'> Volver al Inicio </a>");
      }
    
  }
}

calcular_total.addEventListener("click",calcular)
borrar.addEventListener("click",limpiarForm)



//aca va el código AJAX para leer el XML
//document.querySelector("#btn_oradores").addEventListener("click",leerXML);
los_oradores.addEventListener("click",leerXML)


