#  Challenge ONE | Java | Back End | Conversor de Moneda

## ¡Bienvenido al proyecto con la solución al desafío Conversor de Moneda con Java!


Este proyecto es un conversor de monedas desarrollado en Java 21. El código está lo más modularizado posible y sigue buenas prácticas de programación.


![desafioConversor](https://github.com/Braian-Quintian/DesafioConversor/assets/130519457/1ca38d5d-6733-46d5-827d-892896155701)


## Características

- **Consumo de API**: El proyecto utiliza la API de [ExchangeRate-API](https://www.exchangerate-api.com/) para obtener las tasas de conversión y las monedas soportadas.
- **Selección de moneda**: El usuario puede seleccionar la moneda de origen de una lista de 6 países por defecto. Si elige la opción número 7, se le presenta un menú con aproximadamente 162 monedas soportadas.
- **Conversión de moneda**: Una vez que el usuario ha seleccionado la moneda de origen, se le pide que ingrese la moneda destino y la cantidad que desea convertir.
- **Validación de entrada**: El programa incluye validaciones para asegurar que las entradas del usuario son correctas.

## Uso

1. Descarga el archivo .jar del proyecto aquí [Descargar archivo .jar](https://github.com/Braian-Quintian/DesafioConversor/raw/4020bbe6273f842f189d898a100f7407a3c429f8/DesafioConversor-java21.jar)
2. Abre una terminal y navega hasta la ubicación del archivo .jar.
3. Ejecuta el archivo con el siguiente comando:
```bash
java -jar DesafioConversor-java21.jar
```
4. Selecciona el país de origen.
5. Si deseas utilizar una moneda diferente a las `6` opciones por defecto, selecciona la opción `7` para desplegar el menú de las 162 monedas adicionales.
6. Ingresa la moneda destino.
7. Ingresa la cantidad a convertir.
8. ¡Listo! El programa mostrará el resultado de la conversión.

## Requisitos

- Java `21` o superior.
- Acceso a Internet para utilizar la API ExchangeRate-API.


## Futuras mejoras

Este proyecto está en constante desarrollo y se planean varias mejoras y nuevas características. Si tiene alguna sugerencia o comentario, no dude en abrir un issue en este repositorio.

