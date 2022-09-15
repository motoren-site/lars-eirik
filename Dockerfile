FROM openjdk:17-jdk-alpine AS TEMP_BUILD_IMAGE
WORKDIR /tmp/
COPY build.gradle settings.gradle gradlew /tmp/
COPY gradle /tmp/gradle
COPY src /tmp/src/
RUN ./gradlew build

FROM openjdk:17-jdk-alpine
COPY --from=TEMP_BUILD_IMAGE /tmp/build/libs/*.jar app.jar
EXPOSE 8080
CMD ["java","-jar","/app.jar"]
