#!/bin/bash

timestamp() {
  date +'%Y-%m-%d'
}


[ "$(ls -A ./build/libs)" ] && echo "Clearing Old Builds"
rm -f ./build/libs/*
chmod +x ./gradlewLinux
./gradlewLinux setupDecompWorkspace --refresh-dependencies build
mkdir -p ./builds
 if test -f "./builds/TiM-Experimental-$(timestamp).jar"; then
  if test -f "./builds/TiM-Experimental-$(timestamp)-REV2.jar"; then
   if test -f "./builds/TiM-Experimental-$(timestamp)-REV3.jar"; then
    mv ./build/libs/*.jar ./builds/TiM-Experimental-$(timestamp)-REV4.jar
   else
    mv ./build/libs/*.jar ./builds/TiM-Experimental-$(timestamp)-REV3.jar
   fi
  else
   mv ./build/libs/*.jar ./builds/TiM-Experimental-$(timestamp)-REV2.jar
  fi
 else
  mv ./build/libs/*.jar ./builds/TiM-Experimental-$(timestamp).jar
 fi
exit
