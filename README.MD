# Hoja de Trabajo 7 - Binary Search Trees (BST)

## 👤 Autor
Nombre: **[TU NOMBRE AQUÍ]**  
Repositorio: **[LINK DE TU REPO AQUÍ]**

---

## 📌 Descripción

Este proyecto consiste en la implementación de un **árbol binario de búsqueda (BST)** en Java para construir un diccionario Inglés → Español.

El programa lee un archivo de asociaciones `(palabra_inglés, palabra_español)`, las almacena en un BST ordenado por la palabra en inglés y luego utiliza esta estructura para traducir un texto en inglés.

---

## ⚙️ Funcionalidades

- Implementación de la clase `BinaryTree<E>`:
  - Inserción de elementos
  - Búsqueda de elementos
  - Recorrido **in-order**

- Implementación de la clase `Association<K, V>`:
  - Representa pares clave-valor (inglés → español)
  - Ordenamiento basado en la clave (inglés)

- Traducción de texto:
  - Cada palabra es buscada en el BST
  - Si existe → se traduce
  - Si no existe → se muestra entre `*asteriscos*`

- Manejo de:
  - Mayúsculas y minúsculas
  - Puntuación básica

---

## 📂 Archivos utilizados

- `diccionario.txt` → contiene las asociaciones
- `texto.txt` → contiene el texto a traducir

Formato esperado del diccionario: