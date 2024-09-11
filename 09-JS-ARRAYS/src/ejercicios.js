//Reto 01
//Parte1. Hay tres personas esperando en banco. Sus nombres, en orden, son Sofia, David y Juan. Cree una matriz que tenga esos tres nombres en orden
const clientes = ["sofia","david","juan"];


//Parte2. Se agregan dos personas más al final de la finla: Saya y Agustin. La primera persona en la fila es llamada al cajero ¿Cómo es la cola?

clientes.push("agustin","sara");
console.log(clientes);
clientes.shift()
console.log(clientes)

//Parte3. Resulta que David estaba reservando un lugar para su amiga Renata. Ella aparece y va detrás de él en la fila. Aparece una persona más (Elena) y va hasta el final de la fila. ¿Cómo es la cola?
clientes.splice(clientes.indexOf("david")+1,0,"elena");
console.log(clientes)



//reto 02
// Imprima repetidamente el valor de la variable xValue, disminuyendo en 0.5 cada vez, siempre que xValue siga siendo positivo.

let =xValue = 10;
for(xValue; xValue >=0; xValue-=0.5){
    console.log(xValue);
};

//reto 3




