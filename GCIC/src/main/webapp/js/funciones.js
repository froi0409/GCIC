/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

const input = document.getElementById('archivo');
const editor = document.getElementById('entrada');
input.addEventListener('change', function () {
    console.log('hola mundo');
    if (input.files.length > 0) {
        readFile(input.files[0]);
    }
});

function readFile(file) {
    const reader = new FileReader();
    reader.onload = function() {
        editor.value= reader.result; 
    }
    reader.readAsText(file);
}

function actualizarPosicion() {
    var txtEntrada = document.getElementById('entrada');
    var textLines = txtEntrada.value.substr(0, txtEntrada.selectionStart).split("\n");
    var currentLine = textLines.length;
    var currentColumn = textLines[textLines.length-1].length + 1;
    var texto = 'Linea: ' + currentLine + " - Columna: " + currentColumn;
    document.getElementById('lblPosicion').innerHTML = texto;
}

function saveTextAsFile(textToWrite, fileNameToSaveAs){
    var textFileAsBlob = new Blob([textToWrite], {type:'text/plain'}); 
    var downloadLink = document.createElement("a");
    downloadLink.download = fileNameToSaveAs;
    downloadLink.innerHTML = "Download File";
    if (window.webkitURL != null)
    {
        downloadLink.href = window.webkitURL.createObjectURL(textFileAsBlob);
    }
    else
    {
        downloadLink.href = window.URL.createObjectURL(textFileAsBlob);
        downloadLink.onclick = destroyClickedElement;
        downloadLink.style.display = "none";
        document.body.appendChild(downloadLink);
    }

    downloadLink.click();
}