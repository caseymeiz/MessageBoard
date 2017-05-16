# install postgres
#sudo apt-get postgres-9.4

# setup postges user 
# need to make another user profile on the operating system

# create database app
CREATE DATABASE IF NOT EXISTS theboard;

# create tabes

CREATE TABLE IF NOT EXISTS users(
    id SERIAL PRIMARY KEY,
    username text,
    password text
);

CREATE TABLE IF NOT EXISTS messages(
    id SERIAL PRIMARY KEY,
    message TEXT,
    time DATE,
    user_id INTEGER REFERENCES users (id)
);
