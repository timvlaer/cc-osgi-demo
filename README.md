Simple OSGi demo with a maven-built bundle
==========================================

Clone this project and build it with `mvn clean install`.

Start OSGi container, e.g. [karaf](http://karaf.apache.org/) (./bin/karaf)

Install the built bundle `osgi:install file:/<path>/osgi_demo/target/osgi_demo-1.0-SNAPSHOT.jar`

Start and stop it with `osgi:start <bundleId>` and `osgi:stop <bundleId>`