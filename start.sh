curl http://localhost:$1/shutdown
java -jar service/target/simpleWebApp-1.0-SNAPSHOT-jar-with-dependencies.jar $1 &
exit 0
