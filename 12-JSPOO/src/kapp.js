class usuario {
    constructor(correoElectronico, contrasena, numeroTelefono, nombre, apellido, fechaNacimiento, codigoPostal, ciudad, estado, pais) {
        this.email = correoElectronico;
        this.password = contrasena;
        this.phoneNumber = numeroTelefono;
        this.firstName = nombre;
        this.lastName = apellido;
        this.birthDate = fechaNacimiento;
        this.postalCode = codigoPostal;
        this.city = ciudad;
        this.state = estado;
        this.country = pais;
    }

    mostrarInformacion() {
        return `
        Nombre: ${this.firstName} ${this.lastName}
        Correo Electrónico: ${this.email}
        Número de Teléfono: ${this.phoneNumber}
        Fecha de Nacimiento: ${this.birthDate}
        Dirección: ${this.city}, ${this.state}, ${this.country}, ${this.postalCode}
        `;
    }
}

// Crear una instancia de la clase Usuario

const usuario1 = new usuario(
    'ferrerbrz@example.com',  
    'miContrasenaSegura123',    
    '555-1234',                
    'brandon',                    
    'Pérez',                    
    '1995-06-15',               
    '12345',                    
    'Ciudad de México',         
    'CDMX',                     
    'México'                    
);
console.log(typeof(usuario1))
console.log(typeof(usuario))


const usuario2 = new usuario(
    "juan.perez@ejemplo.com",
    "password123",
    "5551234567",
    "Juan",
    "Pérez",
    "1985-06-15",
    "54321",
    "Ciudad A",
    "Estado A",
    "País A"
)

console.log(usuario1);





// Mostrar la información del usuario 1
console.log(usuario1.mostrarInformacion());
// Mostrar la información del usuario 2
console.log(usuario2.mostrarInformacion());





const  usuario3 = {
    correoElectronico: "pedro.lopez@email.com",
    contrasena: "password789",
    numeroTelefono: "5553456789",
    nombre: "Pedro",
    apellido: "López",
    fechaNacimiento: "1980-08-30",
    codigoPostal: "98765",
    ciudad: "Ciudad ",
    estado: "Estado ",
    pais: "País "
};
console.log(typeof(usuario3));

let matriz = [5,4,8,9];
console.log(`El array es un tipo de dato ${typeof(matriz)}`)



fetch(`DB.json`)
    .then(response => response.json())
    .then(data => {
        data.forEach(participanteData =>{
            const { nombre, apellido, email, edad, telefono} = participanteData;
            const nuevoParticipante = new participante(nombre, apellido, email, edad, telefono);
            nuevoParticipante.infoIntegrantes();
        })
    })
    .catch(error => {
        alert (`Hubo un error al cargar los datos`)
        console.error(`Èrror el cargar`, error)
    });