FROM openjdk:11
COPY ./target/IMT2020003_Calculator-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java","-jar","IMT2020003_Calculator-1.0-SNAPSHOT-jar-with-dependencies.jar"]