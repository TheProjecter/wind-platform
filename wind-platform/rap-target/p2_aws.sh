#!/bin/bash
java -jar /home/ubuntu/eclipse/plugins/org.eclipse.equinox.launcher_*.jar -console -consolelog -application org.eclipse.equinox.p2.publisher.EclipseGenerator \
   -source "/var/lib/hudson/jobs/Wind Target Runtime/workspace/rap-target/eclipse" \
   -metadataRepository "file:/var/lib/hudson/jobs/Wind Target Runtime/workspace/rap-target/p2/repo" \
   -metadataRepositoryName "Wind Target Runtime" \
   -artifactRepository "file:/var/lib/hudson/jobs/Wind Target Runtime/workspace/rap-target/p2/repo" \
   -artifactRepositoryName "Wind Target Runtime" \
   -publishArtifacts \
   -publishArtifactRepository \
   -noDefaultIUs \
   -vmargs -Xmx256m \
   -nosplash \