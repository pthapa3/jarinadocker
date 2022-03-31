This demo repo shows how to run the jar inside a docker container

PreRequisites:
Install Docker
https://docs.docker.com/get-docker/

Running the jar in docker container:
Use gradle wrapper OR you can download gradle

./gradlew -i clean dockerRun

Check the container running:
docker container ls

Check the container logs and make sure your jar is running:
docker logs --follow {containerID}