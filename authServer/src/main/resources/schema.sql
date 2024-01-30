-- check and create a database for this server
do $$
    begin if not exists(
        select from pg_catalog.pg_database where datname='hanjam_auth_db'
    ) then perform dblink_exec(
                   'dbname=postgres', 'create database hanjam_auth_db'
                   ); end if ;
    end
    $$;

-- check if a schema exists and create if not
create schema if not exists auth_server;