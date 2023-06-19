<?php
// lab3: OOP features in PHP
class Employee {
    protected $name, $address;
    function setName($name) {
        $this->name = $name;
    }

    function setAddress($address) {
        $this->address = $address;
    }

    function __construct($name, $address) {
        $this->name = $name;
        $this->address = $address;
    }
}

class FullTimeEmployee extends Employee{
    protected $salary, $post;

    function setSalary($salary) {
        $this->salary = $salary;
    }
    function setPost($post) {
        $this->post = $post;
    }

    function displayAll() {
        echo "<pre>Name: $this->name \n";
        echo "Address: $this->address \n";
        echo "Salary: $this->salary \n";
        echo "Post: $this->post \n \n</pre>";
    }
}

$emp1 = new FullTimeEmployee('Ram', 'Koteshwor');
$emp1->setSalary(10000);
$emp1->setPost('Clerk');
$emp1->displayAll();

$emp2 = new FullTimeEmployee('Shyam', 'Suryabinayak');
$emp2->setSalary(15000);
$emp2->setPost('Accountant');
$emp2->displayAll();
