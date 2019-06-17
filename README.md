
 #	PRÁCTICA DE LABORATORIO 

**NOMBRE**: José Quinde

**CARRERA:** Computación	

**ASIGNATURA:** Programación Aplicada

**NRO. PRÁCTICA:**	07	

**TÍTULO PRÁCTICA:** Manejo de Archivos de Texto

## OBJETIVO ALCANZADO:

El objetivo de la práctica es aprender a cómo manejar los archivos de texto en Java a través de un controlador que te permite escritura, lectura y conteo de palabras.
La práctica también tendrá la información sobre una pequeña investigación sobre Procesamiento de Lenguaje Natural (NPL) y Bolsa de Palabras (BoW).

## ACTIVIDADES DESARROLLADAS

**1.Crear un repositorio en GitHub**

**Perfil:** JoseQ1996

**URL del proyecto:** https://github.com/JoseQ1996/Manejo-de-Archivos-de-Texto.git

-Se procedió a crear un repositorio con el nombre de Manejo de Archivos de Texto
 
![image](https://user-images.githubusercontent.com/49071271/59581399-67a8f480-909a-11e9-8a1b-1c8f72f5c052.png)

**2. Sincronizar el repositorio creado con un proyecto en NetBeans. Realizar un commit y push por cada requerimiento de los puntos a continuación descritos (incluir un mensaje que identifique claramente los commits realizados a GitHub).**

-Se realizaron 3 commits en el proyecto

-Aquí se puede revisar los commits realizados y que hizo cada uno en específico.
 
![image](https://user-images.githubusercontent.com/49071271/59581431-80190f00-909a-11e9-85aa-2ed3e5c83c27.png)

**3. Crear clase en el paquete**

- Se proceido a crear 4 paquetes uno para los archivos, otro del controlador, y para la clase palabra  y otro de la principal
 
 ![image](https://user-images.githubusercontent.com/49071271/59581510-c4a4aa80-909a-11e9-87db-5a9eac018d37.png)

**4. Controlador Texto.**

El programa tiene un controlador en donde permite escribir, leer y contar las palabras repetidas de un archivo.

![image](https://user-images.githubusercontent.com/49071271/59581538-ddad5b80-909a-11e9-96c6-11d2d8a446fd.png)
![image](https://user-images.githubusercontent.com/49071271/59581550-e2720f80-909a-11e9-87b7-5e234ec8c54a.png)
 
 
Método para comparar palabras y luego guardar en un txt los resultados

![image](https://user-images.githubusercontent.com/49071271/59581560-e9008700-909a-11e9-9523-4eb6c5ce67b9.png)
![image](https://user-images.githubusercontent.com/49071271/59581567-ee5dd180-909a-11e9-928e-c7971a3b8bbe.png) 
 
Clase palabra 

![image](https://user-images.githubusercontent.com/49071271/59581577-f4ec4900-909a-11e9-93a7-0713bd8fea39.png)
 
**5. Principal**

-Se generó un menú para escoger la opción que queremos, también se llama desde la principal al controlador del texto
 
 ![image](https://user-images.githubusercontent.com/49071271/59581617-13524480-909b-11e9-9983-8a012115b6fb.png)
 
Ahí se muestra el menú con las opciones 

**6. Investigación**

## El Procesamiento del Lenguaje Natural (NLP)

Es el campo de estudio que se enfoca en la comprensión mediante ordenador del lenguaje humano. Abarca parte de la Ciencia de Datos, Inteligencia Artificial (Aprendizaje Automático) y la lingüística.

En NLP las computadoras analizan el leguaje humano, lo interpretan y dan significado para que pueda ser utilizado de manera práctica. Usando NLP podemos hacer tareas como resumen automático de textos, traducción de idiomas, extracción de relaciones, Análisis de sentimiento, reconocimiento del habla y clasificación de artículos por temáticas.

No es suficiente con comprender las palabras, se deberá comprender al conjunto de palabras que conforman una oración, y al conjunto de líneas que comprenden un párrafo. Dando un sentido global al análisis del texto/discurso para poder sacar buenas conclusiones.


Nuestro lenguaje está lleno de ambigüedades, de palabras con distintas acepciones, giros y diversos significados según el contexto. Esto hace que el NLP sea una de las tareas más difíciles de dominar.

-Sus usos

•	Resumen de textos: El algoritmo deberá encontrar la idea central de un artículo e ignorar lo que no sea relevante.

•	ChatBots: deberán ser capaces de mantener una charla fluida con el usuario y responder a sus preguntas de manera automática.

•	Generación automática de keywords y generación de textos siguiendo un estilo particular

•	Reconocimiento de Entidades: encontrar Personas, Entidades comerciales o gubernamentales ó Países, Ciudades, marcas…

•	Análisis de Sentimientos: deberá comprender si un tweet, una review o comentario es positivo ó negativo y en qué magnitud (o neutro). Muy utilizado en Redes Sociales, en política, opiniones de productos y en motores de recomendación.

-Componentes del procesamiento del lenguaje natural

A continuación, vemos algunos de los componentes del procesamiento del lenguaje natural. No todos los análisis que se describen se aplican en cualquier tarea de PLN, sino que depende del objetivo de la aplicación.

•	Análisis morfológico o léxico. Consiste en el análisis interno de las palabras que forman oraciones para extraer lemas, rasgos flexivos, unidades léxica compuestas. Es esencial para la información básica: categoría sintáctica y significado léxico.

•	Análisis sintáctico. Consiste en el análisis de la estructura de las oraciones de acuerdo con el modelo gramatical empleado (lógico o estadístico).

•	Análisis semántico. Proporciona la interpretación de las oraciones, una vez eliminadas las ambigüedades morfosintácticas.

•	Análisis pragmático. Incorpora el análisis del contexto de uso a la interpretación final. Aquí se incluye el tratamiento del lenguaje figurado (metáfora e ironía) como el conocimiento del mundo específico necesario para entender un texto especializado.

## Bolsa de palabras (Bag of Words)

Es una forma de extraer características del texto para su uso en el modelado. El enfoque es muy simple y flexible, y se puede utilizar en una variedad de maneras para extraer características de los documentos. Una bolsa de palabras es una representación de texto que describe la ocurrencia de palabras dentro de un documento. Esto tiene que ver con dos cosas:
Un vocabulario de palabras conocidas.

Una medida de la presencia de palabras conocidas.

Se llama Bag of Words, porque cualquier información sobre el orden o estructura de las palabras en el documento es descartada. El modelo sólo se refiere a si las palabras conocidas aparecen en el documento, y no en qué parte del documento.
La intuición nos dicta que los documentos son similares si tienen un contenido similar. Además, que sólo del contenido podemos aprender algo sobre el significado del documento. La Bag of Words puede ser tan simple o compleja como quieras. La complejidad radica tanto en decidir cómo diseñar el vocabulario de las palabras conocidas (o tokens) y en cómo puntuar la presencia de palabras conocidas. Ahora examinaremos más detenidamente estos dos casos.
-Limitaciones de la bolsa de palabras o Bag of Words

Es muy simple de entender y de implementar, y también ofrece mucha flexibilidad para la personalización de sus datos de texto específicos. Se ha utilizado con gran éxito en problemas de predicción, como el modelado del lenguaje y la clasificación de documentación.

•	Vocabulario: El vocabulario requiere un diseño cuidadoso, más específicamente para manejar el tamaño, que impacta en la escasez de las representaciones de los documentos.

•	Sparsity: Las representaciones dispersas son más difíciles de modelar, tanto por razones computacionales (complejidad de espacio y tiempo), como también por razones de información, donde el reto para los modelos es aprovechar tan poca información en un espacio de representación tan grande.

•	Significado: Descartar el orden de las palabras ignora el contexto y, a su vez, el significado de las palabras del documento (semántica). El contexto y el significado pueden ofrecer mucho al modelo, que si es modelado podría decir la diferencia entre las mismas palabras ordenadas de manera diferente (esto es interesante vs es interesantemente), sinónimos (bicicleta vieja vs bicicleta usada), y mucho más.

## RESULTADO(S) OBTENIDO(S):
 
Escritura

![image](https://user-images.githubusercontent.com/49071271/59581646-2533e780-909b-11e9-952d-42f15229fbb1.png)

Lectura

![image](https://user-images.githubusercontent.com/49071271/59581651-2a913200-909b-11e9-8693-9a811ac585ad.png) 

El archivo

![image](https://user-images.githubusercontent.com/49071271/59581659-30871300-909b-11e9-9d50-09636eb953f6.png) 

El resultado

![image](https://user-images.githubusercontent.com/49071271/59581704-58767680-909b-11e9-9c07-4ec97e542923.png)
## CONCLUSIONES:

Como conclusión se puede decir que se aprendió a contar palabras repetidas de un archivo así como también se aprendió a utilizar la clase File, a través de controladores se aprendió a escribir y leer un archivo de texto.

## RECOMENDACIONES:

Implementar la clase File para poder realizar el manejo de Archivos.

**Nombre de estudiante:** José Quinde


**Firma de estudiante:** 

![image](https://user-images.githubusercontent.com/49071271/59581713-5f9d8480-909b-11e9-88e7-002dea4d9521.png)
