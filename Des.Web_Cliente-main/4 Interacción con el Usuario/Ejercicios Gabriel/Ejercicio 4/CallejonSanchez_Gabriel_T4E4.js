var tabla=document.querySelector("table");
var div=document.createElement("div");

let cont=1;

//Coge el elemento tabla y crea el div

function crearNodos(){    //añdae texto al div y lo une a la tabla


    
    div.innerHTML="<button onclick=cambiar()>camibar</button>";

    tabla.appendChild(div);
    
}

function cambiar(){    //función para cambiar el título de forma de alternación


    let tablas=document.getElementsByTagName("tr");

    

    if (cont%2==0){
        div.innerHTML="<button onclick=cambiar()>cambiar</button>";
        tablas[0].innerHTML=`<th colspan="3" id="cabecera">Esto es la cabecera de la tabla.</th>`;

    }else{
        div.innerHTML="<button onclick=cambiar()>Restaurar</button>";
        tablas[0].innerHTML=`<th colspan="3" id="cabecera">He cambiado la cabecera</th>`;

    }

    cont++;

}