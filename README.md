# Hotel Oasis - Sistema de Gestión de Reservas
Descripción
El proyecto Hotel Oasis es un sistema de gestión de reservas de hotel desarrollado en Java. Permite registrar huéspedes, manejar la información de las habitaciones y generar tickets en PDF que se pueden enviar por correo electrónico. La aplicación incluye tanto una interfaz gráfica para la interacción del usuario como una base de datos MySQL para almacenar la información de las reservas.

# Características
Registro de Huéspedes: Permite registrar los datos de los huéspedes, incluyendo nombre, cédula y edad.
Gestión de Habitaciones: Maneja la información de las habitaciones, como el número, tipo, estado y limpieza.
Generación de Tickets: Genera un ticket en formato PDF con la información de la reserva, que puede ser enviado por correo electrónico.
Interfaz Gráfica: Una interfaz amigable y fácil de usar desarrollada en Java Swing.
Persistencia de Datos: Utiliza MySQL para almacenar los datos de las reservas.
# Requisitos
Java Development Kit (JDK) 8 o superior
Apache Ant para la construcción del proyecto.
MySQL para la base de datos.
Bibliotecas adicionales (incluidas en el proyecto):
itextpdf-5.5.9.jar
javax.activation-1.1.0.v201105071233.jar
javax.ejb.jar
javax.faces-api-2.0.jar
javax.inject.jar
mail.jar
# Configuración
Clonar el repositorio: Clona el repositorio del proyecto desde GitHub y navega al directorio del proyecto.

Configurar la base de datos: Crea una base de datos en MySQL y ejecuta el script SQL incluido en el proyecto para crear las tablas necesarias.

Configurar las propiedades de la base de datos: Asegúrate de que el archivo db.properties contenga la configuración correcta para conectar a tu base de datos MySQL.

Construir el proyecto: Utiliza Apache Ant para construir el proyecto.

# Ejecución
Después de construir el proyecto, puedes ejecutar la aplicación utilizando Apache Ant.

# Uso
Registro de Huéspedes
Ingresa los datos del responsable de la habitación (nombre, cédula y edad).
Si el responsable también es huésped, marca la opción correspondiente.
Registra los datos de otros huéspedes si es necesario.
Presiona el botón para guardar la información.
Generación de Tickets
Después de registrar los huéspedes y los datos de la habitación, presiona el botón correspondiente.
Se solicitará un correo electrónico para enviar el ticket.
El sistema generará un PDF con la información de la reserva y lo enviará al correo proporcionado.
