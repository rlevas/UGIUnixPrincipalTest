# UGIUnixPrincipalTest
Tests obtaining the user's identity based on the acting user.  

The default logging level is set to **DEBUG** and the logging level of the classes in the 
**org.apache.hadoop.security** packages is set to **TRACE** inorder to help debug any potential issues.
  

### Build

    mvn clean package
  

### Execute
  
    ${JAVA_HOME}/bin/java -jar UGIUnixPrincipalTest-assembly.jar

##### Example 
        
        /usr/jdk64/jdk1.8.0_112/bin/java -jar ./UGIUnixPrincipalTest-assembly.jar

    
  