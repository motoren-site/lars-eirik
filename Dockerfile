FROM openjdk:17-jdk-alpine AS TEMP_BUILD_IMAGE
WORKDIR /tmp/
COPY build.gradle settings.gradle gradlew /tmp/
COPY gradle /tmp/gradle
COPY src /tmp/src/
RUN ./gradlew build

FROM openjdk:17-jdk-alpine
ENV APP_HOME=/usr/app/
WORKDIR /tmp/
COPY --from=TEMP_BUILD_IMAGE /tmp/build/libs/lars-eirik-0.0.1-SNAPSHOT.jar .
EXPOSE 8080
CMD ["java","-jar",lars-eirik-0.0.1-SNAPSHOT.jar]
