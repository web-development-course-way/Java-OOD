-- Create the users table
CREATE TABLE IF NOT EXISTS users (
    id uuid not null primary key,
    handle varchar(255) not null unique
);