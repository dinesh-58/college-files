create user john identified by "asdf";

select username from dba_users where account_stadocker-oracletus = 'OPEN';

grant create SESSION to john; -- allow logging in / connecting

grant select, update, insert on lab_customer to john;
revoke insert on lab_customer from john;

create role developer;
grant developer to john;