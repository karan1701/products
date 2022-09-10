FROM openjdk:8
EXPOSE 9091
ADD target/products.jar products.jar
ENTRYPOINT ["java", "-jar", "/products.jar"]