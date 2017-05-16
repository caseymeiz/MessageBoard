# Message Board

This application creates a web page that displays messages posted by users 
and stores the messages/users in a relational database.

### Technologies used

- [Scala v2.12.2](https://www.scala-lang.org/) programming language
- [Play Framwrork v2.5.14](https://playframework.com/) web framwork includes webserver [Netty](https://netty.io/)
- [Scala Build Tool v0.13.5](http://www.scala-sbt.org/) package manager
- [PostgreSQL v9.6.2](https://www.postgresql.org/) database
- [Bootstrap v3.3.7](http://getbootstrap.com/)  HTML, CSS, and JS framework
- [Java Runtime Environment v1.8](http://www.oracle.com/technetwork/java/javase/downloads/jre8-downloads-2133155.html)
- [Java Development Kit v1.8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)


### How to run the app
Install the runtime Environment

##### Install Environment
```bash
apt-get install postgresql
apt-get install openjdk-8-jdk
```
##### Set-up PostgreSQL account

```
sudo -u postgres psql
\password postgres
\q
```
You may have to configure authentication
```
sudo nano /etc/postgresql/9.6/main/pg_hba.conf
```
change this line
```
    local   all             all                                     peer

```
to
```
    local   all             all                                     trust
```
or
```
    local   all             all                                     md5
```
##### Schema set-up
```
psql -U postges
```
```
CREATE DATABASE IF NOT EXISTS theboard;

\c theboard

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
```

#### Running the app
Download this github repo and extract the packaged app

```
tar -xvzf app.tgz
cd app/bin
bash theboard
```

The app should be running now 
[localhost:9000](localhost:9000)

