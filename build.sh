mvn clean
mvn package
echo "--------Exam1-----------"
java -jar Exam1/target/Exam1.jar
echo "--------Exam2-----------"
java -cp Exam2/target/Exam2.jar TCPServer
java -cp Exam2/target/Exam2.jar TCPClient
echo "--------Exam3-----------"
java -jar Exam3/target/Exam3.jar