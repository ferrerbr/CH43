/**Creacion de arrays */
/**parainicalizar un array puedo escribir los elementos dentro de los corchetes[] */

let shooping = ["Pan ","Leche ","Queso","Espinacas", "Huevos","Carne"];
console.log(shooping.length);



/**apartir de un array vacio iremos agregando elementos de cada indice */
let cars = [];
cars[0] = "volkswagen";
cars[1] = "Mazda";
cars[2] = "Omoda";
cars[3] = "Ford";
cars[4] = "Tesla";

console.log(cars)
/**opcion 3 Mandar a llamar el Array como objeto al usar un objeto posee su porpia clase (Array) */
let cantantes=new Array("luisMi","Wendy sulca","Jose Jose","Justin Bieber");

console.log(cantantes)

/**Aceder a un elemento medianyte su indice */
let accesoElemento = `sebastian se come una ${shooping[0]}mientras conduce su ${cars[2]}`;
console.log(accesoElemento);

/******Metodos de Arrays***** */


//Logitud de un array (lenght)
let longitudArray = cantantes.length
console.log(`El numero de elementos del Array cantantes es ${longitudArray}`)

//accder al ultimo indice del Array

let ultimoElemento = cantantes[cantantes.length-1];
console.log(ultimoElemento);

let ch43=["saul","juan","brandon","ivanna"]

// --- sort(); ordena un Array de manera ascendente tomando como referencia la tabla ASCII
ch43.sort();
console.log(ch43);
// --- reverse(); invierte el orden del Array
ch43.reverse();
console.log(ch43);
// --- indexOf(); me devuelve el índice del primer valor (elemento) encontrado en un Array
let indiceElemento = ch43.indexOf('cristian');
console.log(indiceElemento);
let indiceElemento2 = ch43.indexOf('zhaid');
console.log(indiceElemento2); // -1 no existe el elemento dentro del Array
// --- forEach(); me devuelve todos los elementos del array. Itera sobre cada elemento y lo imprime uno por uno.
ch43.forEach((developers) => console.log(developers));
// --- map(); crea un nuevo Array con los resultados de la llamada a la función indicada, aplicado a cada uno de los elementos
const developers = ch43.map((developer) => `Hola ${developer}`);
console.log(developers);


/**Arrays multidimenscionales  */

/**** Arrays multidimensionales ****/
const comidas = ['Tamalito de chipilin', 'Cochinita', 'Lechón', 'Tacos envenenados', 'Guajolota', 'Torta ahogada', 'Carne asada', 'Machetes', 'Enchiladas queretanas', 'Tacos de canasta'];
const estados = ['Cdmx', 'Zacatecas', 'Tabasco', 'Jalisco', 'Chihuahua', 'EdoMex', 'Yucatán', 'Queretaro', 'Tlaxcala', 'Quintana Roo'];
const menu = [comidas, estados];
console.log(menu);
let shooping2 = [
    ["pan","leche","queso","espinacas","huevos","carne"],
    ["verduras","frutas","lacteos"],
    ["congelados","mariscos","carnes","postres"]
];
console.log(shooping2);

//mandando a llamar a uan elemento de un array multidimensional
let comida1 = (menu[0][1]);
console.log(comida1);
let estatado1 = (menu[1][6]);
console.log(estatado1)
//manioulando arrays multidimensionales
let producto = `El producto ${shooping2[0][1]} pertetenece a la categoria de ${shooping2[1][2]}`;
console.log(producto)
