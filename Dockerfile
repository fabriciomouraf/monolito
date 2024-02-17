# Etapa 1: Construir o front-end React
FROM node:16-alpine as build-stage
WORKDIR /app
COPY src/main/webapp/package*.json ./
RUN npm install
COPY src/main/webapp/ .
RUN npm run build

# Etapa 2: Construir o back-end Spring Boot
FROM maven:3.8.4-openjdk-17 as build-backend
WORKDIR /backend
COPY . /backend

COPY --from=build-stage /app/dist /backend/src/main/resources/static
RUN mvn clean package -DskipTests

# Etapa 3: Executar a aplicação
FROM openjdk:17-jdk-slim
WORKDIR /app
# Copie o jar executável do estágio de build-backend para a pasta /app
COPY --from=build-backend /backend/target/*.jar /app/app.jar
EXPOSE 8080
CMD ["java", "-jar", "app.jar"]

# Etapa 4: Copiar wait-for-it
COPY wait-for-it.sh /usr/wait-for-it.sh
RUN chmod +x /usr/wait-for-it.sh
