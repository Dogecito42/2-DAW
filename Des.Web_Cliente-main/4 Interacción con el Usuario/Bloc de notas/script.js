let lista= document.getElementById("lista");
let cont=0;
function anadir(){

    let elem=document.createElement("li");

    let texto=prompt("Indique el dato");

    elem.textContent=texto;
    lista.appendChild(elem);

    cont++;

}

function elimina(){

    let valores=document.getElementsByTagName("li");

    valores[cont-1].remove();

    cont--;
}
