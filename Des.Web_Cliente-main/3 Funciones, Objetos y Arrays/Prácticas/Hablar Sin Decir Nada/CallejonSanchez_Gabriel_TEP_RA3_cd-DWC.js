//Arrays con el contenido, y el texto que se guarda para la salida

var txt1 = ["Queridos compañeros",
    "Por otra parte, y dados los condicionamientos actuales",
    "Asimismo,",
    "Sin embargo no hemos de olvidar que",
    "De igual manera,",
    "La práctica de la vida cotidiana prueba que,",
    "No es indispensable argumentar el peso y la significación de estos problemas ya que,",
    "Las experiencias ricas y diversas muestran que,",
    "El afán de organización, pero sobre todo",
    "Los superiores principios ideológicos, condicionan que",
    "Incluso, bien pudiéramos atrevernos a sugerir que",
    "Es obvio señalar que,",
    "Pero pecaríamos de insinceros si soslayásemos que,",
    "Y además, quedaríamos inmersos en la más abyecta de las estulticias si no fuéramos conscientes de que,"];

var txt2 = ["La realización de las premisas del programa",
    "La complejidad de los estudios de los dirigentes",
    "El aumento constante, en cantidad y en extensión, de nuestra actividad",
    "La estructura actual de la organización",
    "El nuevo modelo de actividad de la organización",
    "El desarrollo continuo de distintas formas de actividad",
    "Nuestra actividad de información y propaganda",
    "El reforzamiento y desarrollo de las estructuras",
    "La consulta con los numerosos militantes",
    "El inicio de la acción general de formación de las actitudes",
    "Un relanzamiento específico de todos los sectores implicados",
    "La superación de experiencias periclitadas",
    "Una aplicación indiscriminada de los factores confluyentes",
    "La condición sine qua non rectora del proceso"];

var txt3 = ["Nos obliga a un exhaustivo análisis",
    "Cumple un rol esencial en la formación",
    "Exige la precisión y la determinación",
    "Ayuda a la preparación y a la realización",
    "Garantiza la participación de un grupo importante en la formación",
    "Cumple deberes importantes en la determinación",
    "Facilita la creación",
    "Obstaculiza la apreciación de la importancia",
    "Ofrece un ensayo interesante de verificación",
    "Implica el proceso de reestructuración y modernización",
    "Habrá de significar un auténtico y eficaz punto de partida",
    "Permite en todo caso explicitar las razones fundamentales",
    "Asegura, en todo caso, un proceso muy sensible de inversión",
    "Radica en una elaboración cuidadosa y sistemática de las estrategias adecuadas"];

var txt4 = ["De las condiciones financieras y administrativas existentes.",
    "De las directivas de desarrollo para el futuro.",
    "Del sistema de participación general.",
    "De las actitudes de los miembros hacia sus deberes ineludibles.",
    "De las nuevas proposiciones.",
    "De las direcciones educativas en el sentido del progreso.",
    "Del sistema de formación de cuadros que corresponda a las necesidades.",
    "De las condiciones de las actividades apropiadas.",
    "Del modelo de desarrollo.",
    "De las formas de acción.",
    "De las básicas premisas adoptadas.",
    "De toda una casuística de amplio espectro.",
    "De los elementos generadores.",
    "Para configurar una interface amigable y coadyuvante a la reingeniería del sistema."];

var texto="";

var comb =[];

//Función cuando se inicia la página. Se recoge el valor de la cookie y se muestra en la página

function carga(){
    let contador = parseInt(getCookie("contadorEntrar") || "0");
    contador ++;
    setCookie("contadorEntrar", contador, 365);
    document.getElementById("Contador").innerHTML="<center>Esta página se ha cargado "+contador+" veces</center>";
}

//La función que se llama cuando se hace click en el botón. Se escoge aleatoriamente una frase de cada array, se muestra con un color y se agrega la combinación.
//Si están todas las combianciones, muestra un error en pantalla

function generar() {

    if (comb.length === Math.pow(14, 4)) {
        alert("Ya no hay más jefe");
        return;
    }

    let r1, r2, r3, r4, check;

    do{

    r1 = Math.floor(Math.random() * txt1.length);
    r2 = Math.floor(Math.random() * txt2.length);
    r3 = Math.floor(Math.random() * txt3.length);
    r4 = Math.floor(Math.random() * txt4.length);

    cad=r1.toString()+r2.toString()+r3.toString()+r4.toString();

    check = comb.includes(cad);

    }while(check);

    comb.push(cad);

     texto += "<a style='color: red;'>" + txt1[r1] + " </a>" +
        "<a style='color: cyan;'>" + txt2[r2].toLowerCase() + " </a>" +
        "<a style='color: green;'>" + txt3[r3].toLowerCase() + " </a>" +
        "<a style='color: yellow;'>" + txt4[r4].toLowerCase() + " </a><br>";


    document.getElementById("salida").innerHTML = texto;
}

//Función para darle un valor a la cookie 

function setCookie(nombre, valor, dias) {
    const fecha = new Date();
    fecha.setTime(fecha.getTime() + (dias * 24 * 60 * 60 * 1000));
    const expira = "expires=" + fecha.toUTCString();
    document.cookie = `${nombre}=${valor}; ${expira}; path=/`;
}

//Función para sacar el valor de la cookie

function getCookie(nombre) {
    const txt = nombre + "=";
    const cookies = document.cookie.split(';');
    for (let i = 0; i < cookies.length; i++) {
        let valor = cookies[i].trim();
        if (valor.indexOf(txt) === 0) {
            return valor.substring(txt.length, valor.length);
        }
    }
}