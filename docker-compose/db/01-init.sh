#! /bin/bash
set -e
export PGPASSWORD=$POSTGRES_PASS;
cd /home
psql -U $POSTGRES_USER -d $POSTGRES_DB -a -f 01-init.sql
psql -U $POSTGRES_USER -d $APP_DB_NAME -a -f 02-init.sql
export PGPASSWORD=$APP_DB_FLYWAY_USER_PASS;
psql -U $APP_DB_FLYWAY_USER -d $APP_DB_NAME -a -f 03-init.sql