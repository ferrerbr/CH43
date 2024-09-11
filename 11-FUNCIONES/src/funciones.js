/*distintas instrucciones con base en lo que yo necesite 

*/


function recomendacion() {
    let clima = prompt ("Que tal el clima el dia de hoy?");
    if (clima == "soleado") {
        alert ("Usa bloqueador solar");
    } else {
        alert ("ponte sueter");
    }
    
    }
    
    
    
function saludar() {
    console.log("Hola desde una función");
}

//saludar();


function carritoMensaje(nombre, noProductos){
    let x=`Hola ${nombre} tienes ${noProductos} productos en tu carrito, ¿Procedemos al pago?`;
    alert(x);
}

let nombre = null;
let noProductos = 0;
//let nombre2 =prompt("ingresa tu nombre");
//carritoMensaje(nombre2,8);
//carritoMensaje(nombre2,10);
//console.log(noProductos,nombre)


//funciones anonimas

let carritoCompra = function(){
    let nombre = prompt("Ingresa tu nombre");
    let productos = prompt("Ingresa la cantidad de productos");
    let mensaje = `hola ${nombre} tienes ${productos} productos en tu carrito,Procedemos al pago`;
    alert(mensaje)
};
//carritoCompra();

/* ------RETURN-------
la palabra recervada return  nos indica que  estamos devolviendo un tipo de dato al ejecurar nuestra funcion
*/

function sumar(a,b){
    console.log("el resultado de la suma es :");
    return a+b;
}

let suma=sumar(5,6);
console.log(suma)


function bienvenido(nombre){
    return "hola "+nombre+" Ya eres cliente Premium";

}
let aviso = bienvenido("saul");
console.log(aviso)

let num1 = 15;
let num2 = 25;
let num3 = num1+num2;


console.log("el resultado es :"+num3);
function summa(num1,num2){
    let suma3 = num1+num2;
    return suma3;

}
let resultado= summa(54, 89);
console.log(resultado);

/*-----FUNCIONES FLECHA----

su sintaxis es mas concisa al no tener que utilizar la palabra reserbada function, return y si tengo solo un parametro los parentesis ya no s son necesarios igual que las llaves */
const saludo = nombre => console.log(`hola ${nombre}`);

saludo("juan carlos")

const multiplicar = (c,d) => c * d;
console.log(multiplicar(12,36));
let a = saludo("brandon");
console.log(a);


/**------HOISTING----- 
 * Es un comportamiento de js  en el cual la declaracion de variables y funciones son movidas al incio del contexto de ejecucion(contexto de ejecucion o contexto global )
 * antes de que se ejecute cualquier codigo.Esto significa que una variable o una funcion puede ser utilizada antes de ser declarada en el codigo.
*/
