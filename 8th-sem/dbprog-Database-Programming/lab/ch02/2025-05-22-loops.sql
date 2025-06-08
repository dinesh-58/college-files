DECLARE
  grade CHAR(1);
BEGIN
  grade := 'B';

  CASE grade
    WHEN 'A' THEN DBMS_OUTPUT.PUT_LINE('Excellent');
    WHEN 'B' THEN DBMS_OUTPUT.PUT_LINE('Very Good');
    WHEN 'C' THEN DBMS_OUTPUT.PUT_LINE('Good');
    WHEN 'D' THEN DBMS_OUTPUT.PUT_LINE('Fair');
    WHEN 'F' THEN DBMS_OUTPUT.PUT_LINE('Poor');
    ELSE DBMS_OUTPUT.PUT_LINE('No such grade');
  END CASE;
END;/

DECLARE
i number := 0;
begin
    loop
        DBMS_OUTPUT.PUT_LINE(i);
        i := i+1;
        if i > 4 then exit;
        -- exit when i > 4;
        end if;
    end loop;
end;

declare 
temp char(10);
begin
    temp := :temp;
    dbms_output.put_line(temp);
end;
