REVOKE CREATE ON SCHEMA public FROM PUBLIC;
CREATE SCHEMA IF NOT EXISTS wordlearner;
CREATE USER flywaywluser WITH ENCRYPTED PASSWORD 'wlPWD!32';
CREATE USER appwluser WITH ENCRYPTED PASSWORD 'wlPWD!32';
GRANT
    USAGE,
    CREATE
    ON SCHEMA wordlearner TO ddl_wl_role;
GRANT
    USAGE
    ON SCHEMA wordlearner TO dml_wl_role;
GRANT ddl_wl_role TO flywaywluser;
GRANT dml_wl_role TO appwluser;
