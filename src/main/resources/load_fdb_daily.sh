#!/bin/bash
# Set the necessary environment variables
export FDB_HOME=/mnt/c/Users/AMBATS/Desktop/Batchjob/FDBDailyPrice
export DATA_DIR=/mnt/c/Users/AMBATS/Desktop/Batchjob/Destinationfile
# Change to the FDB home directory
cd "$FDB_HOME"
# Run the FDB import command
./fdb_import -d "$DATA_DIR/FDB_Daily_price_updates.csv"