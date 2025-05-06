# 📰 Compose Article – Lectura de Artículo con Jetpack Compose

**Compose Article** es una aplicación simple desarrollada con **Jetpack Compose**, diseñada para mostrar una pantalla de artículo o contenido informativo con texto e imagen. Este proyecto fue realizado como parte de la práctica de la materia *Programación en Dispositivos Móviles*, enfocada en aplicar layouts, estilos de texto y recursos gráficos en Compose.

---

## 📱 ¿Qué muestra esta app?

La interfaz de la aplicación incluye:

- Una **imagen superior** ocupando todo el ancho de la pantalla.
- Un **título principal** en texto grande y con estilo personalizado.
- Un **párrafo introductorio** justificado, con padding lateral.
- Un **segundo párrafo** con texto también justificado y más detallado.

Todo el contenido está organizado verticalmente y estilizado para una buena experiencia de lectura.

---

## 🧩 Componentes utilizados

- `Column()` para estructurar verticalmente los elementos.
- `Image()` para mostrar una imagen destacada (cabecera).
- `Text()` con `fontSize`, `padding`, y `textAlign` para estilo.
- `painterResource()` para cargar la imagen desde `res/drawable`.
- `Modifier.fillMaxWidth()` y `dp` para controlar el tamaño y espaciado.

---

## 🎨 Especificaciones visuales implementadas

- La imagen ocupa **el 100% del ancho** (`fillMaxWidth()`).
- El título tiene **tamaño de fuente `24sp`** y padding de `16.dp` en todos los lados.
- El primer párrafo tiene **padding lateral (`start` y `end`) de 16.dp** y está **justificado**.
- El segundo párrafo también tiene padding completo de `16.dp` y alineación justificada.

---

## 🛠️ Tecnologías utilizadas

- Kotlin con Jetpack Compose
- Android Studio (Material 3)
- Anotaciones `@Composable` y `@Preview`
- Archivos `drawable` y `string` para recursos reutilizables

---

## 📂 Recursos utilizados

- Imagen: `header.png` (ubicada en `res/drawable`)
- Texto: Personalizado (puede reemplazarse por contenido dinámico si se desea)
- Colores y estilos: predeterminados del tema actual

---

## 🚀 Cómo probar

1. Abrí el proyecto en Android Studio.
2. Verificá que tengas una imagen colocada en `res/drawable` con el nombre correcto.
3. Ejecutá la app en un emulador o dispositivo físico.
4. Observá el contenido centrado, legible y adaptado para móviles.

---

## 🧑‍🎓 Autor

- **Nombre:** Derlis Gamarra  
- **Materia:** Programación en Dispositivos Móviles  
- **Universidad:** Universidad Autónoma de Asunción  

---

Este ejercicio permite entender cómo construir una pantalla informativa con imagen, texto estilizado y diseño moderno en Android usando Compose. ✍️
