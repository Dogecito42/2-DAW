//Patrones de verificación
const PatronN = /^[0-9]$/;
const PatronC = /[0-9]{4}[A-Z]/;

//Variables de control de acceso o tipo de vista
var SesionUsuario = false;
var es=true;

var strings=document.getElementsByClassName("string");

//Botón de acceso al área usuario
var botonU = document.createElement("button");
botonU.innerHTML = "Iniciar sesión";
botonU.setAttribute("class", "boton");
botonU.setAttribute("onclick", "sesionUser()");

//Botón de acceso al área Administrador
var botonA = document.createElement("button");
botonA.innerHTML = "Iniciar sesión como Administrador";
botonA.setAttribute("class", "boton");
botonA.setAttribute("onclick", "sesionAdmin()");

//Botón de cambio de idioma
var botonI= document.createElement("button");
botonI.innerHTML= "Cambiar a Inglés";

var botonS=document.createElement("button");
botonS.innerHTML="Salir";

var formU = document.getElementById("usuario");
var formA = document.getElementById("administrador");


botonI.addEventListener("click",cambiarIdioma);
botonS.addEventListener("click", salida);

function sesionUser() { //Función que valida los campos del área Usuario y permite el inicio de sesión del área Administrador

    if (formU.nombre.value != "" && formU.apellidos.value != "") {

        document.getElementsByClassName("error")[0].innerHTML = "";

        if (!PatronN.test(formU.nombre.value) && !PatronN.test(formU.apellidos.value) && PatronC.test(formU.cod.value)) {

            document.getElementsByClassName("error")[0].innerHTML = "";
            document.getElementsByClassName("logIn")[0].innerHTML = "Inicio de Sesion Correcto";

            SesionUsuario = true;

            document.getElementsByClassName("boton")[0].remove();
        } else {
            document.getElementsByClassName("error")[0].innerHTML = "Los campos no cumplen con los requisitos puestos";
        }
    } else {
        document.getElementsByClassName("error")[0].innerHTML = "Faltan campos por rellenar";
    }
}


function sesionAdmin() { //Función que valida los campos del área Administrador y abre la vista de Administrador

    if (!SesionUsuario) {
        document.getElementsByClassName("error")[1].innerHTML = "Inicia sesión Primero como Usuario";
    } else {
        document.getElementsByClassName("error")[1].innerHTML = "";

        if (formA.admin.value === "Admin") {

            if (comprobarCod()) {
                document.getElementsByClassName("error")[1].innerHTML = "";
                document.getElementsByClassName("logIn")[1].innerHTML = "Inicio de Sesion Correcto";

                document.getElementsByClassName("boton")[0].remove();

                document.getElementsByClassName("idioma")[0].appendChild(botonI);
                document.getElementsByClassName("salida")[0].appendChild(botonS);

                setTimeout(salida,10000);

            } else {
                document.getElementsByClassName("error")[1].innerHTML = "Clave de Acceso Inválida";
            }
        } else {
            document.getElementsByClassName("error")[1].innerHTML = "Usuario inválido";
        }
    }
}

function comprobarCod() { //Comprueba que la clave de acceso es en efecto el código de verificación sin la letra

    let clave = formU.cod.value;
    let clavecor = "";

    for (let i = 0; i < clave.length - 1; i++) {
        clavecor += clave[i];
    }

    if (clavecor === formA.clave.value) {
        return true;
    } else {
        return false;
    }
}

function cambiarIdioma(){ //Camiba a inglés o a español (en función del idioma) los diferentes áreas de la página
    if (es){

        es=false;
        strings[0].innerHTML="User Log In";
        strings[1].innerHTML="Name: ";
        strings[2].innerHTML="Last Name: ";
        strings[3].innerHTML="Verification Code: ";
        strings[4].innerHTML="Log In as Administrator (User Log In is required)";
        strings[5].innerHTML="User Administrator: ";
        strings[6].innerHTML="Access Key: ";

        botonI.innerHTML="Change To Spanish";
        botonS.innerHTML="Exit";

    }else{
        es=true;
        strings[0].innerHTML="Inicio de Sesión de Usuario";
        strings[1].innerHTML="Nombre: ";
        strings[2].innerHTML="Apellidos: ";
        strings[3].innerHTML="Código de verificación: ";
        strings[4].innerHTML="Inicio de sesión de Administrador (Requiere el inicio de Usuario)";
        strings[5].innerHTML="Usuario Administrador:";
        strings[6].innerHTML="Clave de Acceso: ";

        botonI.innerHTML="Cambiar a Inglés";
        botonS.innerHTML="Salir";

    }
}

function salida(){ //Función para restablecer la vista del principio de la página, sin necesidad de recargarla
    document.getElementsByClassName("logIn")[0].innerHTML = "";
    document.getElementsByClassName("logIn")[1].innerHTML = "";

    botonI.remove();
    botonS.remove();

    formU.appendChild(botonU);
    formA.appendChild(botonA);
    SesionUsuario=false;

    let pene;
}

