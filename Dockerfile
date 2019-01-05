FROM java:8-alpine
MAINTAINER Ruben Geertsema

# Create app dir
RUN mkdir -p /app

# Change working directory to app dir
WORKDIR /app

# Add app to working dir
#ADD target/wish*.jar /app/app.jar

# Expose port
EXPOSE 8080

# Container startup command
#CMD ["java", "-jar", "app.jar"]