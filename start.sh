./gradlew clean build
docker compose down
docker rmi -f springboot-mongo
docker compose up