# 🚀 Práctica de Programación Dinámica

## 📌 Información General

- **Título:** Práctica de Programación Dinámica  
- **Asignatura:** Estructura de Datos  
- **Carrera:** Computación  
- **Estudiante:** Jaime Loja  
- **Fecha:** 15/07/2025  
- **Profesor:** Ing. Pablo Torres  

---

## 🛠️ Descripción

Este programa implementa y compara dos algoritmos clásicos para calcular números de la serie de Fibonacci:

1. 🔁 **Fibonacci Recursivo Básico:**  
   Implementación recursiva tradicional sin optimización.

2. ⚡ **Fibonacci con Programación Dinámica (Memoización):**  
   Implementación eficiente usando `HashMap` para evitar cálculos repetidos.

Se utiliza `System.nanoTime()` para medir el tiempo de ejecución de cada método en nanosegundos y comparar su rendimiento.

---

## 📦 Estructura del Código

### `App.java`  
Contiene el método `main()` que:

- Muestra la información del estudiante.
- Ejecuta los métodos de Fibonacci para un valor dado (`n = 50`).
- Mide y muestra el tiempo de ejecución para cada versión.

### `EjerciciosPD.java`  
Clase con la lógica principal:

- `getFibonaci(int n)`: Método recursivo tradicional.  
- `getFibonaciPD(int n)`: Versión optimizada con programación dinámica usando memoización (`HashMap`).

---

## ▶️ Ejecución Automática

El programa se ejecuta sin necesidad de interacción del usuario.  
Al correr, imprime en consola:

- ✅ El resultado del cálculo de Fibonacci.
- ⏱️ El tiempo de ejecución en nanosegundos para:
  - La versión recursiva básica.
  - La versión con memoización.

---

### 1. Imagen
![alt text](image.png)

