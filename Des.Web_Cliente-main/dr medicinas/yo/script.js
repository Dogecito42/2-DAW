const Reg=/[0-9]{4}[A-Z]{1}/;
let form=document.getElementById("form");

let idioma=document.createElement("button");
idioma.innerHTML="cambiar Idioma";

let registrar=document.createElement("button");
registrar.innerHTML="Registrar";
registrar.setAttribute("onclick","inicio()");
registrar.setAttribute("class","botones");

let iniciar=document.createElement("button");
iniciar.innerHTML="Modo Admin";
iniciar.setAttribute("onclick","verificacion()");
iniciar.setAttribute("class","botones");

let es=true;

idioma.addEventListener("click", function(){

    if (es==true){
        es=false;

        document.getElementsByClassName("string")[0].innerHTML="Data Register";
        document.getElementsByClassName("string")[1].innerHTML="Name: ";
        document.getElementsByClassName("string")[2].innerHTML="Surname: ";
        document.getElementsByClassName("string")[3].innerHTML="Verification code";
        document.getElementsByClassName("string")[4].innerHTML="Log In";
        document.getElementsByClassName("string")[5].innerHTML="Admin User";
        document.getElementsByClassName("string")[6].innerHTML="Access Key";
    }else{
        es=true;

        document.getElementsByClassName("string")[0].innerHTML="Registro de datos";
        document.getElementsByClassName("string")[1].innerHTML="Nombre: ";
        document.getElementsByClassName("string")[2].innerHTML="Apellidos:  ";
        document.getElementsByClassName("string")[3].innerHTML="Código de verificación";
        document.getElementsByClassName("string")[4].innerHTML="Iniciar sesión";
        document.getElementsByClassName("string")[5].innerHTML="Usuario administrador";
        document.getElementsByClassName("string")[6].innerHTML="Clave de acceso";
    }
});
let login=false;

function inicio(){

    if (form.nombre.value == "" || form.apellidos.value == ""){

        document.getElementsByClassName("errores")[0].innerHTML="Faltan datos por rellenar";
    }else{

        document.getElementsByClassName("errores")[0].innerHTML="";

        if(Reg.test(form.cod.value)){
            document.getElementsByClassName("errores")[0].innerHTML="Inicio de sesión correcto";
            document.getElementsByClassName("botones")[0].remove();

            login=true;
        }else{
            document.getElementsByClassName("errores")[0].innerHTML="clave de acceso incorrecta";

            
        }
    }

}
    function verificacion(){

        if (!login){
            document.getElementsByClassName("errores")[1].innerHTML="registrese para acceder al contenido";
        }else{

            if (claveCorr()){
                document.getElementsByClassName("errores")[1].innerHTML="Inicio correcto";

                document.getElementsByClassName("botones")[0].remove();

                document.getElementsByClassName("errores")[1].appendChild(idioma);

                setTimeout(function() {
                    idioma.remove();
                    document.getElementsByClassName("errores")[0].innerHTML=" ";
                    document.getElementsByClassName("errores")[1].innerHTML=" ";
                    document.getElementById("inicio").appendChild(registrar);
                    document.getElementById("registro").appendChild(iniciar);
                }, 10000);
            }
        }
}


function claveCorr(){

    let clave = form.cod.value;
    let clavecor = ""; // Inicializar correctamente
    
    for (let i = 0; i < clave.length - 1; i++) {
        clavecor += clave[i];
    }
    
    if (clavecor === form.clave.value) { 
        return true;
    } else {
        return false;
    }
    

}

