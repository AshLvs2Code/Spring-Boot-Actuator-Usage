Spring Boot Actuators are a set of production-ready features included in Spring Boot to help you monitor and manage your application. They provide endpoints that allow you to monitor various aspects of your application, such as health, metrics, environment information, and more.

To configure Spring Boot Actuators, you typically use properties in your `application.properties` file(Checkout the application properties file of this project).
Here are some common properties related to Spring Boot Actuators:

1. **Enable Actuators**: By default, Spring Boot Actuators are enabled. However, if you need to disable them for any reason, you can do so using the following property:
   ```properties
   management.endpoints.enabled-by-default=true
   ```

2. **Exposing Endpoints**: You can control which endpoints are exposed by Spring Boot Actuators. By default, some endpoints are enabled, but you can customize this behavior:
   ```properties
   management.endpoints.web.exposure.include=health,info,metrics,env
   ```

http://localhost:8080/actuator/health,
http://localhost:8080/actuator/info ,
http://localhost:8080/actuator/metrices ,
http://localhost:8080/actuator/env

3. **Security**: Actuator endpoints are sensitive and may expose sensitive information about your application. You can secure these endpoints with authentication and authorization:
   ```properties
   management.endpoints.web.base-path=/actuator
   management.endpoints.web.exposure.include=*
   management.endpoint.health.show-details=when_authorized
   ```

4. **Customize Endpoint Paths**: You can customize the paths of the Actuator endpoints:
   ```properties
   management.endpoints.web.base-path=/your-custom-path
   ```

5. **Health Endpoint**: Customize the health endpoint's behavior, such as including additional details:
   ```properties
   management.endpoint.health.show-details=always
   ```

6. **Metrics**: Customize metric collection and reporting:
   ```properties
   management.metrics.export.prometheus.enabled=true
   ```

7. **Auditing**: Configure auditing of actuator endpoints usage:
   ```properties
   management.endpoint.auditevents.enabled=true
   ```

These are just a few examples of properties you can use to configure Spring Boot Actuators. Depending on your specific requirements, you may need to use additional properties or customize them further. Refer to the Spring Boot documentation for a comprehensive list of available properties and their descriptions: [Spring Boot Actuator Properties](https://docs.spring.io/spring-boot/docs/current/reference/html/actuator.html#actuator.properties)
