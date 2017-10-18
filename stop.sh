#!/bin/bash

echo "finaliza y elimina contenedor!"

docker stop $(docker ps -a -q --filter ancestor=ojcarrillo/modelado2017_tarea1 --format="{{.ID}}")

echo "adios!"

exit
