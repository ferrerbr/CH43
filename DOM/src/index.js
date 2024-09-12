//Accediendo a los diferentes elementos del documento HTML utilizando su etiqueta, su clase o su id

//Acceder mendiante el id:document.getElementById("id")
const d = document;
const $tituloH1 = d.getElementById("title1");
const $tituloH2 = d.getElementById("title2");

console.log($tituloH1);//trae el elemento completo (con Etiqueta y atributos)
console.log($tituloH1);
console.log($tituloH1.innerText) // Recupero solo el texto que vive en el elemento Output: DOM  manipulation

//Acceder a los elementos  mediante calses : document.getElementByClassName("Class")

const $titulos = d.getElementsByClassName("title");

console.log($titulos);// Me muestra  todos los elementos de la misma clase como una coleccion HTML
console.log($titulos.length);
console.log(typeof $titulos);

//Acceder a los elementos mediante el nombre de su etiqueta: document.getElementByTagName("etiqueta")

const $titulosH3 = d.getElementsByTagName("h3");
console.log($titulosH3);// muestra los elementos  con la etiqueta h3

//Acceder a los elementos mediante  selecctores CSS utilizamos una sisntaxix conocida como querySelector nos permite acceder al primer eleemeto de una clase o  al elemento con cierto id

const $titulo4 = d.querySelector("#title4");
console.log($titulo4);

const $titulo = d.querySelector(".title");
console.log($titulo);

//queryselectorAll(" ")
const $titulosquery = d. querySelectorAll(".title");
console.log($titulosquery);

//--Modificando los elementos mediante manipulacion del DOM
$tituloH1.style.textAlign ="center";
$tituloH1.style.color = "#E1523D"


//Modidficar el texto existente de un elemento con innerText para acceder y modificar el texto del elemento
$tituloH2.innerText ="sesión de manipulacion del DOM con JS";
$tituloH2.style.color= "#C2BB03";

//--Crear nuevos elementos como nodos. Este proceso se divide en dos : crear el nodo y agregar el nodo


/**-Crear nodos:
 *      documnent.createElement("tipoElemento")------>Crear elementos apartir de     etiquetas
 *      document createTextNode("string") ----> Crea texto dento de las etiquetas
 * 
 * Insertar los nodos :
 *      parentNode.appendChild(Node);
 *      parentNode.append(node);
 *      parentNode.insertBefore(Node);
 *      parentNode.insetAdjacentElement(node);
 * 
 */


const tituloH4 = d.createElement("h4"); //creando elemento h4
const imgNode = d.createElement("img")//creando elemento img

const  textoTituloH4 = d.createTextNode("Imagen agregada desde el DOM"); //Crear el texto que vive dentro del h4

//--Tengo creado dos  nuevos elementos (nodos ) h4h  e img. Hay que agregarlos como nodos hijos  de un nodo padre

//1 Obtengo el nodo padre(parentNode) mediante su id: "img--container"

const $imgPadre = d.getElementById("img--container");

//2. Agrego el texto al nodo creado
tituloH4.appendChild(textoTituloH4);

//3. Mandar a llamar a el parentNode(imgPadre) isertar los nodos hijos(h4 y img)

$imgPadre.appendChild(tituloH4);
$imgPadre.style.color = "#A1C7E0";

//4. Agregando las propiedades necesarias para configurar el nodo de la imagen
imgNode.src = '../public/bob-ross.png';
imgNode.width = "500"
imgNode.alt = "lego bob ross"

//agregando la imagen al parentNode

$imgPadre.appendChild(imgNode)

//Outer Html  nos permite acceder al elemento , es otra manera de  acceder
let infoh4 = tituloH4.outerHTML;
console.log(infoh4);

$tituloH2.innerHTML="manioulacion del Dom Ch43 <li>"







 

