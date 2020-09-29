<?php

$servername = "localhost"; # server currently running on XAMPP --> localhost
$dBUsername = "root"; # local server username --> root
$dBPassword = ""; # not password required in XAMPP
$dBName = "loginsystem"; # database name in MySQL --> loginsystem

$conn = mysqli_connect($servername,$dBUsername,$dBPassword, $dBName);

if (!$conn) {
	die("Connection failed: ".mysqli_connect_error());
}