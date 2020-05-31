#Dropwizard sample project to kick start the journey.

Drop wizard is a bunch of java framework glue together for the fast development of RESTful web services.

### Components

* Main components
  * Jetty : standalone web server
  * Jersey: JAX-RS for rest end points
  * Jackson: JSON data processing
  * Metrics: Application monitoring and health checks

* Other components
  * Guava: A google's lib for various utility use cases speed up development
  * SLF4J: For logging features
  * JDBI: DB access api following hibernate standards
  * Freemarker and Mustache: template for building the user interfaces

### Development steps for Dropwizard project
* Import the dropwizard dependencies in pom/gradle file
* Create your resource/rest end point
* Create your configuration dependency
* Create your metrics/health-check (optional)
* Create application/main class and register all the resources, metrics/health check (this step is optional)
* Execute via calling main method or jar