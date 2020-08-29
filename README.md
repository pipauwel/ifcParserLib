# IFC Parser Lib (v.0.2)
This Ifc Parser Library is a simple view model (VM) library able to store EXPRESS and IFC data in memory. It does not include a parser; yet, the EXPRESStoOWL and IFCtoRDF libraries rely on this library for storing their data. IFC information can be handled and transformed afterward. It is not possible to read or publish IFC files with this library. This library originates to a large extent from the work of [Jyrki Oraskari](https://github.com/jyrkioraskari/).

## How to use this code?
It is not advised to run this code directly. Instead, you are advised to load this library in your Java project using [Maven](https://maven.apache.org/), enabling you to store and use IFC data in your Java projects.

If you plan to re-use this code, you are advised to do this through maven. The code is published as a Maven module in Maven Central (https://search.maven.org/artifact/com.github.pipauwel/IfcParserLib). Therefore, you can directly include and use this code by adding the following lines to your `pom.xml` file.

```
<dependency>
  <groupId>com.github.pipauwel</groupId>
  <artifactId>ifcParserLib</artifactId>
  <version>0.2</version>
</dependency>
```

## Dependencies
There are no dependencies in this code.

## Access to source code
All source code is accessible through the [IfcParserLib GitHub repository](https://github.com/pipauwel/IfcParserLib/) in the master branch. Anyone is free to fork the repository, make changes, and potentially suggest updates and changes through Git pull requests.

## Issues
Issues can be posted in https://github.com/pipauwel/IfcParserLib/issues.

## Changes
A change log is available at [CHANGES.md](CHANGES.md). 

## Java API Documentation
The API Documentation is very limited, yet it is available at:
https://pipauwel.github.io/ifcParserLib/0.2/apidocs/
API documentation is available also for the older versions.

## Older versions
A previous version of this code is available:
- Version 0.1 (6 Jun. 2017): https://github.com/pipauwel/ifcParserLib/releases/tag/ifcParserLib-0.1

## License
Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0.

See License details at [LICENSE](LICENSE).

## Contact
Want to know more? Contact:

Pieter Pauwels  
Eindhoven University of Technology  
p.pauwels@tue.nl  
