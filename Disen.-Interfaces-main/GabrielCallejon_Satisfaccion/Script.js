var estrellas = document.querySelectorAll(".Estrella");
var boton = document.getElementById("bvalorar");

estrellas.forEach(estrella => {
    estrella.addEventListener('click', () => {
        let valor = estrella.getAttribute('data-value');
        contEstrellas(valor);
    });
});

function contEstrellas(valor) {
    estrellas.forEach(estrella => {
        if (estrella.getAttribute('data-value') <= valor) {
            estrella.classList.add('filled'); 
        } else {
            estrella.classList.remove('filled'); 
        }
    });

    boton.removeAttribute("disabled");
}

function referencia(url) {
    let ventana= window.open(url, "_blank", "width=300, height=300, left=0, top=0, resizable=no, menubar=no, location=no, scrollbars=no, status=no");

    setTimeout(() => {
        ventana.close();
    }, 2000);
}
