# Topcoder Java API With PostgreSQL Starter Pack:

## Requirements:
- Docker 17.05+
- Docker-Compose

## Configuration:
- The application configuration can be found at `src/main/resources/application.properties`
- For running the application on Docker using the provided docker-compose, use the default configuration provided.
- The following configuration parameters are defined:
    - `spring.datasource.url` The database url, can be overwritten by the environment variable DATABASE_URL.
    - `spring.datasource.username` The database username, can be overwritten by the envrionment variable DATABASE_USERNAME.
    - `spring.datasource.password` The database password, can be overwritten by th environment variable DATABASE_PASSWORD.
    - `spring.jpa.properties.hibernate.dialect` The database dialect, it should be a dialect supported by Postgres, the default value is org.hibernate.dialect.PostgreSQL95Dialect
    - `spring.jpa.show-sql` The flag indicating whether to show the SQL statement generated by hibernate on logs, by default it is set to true, **It should be set to false on production**, it can be overwritten by the environment variable SHOW_SQL.
    - `logging.level.root` The root logging level, default value is 'info', it can be overwritten by the environment variable ROOT_LOGGING_LEVEL.
    - `logging.level.com.topcoder.api` The api logging level, default value is 'info', it can be overwritten by the environment variable API_LOGGING_LEVEL.
    - `logging.file` The logging file name, default value is server.log and can be overwritten by the environment variable LOG_FILE.
    - `logging.file.max-size` The logging file maximim size, default value is 50MB and can be overwritten by the environment variable LOG_FILE_MAX_SIZE.
    - `server.port` The port number on which the API will be listening, default value is 8080, it can be overwritten by the environment variable SERVER_PORT.
    - `server.servlet.context-path` The API prefix, default value is '/api/v1', it can overwritten by the environment variable API_PREFIX.

- In docker-compose.yml, the following environment variables are used:
  - DATABASE_USERNAME: The database username, the default value is 'topcoder'.
  - DATABASE_PASSWORD: The database password, the default value is 'Topcoder123'.
  - DATABASE_NAME: The database name, the default value is 'topcoder'.

When running the postgres db container, a database with the configured name (default to 'topcoder') will be created.
A database user and password will also be created using the configured environment variables or default values 'topcoder/Topcoder123'.
    
## Deployment on docker:
- Keep the default provided configuration.
- Navigate to the application root folder (java-postgres) where docker-compose.yml resides and run the following command:

```bash
docker-compose up
```
This will start postgres database and the API containers, the API will be listening on port 8080.

## Local Deployment:
- Start Postgres using the provided docker-compose.yml by running `docker-compose up postgres-db`
- Configure the application as described above by updating src/main/resources/application.properties or by using environment variables.
- If the provided docker-compose.yml is used for starting the database, we only need to update DATABASE_URL value (The database and users table will be created automatically):
  `export DATABASE_URL="jdbc:postgresql://<Docker-IP>:5432/topcoder"` (replace <Docker-IP> with the IP address of docker machine)
- Run the API by executing the following command :
  `mvn spring-boot:run`

# Verification:
Refer to Validation.md

