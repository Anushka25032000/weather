# Project Title
Weather Prediction


## Table of Contents

- [Project Overview](#project-overview)
- [Structure](#structure)
- [Sequence Diagram](#sequence-diagram)
- [Design Patterns](#design-patterns)
- [Installation](#installation)
- [Usage](#usage)
- [Contributing](#contributing)
- [License](#license)

## Project Overview
A weather prediction microservice which provides maximum – minimum temperatures for next 3 days for a city as input  and show relevant messages.
##Features of the microservice
- **backendService**: Contains REST API controllers which fetch relevant datas and parse the data into information to be displayed. Implementation 

REST Controllers:

REST controllers, annotated with @RestController, @RequestMapping handle incoming HTTP requests and providing responses.
Highlight any path variables, request parameters, or request bodies used in your controller methods.

Service structure:
Service encapsulates the business logic and acts as intermediary with rest controllers and data points.

Service Implementation :
Implementation classes actually provide the logic of service interfaces

DTOs (Data transfer Objects)/ model/ entities

Data is passed between services and controllers in form of dtos which are defined for different models.

- **UI Results**: An implementation of html based web pages to take input data from user and display the relevant output.
- **Containerization**: Containerized microservice using docker. Created a docker file for the same.
- **CI-CD**: Implemented CI-CD via Jenkins file




## Structure

Following is the structure of project:
- **controllers**: Contains REST API controllers.
- **service**: Defines service interfaces.
- **serviceImpl**: Implements service interfaces.
- **model**: Includes entity classes.
- **dockerFile**
-**resources**: Contains various templates for like result template, error template, etc
-**JenkinsFile**



## Sequence Diagram

 


## Installation
-** Clone the repository**:
git clone https://github.com/Anushka25032000/weather.git

Navigate to the project directory
cd your-repo

- **Via Docker**: Install any docker in the local like rancher desktop.
Run command ‘docker build DockerFile -t weather-app .’
Run command to deploy ‘docker run -p 8080:8080 -d weather-app’
Service comes up on port 8080
- **Local set up**: Required: java 17



![image](https://github.com/Anushka25032000/weather/assets/157974234/688fd4b5-d294-429b-a434-1386e6ecb00f)
