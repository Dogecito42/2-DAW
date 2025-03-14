
let select = document.getElementsByTagName("input");

function comprobar() {

    let valor = 0;
    let checked = 0;
    let salida = document.getElementById("salida");
    for (let i = 0; i < select.length; i++) {

        if (select[i].checked) {
            valor += parseInt(select[i].value);
            checked++;
        }
    }

    if (checked != 10) {
        alert("bro selecciona todas las opciones");
    } else {


        if (valor >= 5) {
            salida.innerHTML = `<p style="color:red;">Usted sufre de acoso, por favor coméntelo con adultos</p>`;
        } else {
            salida.innerHTML = `<p style="color:green;">No sufre de acoso, pero ha de tener cuidado con el trato de tus compañeros</p>`;
        }
    }
}