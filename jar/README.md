Create an OSGi bundle using command ``jar cvfm JarToBundle-jar-1.0-SNAPSHOT-bundle.jar ./../manifest.txt JarToBundle-jar-1.0-SNAPSHOT.jar`` on target folder.
 
c - Create Jar
v - Verbose
f - File Name
m - Manifest File to use

When you have to convert packaging from pom to bundle, add ``maven-bundle-plugin`` and also, use ``mvn install`` to create a bundle under target directory.
