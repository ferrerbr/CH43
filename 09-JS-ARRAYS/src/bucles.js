/****cilo for nos permite iterar sobre un bloque  de codigo evaluando consdiciones e incrementando un contador  */
/**for (let index = 0; index < array.length; index++) {
    const element = array[index];
    
}*/

// el ciclo for  inicializa , evalua , ejecuta bloque de codigo e incrementa al final 
for(let cuenta = 1;cuenta<=5;cuenta++){
    console.log(`cuenta ${cuenta}`)
}


//ciclo for con varible global
let numeroIncremento = 1;
for(numeroIncremento; numeroIncremento <= 5; numeroIncremento ++){
    console.log(numeroIncremento)
}

//decremento
let numeroDecremento = 5;
for(numeroDecremento; numeroDecremento >= 1; numeroDecremento --){
    console.log(`decremento ${numeroDecremento}`)
}

//sumar todos los numeros del 1 al 100=5050

let suma = null;
for(let i = 1 ;i <= 100; i++ ){
    suma+=i;
}
console.log(`La suma es ${suma}`)


//ciclo for para recorrer una lista 

const ch43 = ["miriam","juan","brandon"];
for(let i = 0; i < ch43.length;i++){
    console.log(ch43[i])
};
//ciclos array  for in (devuelve indices) y for of (devuleve los elementos de array)

for(let developer of ch43){
    console.log(`Hola soy el desarollador ${developer}`)
};

for(let developer in ch43){
    console.log(`devuelvo el indice ${developer}`)
};

//contar los numero pares del 247 al 361

for(let i = 247; i <=361; i ++){
    if (i % 2 === 0){
        console.log(`${i} es un numero par`)

    }
}

//------> CICLO WHILE <--------
//nor permite recorrer un bloque de codigo mientras se cumpla una condicion

let i = 0;
while(i <= 5){
    i++
    console.log(i)
}

//puedo tener mayor control sobre el incremento y el bloque de codigo que se ejecuta 


let a = 0;
while(a <= 5){
   
    console.log(a)
    a++
} 

//tomando nuestro array de ch43, mosttrar los elementos utilizador en un ciclo while

let developers = 0;
while(developers<ch43.length){
    console.log(ch43[developers]);
    developers++
}

//imprimir una secuencia de asteriscos  desde 1 hasta 5 
let  limite = 5;
let  inicio = 0;
let asterisco = "";
while(inicio < 5){
    asterisco += "*";
    console.log(asterisco);
    inicio++;
}

//-----> CLICLO DO WHILE <-----
//recorre un blooque de codigo mientras se cumpla una condicion especifica, pero entes de evaluar dicha condicion ejecuta almenos una vez la instrucion 
let j = 0;
do{
    console.log(j);
    j++

}while(j < 5);

//-------> CONTROL DE CICLOS <----
/**Exisyen dos sentencias que nos permiten controlar los ciclos: break y continue. Break detiene un ciclo en un punto específico y continue permite que el ciclo continúe pero ejecutando una acción específica en un punto dado. */

let cuenta  = 0;
while(cuenta < 100){
    cuenta++
    //quiero agregar un condicion que permita detener BREAK
    if(cuenta === 22){
        break
    }
   
}
console.log(cuenta)

for(let contador = 0; contador <= 10; contador++ ){

    //sentencia continue
    if(contador === 5){
        console.log(`cliente ganador ${contador}`);
        continue;
    }
    console.log(`cliente número ${contador}`);
};

