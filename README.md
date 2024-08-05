# REVERSE PROXY


I created this repository to get information abour Reverse Proxy. I aim to learn how reverse proxy works and in real time apps(such as Microservice), how they redirect the request to correct endpoints<br><br>
A reverse proxy is a server that sits between client devices and a backend server, acting as an intermediary to manage and direct requests.
It forwards client requests to the appropriate backend server and then returns the server's response to the client. 
This setup helps in load balancing, security, and caching, improving overall performance and reliability.

For example we send a request to localhost/api/users on client side, and Reverse Proxy by powered via NGINX redirect the request associated url(localhost:8080/api/users)
![image](https://github.com/user-attachments/assets/2706f221-41ab-4eae-a89d-158fed9b44c5)

To run the project,
```bash
docker build -t reverse-proxy .
docker-compose up


