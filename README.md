## Git SHA-1 Demo

There are several way in which a Java project can publish its current Git SHA1:

* As an entry in the manifest file
* As a property in a properties file
* As a Java method call
* As a specific resource in a web service
* As a part of the DOM (e.g. as a html comment in the index.html file) in a web project

For more information, read the blog post at [http://blog.jayway.com/2012/04/07/continuous-deployment-versioning-and-git/]
(http://blog.jayway.com/2012/04/07/continuous-deployment-versioning-and-git/)


## Getting started

Open a terminal and execute the following steps:

1. Clone the project

        git clone git://github.com/matsev/git-build-number.git

2. Change directory

        cd git-build-number

3. Execute the project as a web app

        mvn jetty:run-war

4. Browse to [http://localhost:8080/](http://localhost:8080/)