<?php
	session_start();
?>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta name="description" content="Cyrus Shrestha">
	<meta name="keywords" content="ShankarJung">
	<meta name="viewport" content="width=device-width, initial-scale=1" />
	<link href= "style.css" rel= "stylesheet" type= "text/css">
	<link rel="icon" type="image/gif/png" href="img\kamaaulnb.png">
	<title>Kamaau - Freelancing Now In Nepal</title>
</head>

<body>
	<div class="main">
		<div class="container">
			<div class="navbar">
				<div class="logo">
					<a href="index.php">
					<img src="img/kamaaul.PNG" alt="Kamaau Nepal"></div>
				<div class="menu">
						<?php
						if (isset($_SESSION['userId'])) {
							echo '<ul>
									<li><form action="includes/logout.inc.php" method="POST">
										<button type="submit" name="logout-submit">Logout</button>
										</form>
									</li>
								</ul>';
						}
						else {
							echo '<ul>
									<li><a href="index.php">HOME</a></li>
									<li><a href="signup.php" class="btn">Sign&nbsp;Up</a></li>
								</ul>';
						}
					?>
					
				</div>
			</div>

			