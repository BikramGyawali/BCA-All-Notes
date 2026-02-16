<?php

interface sum {
public	function add();
}
class twonum implements sum{
	private $a ,$b;
function __construct($a,$b){
	$this->a=$a;
	$this->b=$b;
}
public function add(){
	$c= $this->a+$this->b;
	echo "The sum of  {$this->a} + {$this->b} = {$c} <br> ";

}
}
class threenum implements sum{
	private $a ,$b,$c;
  function __construct($a,$b,$c){
	$this->a=$a;
	$this->b=$b;
	$this->c=$c;
}
 public function add(){
	$d= $this->a+$this->b+$this->c;
	echo "The sum of  {$this->a} + {$this->b} + {$this->c}= {$d}";

}

}

$two= new twonum(10,20);
$three= new threenum(10,20,2);
$two->add();
$three->add()
?>
