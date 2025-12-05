#!/bin/bash

source "$(dirname "$0")/../common/sharedlibraries/harvester-common.sh"

# Setup
setup_environment "OpenAlex-Harvest"
setup_logging
clean_data

# Fetch phase
execute_fetch "harvester-jsonfetch" "openalex-jsonfetch.config.xml"

# Process phase
execute_translate
execute_transfer

# Update phase
perform_diff
apply_changes_to_previous
apply_changes_to_vivo

# Report
count_imports
echo "OpenAlex harvest completed successfully"
