
## Stadium Ticket Booking  
> Java implementation of a service that can manage the process of booking a ticket to a football match

## Table of Contents
* [General Info](#general-information)
* [Prerequisites](#prerequisites)
* [Dependencies](#dependencies)
* [Setup](#setup)
* [Usage](#usage)
* [Contact](#contact)


## General Information
Ticket Booking is a software component that is designed to handle booking of a ticket/s.

Stadium Ticket Booking exposes the following functionality:

• book a ticket

## Prerequisites
* JDK 11 or later
* gradle 7.4.1

## Dependencies
Currently the following dependencies are in use.

|Group ID                               |Artifact ID                            |Version            | 
|---                                    |---                                    |---                |
|org.springframework.boot               |spring-boot-starter-web                   |2.6.7		   	    |
|org.springframework                    |spring-boot-starter-validation                |2.6.3	        |
|org.springframework         |spring-boot-starter-data-mongodb    	        |2.6.7	        |
|org.springframework.boot               |spring-boot-starter-test               |31.1-jre		        |
|org.projectlombok               |lombok            |1.18.24              |


## Setup

### Docker:
1. clone repository
2. cd to the location of the docker-compose.yml for example: C:\ticketServiceStadium\src\main\resources\
3. In the terminal run next command: 'docker-compose up' -> (This will boot 2 containers - one for the mongodb (Port:27017) 
and the other for the springboot application(Port:8080) ).
4. Feel free to use postman or any other preferred way to send the request.
5. To view the db: 'docker exec -it ticketsmongodb bash' then type 'mongo' and 'show dbs' -> db would be Tickets

## Usage
### curl
To book a new ticket depending on availability:
```bash 
curl -X POST 'http://localhost:8080/ticketing/bookTicket' \
--header 'Content-Type: application/json' \
--data-raw '{
   "userId": "new@something.com",
   "section": "b",
   "row": 1,
   "seat": 1
}'
```

## Contact
Created by Dani Simkin - feel free to contact me!
