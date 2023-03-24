function validarForma(forma){
    var usuario =  forma.usuario;
    if (usuario.value == "" || usuario.value == "Escribir Usuario") {
        alert("Debe proporcionar un nombre de Usuario");
        usuario.focus();
        usuario.select();
        return false;
    }
    
    var password = forma.password;
    if (password.value == "" || password.value.length < 3) {
        alert("Debe proporcionar un pasword alemnos de 3 caracteres");
        password.focus();
        password.select();
        return false;
    }
    
    var tecnologias = forma.tecnologia;
    var checkSeleccionado = false;
    
    for (var i = 0; i < tecnologias.length; i++) {
        if (tecnologias[i].checked) {
            checkSeleccionado = true;
        }
    }
    
    if(!checkSeleccionado){
        alert("Debe seleccionar una tecnologia");
        return false;
    }
    
    var genero = forma.genero;
    var radioSelecionado = false;
    
    
    for (var i = 0, max = 10; i < max; i++) {
        if (genero[i].cheked) {
            radioSelecionado = true;
        }
    }
    
    if (!radioSelecionado) {
        alert("Debe Selecionar un Genero");
        return false;
    }
    
    var ocupacion = forma.ocupacion;
    if(ocupacion.value == ""){
        aler("Debe selecionar una ocupacion");
        return false;
    }
    //Formulario es Valido
    
    alert("Formulario Valido, enviando datos al servidor");
    return true;
    
    
}

