#!/bin/bash

mvn clean;
mvn -T 4 -DskipTests install;
