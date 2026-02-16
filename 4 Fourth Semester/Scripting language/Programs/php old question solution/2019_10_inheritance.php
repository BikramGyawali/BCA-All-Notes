<?php
class Employee{
	protected $name;
	protected $address;
	
	 function setName($n){
  $this->name=$n;
	}
	 function  setAddress($a){
		$this->address=$a;
	}
}

class Permanent extends Employee{
	private $salary;
	private $post;
	 function setSalary($s){
		$this->salary=$s;
	}
	 function setPost($p){
		$this->post=$p;
}
	 function  displayAll(){
		echo "Hello ".$this->name." from ".$this->address." post ".$this->post." salary ".$this->salary;
	}
}

$obj=new Permanent();
$obj->setName("Bikram");
$obj->setAddress("Ktm");
$obj->setSalary(1000.33);
$obj->setPost("Developer");
$obj->displayAll();

?>