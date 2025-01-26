-- view all tablespace
Select tablespace_name, status, contents
from dba_tablespaces;

-- view datafiles
select tablespace_name, file_id, file_name, bytes, status 
from dba_data_files;

-- view free space in tablespace
select tablespace_name , bytes
from dba_free_space
where tablespace_name='USERS';

-- create tablespace
CREATE TABLESPACE testy_tablespace
DATAFILE 'C:\oracleBase\oradata\HCOE_DEMO\DATAFILE\testy_data.dbf' 
SIZE 1M
AUTOEXTEND ON
NEXT 10M
MAXSIZE UNLIMITED;