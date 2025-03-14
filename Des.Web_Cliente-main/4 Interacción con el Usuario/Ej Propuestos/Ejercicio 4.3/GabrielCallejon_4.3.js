let texto= document.getElementsByTagName("p");
let boton= document.getElementsByTagName("button");

texto[0].style.visibility="visible";
texto[1].style.visibility="visible";
texto[2].style.visibility="visible";
texto[3].style.visibility="visible";

function ocultar(posi){

    if (texto[posi].style.visibility=="visible"){

        texto[posi].style.visibility="hidden";

        boton[posi].innerHTML=`Mostrar texto ${posi+1}`;
    }
    else{
        texto[posi].style.visibility="visible";

        boton[posi].innerHTML=`Ocultar texto ${posi+1}`;

    }
}
