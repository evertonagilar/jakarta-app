# build
FROM azul/zulu-openjdk-alpine:21-latest as build
WORKDIR /proj
COPY src/ /proj/src
COPY pom.xml /proj
RUN apk update && apk add maven
RUN pwd && mvn package

# deploy
FROM payara/server-web:latest
ENV PAYARA_ARGS "--debug"
COPY --from=build /proj/target/*.war /opt/payara/deployments/
#COPY --from=build /proj /proj
EXPOSE 8080 4848 9009






