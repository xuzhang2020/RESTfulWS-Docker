
## RESTful Web Service & Docker


### About RESTful Web Service


In this sample project, I use the front and back end seperation technology. At back end I use SpringBoot freamework, the JSON file based database, and supply RESTful web service for the front requests. At the front end, I use html and ajax technology. The function of RESTful web service is to query the customers and orders collection, and a single customer or a single order.

1. Create SpringBoot project.
   Create a simple start SpringBoot project from the web page `https://start.spring.io/`.
   Download the project after completing the required attributes, such as project type `Maven Project`, Language `Java`, project metadata Group Id、 Artifact Id etc.
   
2. Using maven/pom.xml to manage dependencies.   
   In this project, `spring-boot-starter` `spring-boot-starter-test` `spring-boot-starter-web` `spring-boot-starter-thymeleaf` `org.json` are needed.
   You can find more dependencies and the correct way of reference on the web site `https://mvnrepository.com/`.
   
3. Data layer
   I choose using the json file based database. So I use json file `db.json` to store the datas of customers, orders and order items.
   Read and convert json file data to java object. 
```
   import com.fasterxml.jackson.databind.ObjectMapper;
   ...
   ObjectMapper objectMapper = new ObjectMapper();
   jsonData = objectMapper.readValue(content.toString(),JsonData.class);
```
   
   See `JsonService.java` to get more details.
   
4. Service layer.
   Interfaces `CustomerService` and `OrderService` are designed to supply customer and order query operations.
   Classes `CustomerServiceImpl` and `OrderServiceImpl` implement interfaces `CustomerService` and `OrderService`. Annotation `@Service`    is used on these service classes, so SpringBoot could create beans for our application, and annotation `@Autowired` could be used to    access methods of these service. Such as , I use 
```
   @Autowired
   JsonService jsonService;
```
   
   in the `CustomerService` to get a jsonService that can accesss the jason data based database.
   See `CustomerServiceImpl` and `OrderServiceImpl` to get more details.
   
5. Controll layer.
   Two controllers are created in this project, `IndexController`  and `CustomerController`. 
   `CustomerController` supply RESTful web service that contain four GET routes:
   One that displays a collection of customers by using `/customers`.
   
   One that displays a single customer by using '/customers/{id}'. And annotation `@PathVariable` is used to get the value of id        parameter.
   
   One that displays a collection of a specific customer's orders by using `/customers/{id}/orders`.
   
   One that displays a single order of a specific customer by using `/customers/{id}/orders/{orderId}`.
   
   `IndexController` supply an web page `index.html` that displays results of four GET routes. In the web page `index.html`, I use ajax  techonology to request four GET routes supplied by `CustomerController`, and process the json data returned from the web service routes.
   See package `com.zx.restfulws.controller` for more details.
   
### About Docker

1. Installation

   Access the web page `https://www.docker.com/products/docker-desktop` to get the docker installation file.
   
   Before the installation, `Hyper V` feature need to be turned on, and docker can only be installed on some Windows version. It requires Microsoft Windows 10 Professional or Enterprise 64-bit.
   
2. Common Docker commands

   `docker version`
   
   `docker images`
   
   `docker run`
   
3. Dockerfile

   I use a dockerfile to create a docker image that relates the jar package file of this project.
   The dockfile content belows:
   
```
   FROM java:8
   VOLUME /tmp
   ADD restfulws-0.0.1-SNAPSHOT.jar app.jar
   ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
```

3. Create Docker Image 

   After building up the jar package file, copy the jar file and the dockfile to one folder.
   Execute the system command terminal, use `cd` command to reach the folder contains jar file and dockfile.
   Execute the dock command belows:
   
   `docker build -t restfulws:1.0`
   
4. Run Docker Image

   Execute the dock command belows:
   
   `docker run -p 9091:8080 -t restfulws:1.0`

5. After docker image is running, input `http://localhost:9091/index` in the browser navigation bar.

   The index web page displays four buttons for the four RESTful GET routes, and we can also input request path and path variable in the brower navigation bar, such as:
   
   `http://localhost:9091/customers/`
   
   `http://localhost:9091/customers/35`
   
   `http://localhost:9091/customers/35/orders`
   
   `http://localhost:9091/customers/35/orders/13`


