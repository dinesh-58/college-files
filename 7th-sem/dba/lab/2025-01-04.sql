-- PL/SQL (Procedural Langauge) 
-- basically regular programming inside sql
-- used back in the day to create stored procedures to get data from backend.
-- nowadays replaced by APIs in other programming languages?
SET SERVEROUTPUT ON; -- needed to print to console

BEGIN
    dbms_output.put_line('This string breaks here.');
END;
/ -- delimiter used to signify end of above block

DECLARE
    var_i INT;
BEGIN
    var_i := 1; -- assign value
    var_i := :user_input;
    IF var_i > 5 THEN
        dbms_output.put_line('greater than 5');
    ELSE
        dbms_output.put_line('less than 5');
    END IF;
END;

-- function to concat first name and last name
CREATE OR REPLACE FUNCTION concat_full_name(first_name IN VARCHAR2, last_name IN VARCHAR2) 
RETURN VARCHAR2 
AS
BEGIN
    RETURN first_name || ' ' || last_name;
END;
/

select concat_full_name (first_name,last_name) from lab_customer where customer_id=1;
