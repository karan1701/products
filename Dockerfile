FROM openjdk:8
EXPOSE 8081
ADD target/products.jar products.jar
ENTRYPOINT ["java", "-jar", "/products.jar"]