[IMAGE: TU logo]
.LP
\f[B]TRIBHUVAN UNIVERSITY\f[R]
.PP
\f[B]FACULTY OF HUMANITIES AND SOCIAL SCIENCE\f[R]
[IMAGE: hcoe logo]
.LP
\f[B]HIMALAYA COLLEGE OF ENGINEERING\f[R]
[IMAGE: 3 bars]
.LP
\f[B]Lab Report Title: Basic SQL queries\f[R]
.PP
Submitted by: Submitted to:
.PP
Roll number: Department of BCA
.PP
BCA 4th Semester Submission Date:
.SH 1
OBJECTIVES
.pdfhref O 1 "OBJECTIVES"
.pdfhref M "objectives"
.IP \[bu] 3
To learn basic SQL operations through DDL, DML & DQL commands
.IP \[bu] 3
To work with Microsoft\[cq]s SQL Server relational database
.SH 1
THEORY
.pdfhref O 1 "THEORY"
.pdfhref M "theory"
.LP
Databases are an integral part of the IT industry, allowing developers
to organize large amounts of data & perform operations.
This data may be customer info, inventory records & much more.
Database Management Systems (DBMS) are software allowing us to interact
with, view & modify databases.
.PP
There are different implementations of DBMS, with Relational being a
popular and easy-to-use one.
Data is organized into relations(tables) with columns representing
attributes & rows representing different records.
For the purposes of this lab, we used SQL Server, Microsoft\[cq]s own
RDBMS.
Similar results can be achieved with other RDBMSs as they all use the
Structured Query Language(SQL) programming language.
.PP
SQL commands are categorized based on their function.
The 3 basic categories we learned were:
.IP \[bu] 3
Data Definition Language (DDL): to create, modify database objects, >
schema
.IP \[bu] 3
Data Manipulation Language (DML): to add, modify data inside objects
.IP \[bu] 3
Data Query Language (DQL): to retrieve data
.SH 1
LAB WORK
.pdfhref O 1 "LAB WORK"
.pdfhref M "lab-work"
.LP
Create a database HCOE2077 & create tables with the following schema:
.br
- Student (id, name, rn, batch)
.br
- Teacher (tid, name, faculty)
.IP " 1." 4
Insert any 5 records in each table
.IP
.nf
\f[C]
\*[KeywordTok "use"]\*[NormalTok " HCOE2077"]

\*[KeywordTok "insert"]\*[NormalTok " "]\*[KeywordTok "into"]\*[NormalTok " student("]\*[KeywordTok "id"]\*[NormalTok ", name, rn, batch) "]\*[KeywordTok "values"]\*[NormalTok "("]\*[DecValTok "1"]\*[NormalTok ", "]\*[StringTok "\[aq]Sujal\[aq]"]\*[NormalTok ", "]\*[DecValTok "1"]\*[NormalTok ", "]\*[DecValTok "2077"]\*[NormalTok "),"]
\*[NormalTok "("]\*[DecValTok "2"]\*[NormalTok ", "]\*[StringTok "\[aq]Rajan\[aq]"]\*[NormalTok ", "]\*[DecValTok "2"]\*[NormalTok ", "]\*[DecValTok "2077"]\*[NormalTok "),"]
\*[NormalTok "("]\*[DecValTok "3"]\*[NormalTok ", "]\*[StringTok "\[aq]Anish\[aq]"]\*[NormalTok ", "]\*[DecValTok "3"]\*[NormalTok ", "]\*[DecValTok "2075"]\*[NormalTok "),"]
\*[NormalTok "("]\*[DecValTok "4"]\*[NormalTok ", "]\*[StringTok "\[aq]Chandra\[aq]"]\*[NormalTok ", "]\*[DecValTok "4"]\*[NormalTok ", "]\*[DecValTok "2076"]\*[NormalTok "),"]
\*[NormalTok "("]\*[DecValTok "5"]\*[NormalTok ", "]\*[StringTok "\[aq]Adish\[aq]"]\*[NormalTok ", "]\*[DecValTok "5"]\*[NormalTok ", "]\*[DecValTok "2076"]\*[NormalTok ")"]

