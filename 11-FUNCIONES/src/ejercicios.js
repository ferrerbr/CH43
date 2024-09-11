/**
- Crear una función general y función flecha para verificar si un número es par o impar.

*/

/*
function verificacionPar(numero){
    if(numero%2 === 0){
        console.log(`${numero} es  un numero par`)
    }else{ console.log(`${numero} no es un numero par`)}

}
 verificacionPar(501);
*/
const  verificacionPar = numero =>{
    if(numero%2 === 0){
        console.log(`${numero} es  un numero par`)
    }else{ console.log(`${numero} no es un numero par`)}
}
 verificacionPar(59);


/**- Crear un programa para calcular la edad de una persona al día de hoy. Dicho programa también determina si es mayor o menor de edad. Utiliza función general y función flecha.
Pista: const today = new Date(); */
/*
function calculoEdad(nacimiento){
    edad = 2024-nacimiento;
    if(edad >= 18){
        console.log("Este usuarie es mayor de edad");
    }else{ console.log("este usuarie es menor de edad")}
}

calculoEdad(2007);
*/
const calculoEdad = nacimiento =>{
    edad = 2024-nacimiento;
    if(edad >= 18){
        console.log("Este usuarie es mayor de edad");
    }else{ console.log("este usuarie es menor de edad")}
}

calculoEdad(2005);

/**- Crear una función general y función flecha para calcular la edad de un gatito.
0 - 2 años gatunos = 24 años humanos
1 año gatuno extra = 4 años humanos  */
/*
function edadGato(edad){
    if(edad <= 2){
        console.log("Tu gato tiene 24 años humanos")

    }else{
        let añosExtra = 24+((edad-2)*4);
        console.log(`tu gato tiene ${añosExtra}  años humanos`)

    }
}
edadGato(5);
*/
const edadGato = edad => {
    if(edad <= 2){
        console.log("Tu gato tiene 24 años humanos")

    }else{
        let añosExtra = 24+((edad-2)*4);
        console.log(`tu gato tiene ${añosExtra}  años humanos`)

    }
}

edadGato(13);
