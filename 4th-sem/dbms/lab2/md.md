Create the relations below:

employee(eid, ename, dateOfEmployment, salary)
...
issue(iid, bname, dateOfIssue)

Only *employee* can *issue* a book. to show this relation, we make `eid` a foreign key in issue table using `iid`.

`isbn` in bookList & `bid` in Book are same so foreign keys.