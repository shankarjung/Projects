<?php

	require 'header.php';
?>

	<main>
			
				<?php
					if (isset($_SESSION['userId'])) {
						echo '<div class="user-panel">
						<h1 class="login-status"> You are logged in!</h1>
						</div>';
					}
					else {
						echo '<div class="main-content">
						<div class="text">
							<h1> Login, </h1>
							<form action="includes/login.inc.php" method="POST">
								<input type="text" name="mailuid" placeholder="Username/E-mail">
								<input type="password" name="pwd" placeholder="Password">
								<button type="submit" name="login-submit">Login</button>
								</form>
								<br><br><br><br>
		
							<div class="description">
								Access your Kamaau account and start your freelancing<br />journey. Either hire someone to do the job or get yourself<br />hired, the choice is up to you.<br>Earn while you do what you like the most.
							</div>
							<br>
							<a href="" class="btn-rounded">Learn More?</a>
						</div>
						<div class="banner"><img src="img/2.png"></div>
					</div>';
					}
				?>
				
				</div>
			</div>
	</main>


<?php
	require 'footer.php';
?>