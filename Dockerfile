FROM openjdk:8
EXPOSE 8080
ADD target/customer-msa3.jar customer-msa3.jar
ENTRYPOINT ["java","-jar","/customer-msa3.jar"]