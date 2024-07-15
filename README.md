# Conversor de Monedas

Este es un programa de consola en Java que convierte cantidades de dinero entre diferentes monedas utilizando una API de tasa de cambio.

## Requisitos

- JDK 11 o superior
- [Maven](https://maven.apache.org/) (opcional, si decides usarlo para gestionar dependencias)

## Instalación

1. Clona el repositorio:

    ```bash
    git clone https://github.com/tu_usuario/ConversorDeMonedas.git
    ```

2. Navega al directorio del proyecto:

    ```bash
    cd ConversorDeMonedas
    ```

3. Si estás usando Maven, instala las dependencias:

    ```bash
    mvn install
    ```

## Configuración

1. Regístrate en [Exchange Rate API](https://www.exchangerate-api.com/) y obtén tu API Key.
2. Abre el archivo `ApiClient.java` y reemplaza `"TU_API_KEY"` con tu clave API.

## Ejecución

1. Compila el proyecto:

    ```bash
    javac -cp src -d out src/*.java
    ```

2. Ejecuta el programa:

    ```bash
    java -cp out Main
    ```

## Uso

Sigue las instrucciones en pantalla para seleccionar la conversión de moneda y el monto que deseas convertir.

## Contribución

Si deseas contribuir a este proyecto, por favor haz un fork del repositorio y crea un pull request con tus cambios.


