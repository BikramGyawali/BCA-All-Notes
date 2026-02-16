<?php
 class Person{
	public $name;
	 public function parent(){
		echo "From Parent class <br>";
	 }
 }
class student extends Person {
	public function sname(){
		echo "Welcome  " .$this->name;
	}
}

class employer extends Person {
	public function mname(){
		echo "Welcome Employe " .$this->name;
	}
}
$emp =new employer();
$emp->name="Bikram ";
$emp->mname();
$emp->parent();

$stu=new student();
$stu->name="Hari";
$stu->sname();
$emp->parent();
?>