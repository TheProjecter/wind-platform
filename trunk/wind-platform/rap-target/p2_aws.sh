#!/bin/bash
/home/ubuntu/eclipse/eclipse  -application org.eclipse.equinox.p2.publisher.EclipseGenerator \
   -source /Volumes/MacintoshHD2/dev/java/workspaces/wind-rap/rap-target/eclipse \
   -metadataRepository file:/Volumes/MacintoshHD2/dev/java/workspaces/wind-rap/rap-target/p2/repo \
   -metadataRepositoryName "Wind Target Runtime" \
   -artifactRepository file:/Volumes/MacintoshHD2/dev/java/workspaces/wind-rap/rap-target/p2/repo \
   -artifactRepositoryName "Wind Target Runtime" \
   -publishArtifacts \
   -publishArtifactRepository \
   -noDefaultIUs \
   -vmargs -Xmx256m \
   -nosplash \