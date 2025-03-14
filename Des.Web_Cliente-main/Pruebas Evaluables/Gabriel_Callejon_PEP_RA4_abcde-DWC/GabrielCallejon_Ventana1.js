//Objeto usuario y variables que se recolectan de los inputs

var usuario={
    nombre: "alumno",
    contra: "bueno",
    fecha: new Date(),

    setContra: function(contra){
        this.contra=contra;
    },

    setfecha: function(fecha){
        this.fecha=fecha;
    }
}

var user;
var pass;
var passN;

//Recoge la contraseña del usuario desde el script padre.

var passAct= window.opener.contraAct;
usuario.setContra(passAct);

//función que recopila los datos de los inputs, y si estos coinciden con el usuario y contraseña, dejará cambiar la contraseña
function iniciarSesion(){
     user= document.getElementById("nombre").value;
     pass= document.getElementById("contra").value;
    
     if (usuario.nombre == user && usuario.contra == pass){
            document.getElementById("salida").innerHTML="<p>Datos correctos, ¿Deseas cambiar la contraseña?</p>";
            document.getElementById("nContra").style.visibility= "visible";
            document.getElementById("nContraL").style.visibility= "visible";
            document.getElementById("nContraB").style.visibility= "visible";

          }else{
            document.getElementById("salida").innerHTML="<p>Datos incorrectos ¿Quieres intentarlo de nuevo?</p>";

          }


}

//función que cambia la contraseña dada por el usuario, si no se introduce nada, se le hace saber al usuario
function cambiarContra(){

    passN = document.getElementById("nContra").value;
    if(passN== ""){
        document.getElementById("salida").innerHTML=`Por favor, introduzca una contraseña a cambiar`;
        return ;
    }
    let fechaN=new Date();
    usuario.setContra(passN);
    usuario.setfecha(fechaN);

                document.getElementById("salida").innerHTML=`Contraseña cambiada correctamente a ${usuario.contra}<br>Cerrando la pestaña...`;
    enviarDatos();

    setTimeout("self.close()", 3000);
}

//función para actualizar los datos al script padre, y así mostrarlos en la ventana4
function enviarDatos(){
    let objeto= {
        nombre: usuario.nombre, contra: usuario.contra, fecha: usuario.fecha}
        window.opener.recibirDatos(objeto);
}