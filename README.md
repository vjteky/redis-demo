# redis-demo

docker run --name redis-dev --publish=6379:6379 -d redis

docker exec -it redis-dev sh (then run redis-cli to activate cli)

. Some commands -> 
				ping  
				set name pnap
				get name
				
https://examples.javacodegeeks.com/spring-boot-with-redis-tutorial/
