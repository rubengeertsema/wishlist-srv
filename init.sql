CREATE DATABASE wishes;
CREATE USER wishes WITH PASSWORD 'wishes';
GRANT ALL PRIVILEGES ON DATABASE wishes TO wishes;
\connect wishes;
CREATE SCHEMA "wishes" AUTHORIZATION wishes;