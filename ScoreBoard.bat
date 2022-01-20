@ECHO OFF 
:: This batch file runs bownlingscore program onn windows.
TITLE BownlingScore
ECHO Please wait... Creating and running container.
docker build -t my-java-app .

cls
docker run -it --rm --name my-running-app my-java-app
PAUSE