# Use the latest Postgres version base image
FROM library/postgres:12

# Copy the DDL for creating the users table
COPY ddl.sql /docker-entrypoint-initdb.d/
