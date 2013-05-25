Simple OSGi demo with a maven-built bundle
==========================================

Clone this project and build both projects with `mvn clean install`.

Start OSGi container, e.g. [karaf](http://karaf.apache.org/) (./bin/karaf)

Install the built bundle `osgi:install file:/<path>/provider/target/provider-1.0-SNAPSHOT.jar`
Install the built bundle `osgi:install file:/<path>/consumer/target/consumer-1.0-SNAPSHOT.jar`

Start and stop it with `osgi:start <bundleId>` and `osgi:stop <bundleId>`