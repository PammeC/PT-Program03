# PT-Program03

# Simple Java Web Server

This is a basic web server implemented in Java that displays a "Hello World" message when accessed through the browser.

## Description

The project consists of a simple web server that:
- Listens on port 8080
- Automatically opens the default browser when started
- Responds to all HTTP requests with a basic HTML page displaying "Hello World"

## Prerequisites

- Java JDK 23 or higher
- Docker (optional, to run in container)
- Git (to clone the repository)

## Installation

1. Clone the repository:
```bash
git clone https://github.com/PammeC/PT-Program03.git
cd PT-Program03
```

2. Compile the source code:
```bash
javac WebServer.java
```

## Execution

### Method 1: Directly with Java
```bash
java WebServer
```

### Method 2: Using Docker
1. Build the image:
```bash
docker build -t program03 .
```

2. Run the container:
```bash
docker run -p 8080:8080 program03
```

## Project Structure

```
.
├── README.md
├── WebServer.java # Server source code
├── WebServer.class # Compiled file
└── Dockerfile # Configuration for Docker
```

### Deployment on different platforms

You can deploy this application on several hosting platforms, such as:

- Heroku
- Digital Ocean
- Railway
- Vercel
- Laravel Cloud
- Render

The application is currently deployed on Render and can be accessed at the following link:

https://pt-program03.onrender.com

## Features

- Basic HTTP server
- Simple HTML response
- Automatic browser opening on startup
- Basic error handling
- Containerization with Docker
