# Usa una imagen base de OpenJDK para Java 17
FROM openjdk:11-jre-slim

# Copia el archivo JAR de tu aplicación a la imagen
COPY target/mensaje-0.0.1-SNAPSHOT.jar /app/app.jar

# Establece el directorio de trabajo
WORKDIR /app

# Expone el puerto 8080
EXPOSE 8080

# Comando para ejecutar la aplicación cuando se inicie el contenedor
CMD ["java", "-jar", "app.jar"]
