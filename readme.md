# Project roadmap
- Create Maven project on IntelliJ.
- pom.xml - Add dependencies
    - io.rest-assured » rest-assured
    - com.fasterxml.jackson.core » jackson-databind
    - org.testng » testng
    - org.apache.commons » commons-lang3
    - org.projectlombok » lombok
    - com.github.javafaker » javafaker
- In this project we want to send post request
  https://fakerestapi.azurewebsites.net/api/v1/Authors
- Add config.properties file under "resources"
- Create utils package > ConfigurationReader class
    Add set() &  get() methods
- Create payloads package > CreateAuthorPayload class > method getCreateAuthorPayloadFromMap()
  to implement payload request body using Map
- Under utils package > RandomDataGenerator class & RandomDataTypeNames enum
  to generate random data
- Under utils package > RestUtils class > performPost(parameters)
  to send the post request
- Create fakerestapiTests package > fakerestapi class > create test case using TestNG: @Test createFakerest() method
  to perform assertions
- Create testng.xml file
- Open Edit configuration and add new Maven config file
    - give it name "MyMvnRunner"
    - add "test -Denv=beta" inside run
    - go to fakerestapi class and add System.getProperty("env")
- To run the project
    - open terminal and run this command mvn test -Denv=qa
      Note: if you are going to follow this way, you should make sure that  <maven.compiler.source> & <maven.compiler.target> in pom.xml are 11 or 1.8 not 19
    - Run from MyMvnRunner


## Definitions
- **What's enum?:** An enum is a special "class" that represents a group of constants (unchangeable variables, like final variables)