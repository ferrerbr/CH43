/*Datos primitivos 
fueron de los primeras creaciones

var (forma de  definir variables sin incializar  ya no es tan utilizada por que tiene un alcance globlal)

let (podemos declararla sin inicializarla sin embargo tienen un alcnce local  y es una buena practica utilizaarla y es de las constantes mas usadas )

const(la variable de debe inicializar  en el momento de la declaracion es una variable que no se va a cambiar )

scope( se refiere a la accecibilidad  de las variables y funciones dentro de distintas partes de mi codigo. El scoope  determina el tema  de la accesibilidad, es decir  donde y como vamos a manipular  las variables de mi programa)      let nombre

tipos de datos primitivos 
string(cadena de texto, secuencia de caracteres)
let  edad ="32"
let nombre="brandon"


number
se refiere  a un valores numericos 
let edad=32

boolean
 se refuere a  un valor booleano  y que solo nos mostrara verdadero o falso 
 let ien=true

 null
 se refiere a la  ausencia  o falta  de algun valor 

 undefinided
se refiere  a un variable que se declara  pero no se inicializo 



*/


let edad = prompt("ingresa la edad ")
let primaveras =prompt("ingresa primaveras")
//coercion implicita
let operacion = edad + primaveras ;
console.log(operacion);
//coercion implicita
let operacion2 = edad +Number(primaveras);
console.log(operacion2)
//multiples variables

/* nombre1 = Dani
nombre2 ="felipe"
nombre3 = "josue"

*/
let nombre1 = "Dani"
let nombre2 = "Felipe"
let nombre3 = "Josue" 

console.log(nombre1)
console.log(nombre2)
console.log(nombre3)

//typeof es un metodo que nos permite  saber que metodo es el tipo de dato es el que tenmos

console.log(typeof(nombre1));

let comensal;

console.log(typeof(comensal));

//conversion de datos  de numeros a cadenas de texto utilizando dos herramientas distintas

console.log(String(edad));
console.log(typeof String(edad));
//10console.log(typeof bendis.tOString())

//conversion de cadena de texto a numero 
let cambiarnumero =console.log(typeof Number(primaveras));
metodoParseInt = console.log(typeof parseInt(primaveras))
metodoParseFloat = console.log(typeof parseFloat(primaveras));


//conversion de bolean a number  
let ine = true ;
let cambioNumber =console.log(typeof Number(primaveras));
console.log(parseInt(primaveras))











