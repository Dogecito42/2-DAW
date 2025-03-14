  
let img=document.getElementById("imagen"); 
let div=document.createElement("div");
div.setAttribute("id","desc");

let form = document.getElementsByTagName("form")[0];
form.appendChild(div);

let nodoImagen=img

let desc = document.getElementById("desc");

let input=document.createElement("input");

input.setAttribute("id","inp");

document.body.appendChild(input);

input.setAttribute("placeholder", "ingrese el título");

//Creamos los elementos para obtener las imágenes, los botones y creamos el input

function crearNodo() { //Añade los eventos de la imagen

   img.addEventListener("mouseover", MostrarDescripcion);
   img.addEventListener("mouseleave", QuitarDescripcion); 
   
}

function agregar() {//Añade el atributo title al título para mostrarlo

   let titulo=document.getElementById("inp").value;

   if (nodoImagen) {
      nodoImagen.setAttribute("title", titulo);
   }
}

function eliminar() { //elimina el atributo title
   if (nodoImagen) {
      nodoImagen.removeAttribute("title");
   }
}

function MostrarDescripcion() { //mostra el título si existe
   if (desc && nodoImagen && nodoImagen.title) {
      desc.textContent = nodoImagen.title;
   }
}

function QuitarDescripcion() { //Quita la posiblidad de ver la descripción
   if (desc) {
      desc.textContent = "";
   }
}