\*[KeywordTok "insert"]\*[NormalTok " "]\*[KeywordTok "into"]\*[NormalTok " teacher(tid, name, faculty) "]\*[KeywordTok "values"]\*[NormalTok "("]\*[DecValTok "1"]\*[NormalTok ", "]\*[StringTok "\[aq]Mukunda\[aq]"]\*[NormalTok ", "]\*[StringTok "\[aq]BCA\[aq]"]\*[NormalTok "),"]
\*[NormalTok "("]\*[DecValTok "1"]\*[NormalTok ", "]\*[StringTok "\[aq]Raj\[aq]"]\*[NormalTok ", "]\*[StringTok "\[aq]BCA\[aq]"]\*[NormalTok "),"]
\*[NormalTok "("]\*[DecValTok "1"]\*[NormalTok ", "]\*[StringTok "\[aq]Bipul\[aq]"]\*[NormalTok ", "]\*[StringTok "\[aq]BIT\[aq]"]\*[NormalTok "),"]
\*[NormalTok "("]\*[DecValTok "1"]\*[NormalTok ", "]\*[StringTok "\[aq]Nikesh\[aq]"]\*[NormalTok ", "]\*[StringTok "\[aq]BIT\[aq]"]\*[NormalTok "),"]
\*[NormalTok "("]\*[DecValTok "1"]\*[NormalTok ", "]\*[StringTok "\[aq]Rajesh\[aq]"]\*[NormalTok ", "]\*[StringTok "\[aq]BSc. CSIT\[aq]"]\*[NormalTok ")"]
\f[]
.fi
.IP " 2." 4
Display all records
.IP
.nf
\f[C]
\*[KeywordTok "select"]\*[NormalTok " "]\*[OperatorTok "*"]\*[NormalTok " "]\*[KeywordTok "from"]\*[NormalTok " student"]
\*[KeywordTok "select"]\*[NormalTok " "]\*[OperatorTok "*"]\*[NormalTok " "]\*[KeywordTok "from"]\*[NormalTok " teacher"]
\f[]
.fi
.LP
Output: [IMAGE: 1-output]
.br
Output: [IMAGE: 1-output]
.IP " 3." 4
Display only id & name from student table
.IP " 4." 4
Display name & faculty from teacher
.IP
.nf
\f[C]
\*[KeywordTok "use"]\*[NormalTok " HCOE2077"]
\*[KeywordTok "select"]\*[NormalTok " "]\*[KeywordTok "id"]\*[NormalTok ", name "]\*[KeywordTok "from"]\*[NormalTok " student"]
\*[KeywordTok "select"]\*[NormalTok " name, faculty "]\*[KeywordTok "from"]\*[NormalTok " teacher"]
\f[]
.fi
.LP
Output: [IMAGE: 3-4-output]
.IP " 5." 4
Remove `rn' attribute from student
.IP
.nf
\f[C]
\*[KeywordTok "alter"]\*[NormalTok " "]\*[KeywordTok "table"]\*[NormalTok " student "]\*[KeywordTok "drop"]\*[NormalTok " "]\*[KeywordTok "column"]\*[NormalTok " rn"]
\f[]
.fi
.IP " 6." 4
Add `salary' attribute to teacher relation
.IP
.nf
\f[C]
\*[KeywordTok "alter"]\*[NormalTok " "]\*[KeywordTok "table"]\*[NormalTok " teacher "]\*[KeywordTok "add"]\*[NormalTok " salary "]\*[DataTypeTok "int"]
\f[]
.fi
.IP " 7." 4
Copy \f[C]id\f[R] & \f[C]name\f[R] attribute to new relation
\f[C]info_student\f[R]
.IP
.nf
\f[C]
\*[KeywordTok "select"]\*[NormalTok " "]\*[KeywordTok "id"]\*[NormalTok ", name "]\*[KeywordTok "into"]\*[NormalTok " info_student "]\*[KeywordTok "from"]\*[NormalTok " student "]
\*[KeywordTok "select"]\*[NormalTok " "]\*[OperatorTok "*"]\*[NormalTok " "]\*[KeywordTok "from"]\*[NormalTok " info_student"]
\f[]
.fi
.LP
Output: [IMAGE: 7-output]
.IP " 8." 4
Delete all contents from \f[C]info-student\f[R] relation
.IP
.nf
\f[C]
\*[KeywordTok "delete"]\*[NormalTok " "]\*[KeywordTok "from"]\*[NormalTok " info_student"]
\f[]
.fi
.SH 2
CONCLUSION
.pdfhref O 2 "CONCLUSION"
.pdfhref M "conclusion"
.LP
Thus, we were introduced to using databases.
We learned to create relations, store data in them, & modify both tables
& their data using appropriate SQL commands.
