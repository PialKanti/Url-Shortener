#!/bin/sh

exec java \
  -javaagent:/src/resources/newrelic/newrelic.jar \
  -Dnewrelic.config.file=/src/resources/newrelic/newrelic.yml \
  -Dnewrelic.config.process_host.display_name=${INSTANCE_NAME} \
  -jar app.jar
