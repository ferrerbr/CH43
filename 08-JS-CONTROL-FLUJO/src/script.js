console.log("-------Control de Flujo--------")

//declaracion IF ELSE
let edad = 18;
if(edad  >= 18){
    console.log("bienvenido");

}else{
    console.log("Video de youtube");

}//siepre que el imput sea 19 y el output sera 19 

edad = 18;

//declaracion IF 

if(edad >= 10){
    console.log(" puedes usar internet")
}//siempre que el input sea menos de 10 el output sera 
edad = null;

/*El comentario para evaluar que el usuario esta ingresando su edaad podemos utilizar una sentencia condicional que evalua algo diferentede null  */
edad = null;
if(edad != null){
    console.log("El usuario esta ingresando su edad")
}else{
    console.log("Ingresa tu edad")
}


//ejemplo de una modificacion de variable
//--crear un programa que determine si nos encontramos en perdidas o en ganancias
let saldoInicial = 500;
let saldoFinal = 988;
let balance = 0;
if(saldoInicial < saldoFinal){
    balance = "Estamos en ganancias";
}else{
    balance = "Estamos en perdidas";
}

/**en ECMAScript6 Interpolacion de cadenas  nos permite unir una cadena de caracteres  con variables utilizando backticks``y $(variables) */

console.log("En este momento "+ balance);
console.log(`En este momento ${balance}`);

if(saldoInicial < saldoFinal){
    balance = `ganando como siempre`;
}else if(saldoInicial===saldoFinal){
    balance = `Estamos en tablas`;
}else{
    balance = `perdiendo com  nunca`

}
console.log(`${balance}`)

//determinar si un numero es par 

let numero = 15;

if ((numero%2)!=0){
    console.log(`el ${numero} es impar `);
}else{
    console.log(`el ${numero} es par `);
}

//operador ternario
/*es una forma consisa  de escribir un a sentencia condicional (if-else) se utilizan caracteres para evalua la condicion y ejecutar los bloques de codigo necesarios*/
//(condicion)? true ; false;
//determinar si un numero es par o  inpar  pero usando un operador ternario
let num = 451235;
let parImpar =(num % 2 === 0)?`el numero ${num} es par`:`El numero ${num} es inpar`;

console.log(parImpar)


// --- Determinar si una persona es un bebé (<= 3 años), niño (4 y 11), adolescente (12 a 17), adulto (=> 18), pero si es un adulto, determinar si es un adulto joven (18 a 59) o adulto mayor (> 60)
let edadPersona = 65;
if (edadPersona >= 18) {
    // console.log("Es un adulto");
    // Anidación de sentencias condicionales (code hell)
    if (edadPersona < 60) {
        console.log("Es un adulto joven");
    } else {
        console.log("Es un adulto mayor");
    }
} else if (edadPersona >= 12) {
    console.log("Es un adolescente");
} else if (edadPersona >=4) {
    console.log("Es un niño");
} else {
    console.log("Es un bebé");
}

//***Sentencia Switch *****/
console.log("****Switch*****");
/*determinar si el dia de la semana es laborable(L-V)o es descanso(S,D)*/
let diaSemana="sabado";
switch(diaSemana){
    case "lunes":
        console.log(`El ${diaSemana} es laborable`);
        break;
    case "lunes":
        console.log(`El ${diaSemana} es laborable`);
        break;
    case "martes":
        console.log(`El ${diaSemana} es laborable`);
        break;
    case "miercoles":
        console.log(`El ${diaSemana} es laborable`);
        break;
    case "jueves":
        console.log(`El ${diaSemana} es laborable`);
        break;
    case "viernes":
        console.log(`El ${diaSemana} es laborable`);
        break;
    case "sabado":
        console.log(`El ${diaSemana} no es laborable`);
        break;
    case "domingo":
        console.log(`El ${diaSemana} no es laborable`);
        break;
        default:
            console.log("no es un dia de la semana");  
}