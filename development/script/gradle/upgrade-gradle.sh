#!/usr/bin/env bash
if [ -z "$1" ]; then
  echo "No version supplied"
  exit 1
fi

# Upgrade the wrapper properties file
./gradlew wrapper --gradle-version "$@"

# Download a new version
./gradlew wrapper --gradle-version "$@"
