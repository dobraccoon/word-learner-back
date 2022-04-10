CREATE DATABASE wordlearnerdb;
REVOKE ALL ON DATABASE wordlearnerdb FROM PUBLIC;
REVOKE CREATE ON SCHEMA public FROM PUBLIC;
CREATE ROLE ddl_wl_role WITH ENCRYPTED PASSWORD 'wlPWD!32';
GRANT
    CONNECT
    ON DATABASE wordlearnerdb TO ddl_wl_role;
GRANT
    TEMPORARY
    ON DATABASE wordlearnerdb TO ddl_wl_role;
CREATE ROLE dml_wl_role WITH ENCRYPTED PASSWORD 'wlPWD!32';
GRANT
    CONNECT
    ON DATABASE wordlearnerdb TO dml_wl_role;
GRANT
    TEMPORARY
    ON DATABASE wordlearnerdb TO dml_wl_role;

