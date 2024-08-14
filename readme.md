# Proyecto de Microservicio Java Dockerizado

Este proyecto contiene un microservicio Java que interactúa con una base de datos MySQL. Ambos servicios están contenedorizados y se gestionan a través de Docker Compose.

## Requisitos

Antes de comenzar, asegúrate de tener instalados los siguientes componentes en tu sistema:

- [Docker](https://www.docker.com/get-started): Herramienta de contenedorización.
- [Docker Compose](https://docs.docker.com/compose/install/): Utilizada para orquestar los contenedores múltiples como servicios.

## Estructura del Proyecto

El proyecto consta de dos servicios principales:

1. **MySQL**: Servicio de base de datos que almacena la información utilizada por el microservicio.
2. **Microservicio Java**: Aplicación principal que realiza operaciones utilizando la base de datos MySQL.

## Instalación y Ejecución

### Paso 1: Clonar el repositorio

Clona este repositorio en tu máquina local utilizando Git:

```
git clone https://github.com/kevinnimisica/pica-microservice.git
cd ubicacion-elegida/pica-microservice
```

###  Paso 2: Configuración (Opcional)
Revisa el estado de clonación de los archivos de configuración antes de ejecutar la aplicación.

### Paso 3: Construcción de las imágenes (Opcional)
Si quieres construir las imágenes Docker desde cero, puedes hacerlo con el siguiente comando:

```
docker compose build
```

Este comando utilizará los Dockerfile y las configuraciones especificadas para construir las imágenes necesarias.

### Paso 4: Iniciar la aplicación
Para iniciar la aplicación, ejecuta el siguiente comando:

```
docker compose up -d
```
Este comando realizará las siguientes acciones:

- Descargar: Si las imágenes Docker especificadas en docker-compose.yml no están presentes en tu sistema, Docker las descargará automáticamente.
- Construir: Construirá la imagen del microservicio Java si no está disponible.
- Iniciar los servicios: Levantará los contenedores para MySQL y el microservicio Java, conectándolos en la red definida.

### Paso 5: Verificación
Puedes verificar que la aplicación esté corriendo correctamente con el siguiente comando:

```
docker ps
```
Esto mostrará los contenedores que están en ejecución y su estado.

### Paso 6: Acceso a la aplicación
Una vez que los contenedores estén en funcionamiento, puedes acceder al microservicio Java a través de la siguiente URL en tu navegador:

```
http://localhost:8080
```

### Paso 7: Detener la aplicación
Para detener la aplicación y todos los contenedores asociados, utiliza el siguiente comando:

```
docker compose down
```

Este comando detendrá y eliminará todos los contenedores, redes y volúmenes definidos en docker-compose.yml.

### Consideraciones adicionales

- Configuración de red: Asegúrate de que los puertos necesarios **(8080 y 3307)** estén libres y que tu firewall permita el tráfico en esos puertos.

## License

[MIT](https://choosealicense.com/licenses/mit/)
