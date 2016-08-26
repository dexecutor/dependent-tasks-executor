# Dexecutor

[![Join the chat at https://gitter.im/dexecutor/dependent-tasks-executor](https://badges.gitter.im/dexecutor/dependent-tasks-executor.svg)](https://gitter.im/dexecutor/dependent-tasks-executor?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge&utm_content=badge)
[![Build Status](https://travis-ci.org/dexecutor/dependent-tasks-executor.svg?branch=master)](https://travis-ci.org/dexecutor/dependent-tasks-executor)
[![Coverage Status](https://coveralls.io/repos/github/dexecutor/dependent-tasks-executor/badge.svg?branch=master)](https://coveralls.io/github/dexecutor/dependent-tasks-executor?branch=master)
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.github.dexecutor/dependent-tasks-executor/badge.svg)](https://maven-badges.herokuapp.com/maven-central/com.github.dexecutor/dependent-tasks-executor)
[![Dependency Status](https://www.versioneye.com/user/projects/57bd71da69d9490042f72a7e/badge.svg?style=flat-square)](https://www.versioneye.com/user/projects/57bd71da69d9490042f72a7e)
[![Gitter](https://badges.gitter.im/dexecutor/dependent-tasks-executor.svg)](https://gitter.im/dexecutor/dependent-tasks-executor?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge)

Executing dependent tasks in a reliable way, is made so easy that even your grandma can do it.

Refer [wiki](https://github.com/dexecutor/dependent-tasks-executor/wiki) or [Project Web site](https://dexecutor.github.io/) for more Details.

## License

Dexecutor is licensed under **Apache Software License, Version 2.0**.

## News

* Version **0.0.4** released on 08/25/2016.
* Version **0.0.3** released on 08/23/2016.
* Version **0.0.2** released on 08/21/2016.
* Version **0.0.1** released on 08/20/2016.


## Maven Repository

Dexecutor is deployed at sonatypes open source maven repository. You may use the following repository configuration (if you are interested in snapshots)

```xml
<repositories>
     <repository>
         <id>dexecutor-snapshots</id>
         <snapshots>
             <enabled>true</enabled>
         </snapshots>
         <url>https://oss.sonatype.org/content/groups/public/</url>
     </repository>
</repositories>
```
This repositories releases will be synched to maven central on a regular basis. Snapshots remain at sonatype.

Alternatively you can  pull Dexecutor from the central maven repository, just add these to your pom.xml file:
```xml
<dependency>
  <groupId>com.github.dexecutor</groupId>
  <artifactId>dependent-tasks-executor</artifactId>
  <version>0.0.4</version>
</dependency>
```

## BUILDING from the sources

As it is maven project, buidling is just a matter of executing the following in your console:

	mvn package

This will produce the dependent-tasks-executor-VERSION.jar file under the target directory.

## Support
If you need help using Dexecutor feel free to drop an email or create an issue in github.com (preferred)

## Contributions
To help Dexecutor development you are encouraged to provide 
* Suggestion/feedback/Issue
* pull requests for new features


	
	
