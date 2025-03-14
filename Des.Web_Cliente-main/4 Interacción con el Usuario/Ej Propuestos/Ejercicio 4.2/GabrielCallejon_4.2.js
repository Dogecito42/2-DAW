let texto= document.getElementsByTagName("p");
let div=document.getElementsByTagName("div");

texto[0].style.fontSize=1 +"px";

function agrandar(){

    texto[0].style.fontSize=parseInt(texto[0].style.fontSize) + 1+"px";
}

function disminuir(){
    texto[0].style.fontSize=texto[0].style.fontSize - 1 +"px";
}

function comprobar(){

    let tam=texto[0].style.fontSize;
    div[0].innerHTML=`El texto posee un tamaño de letra ${tam}`;
}