<?php
	require "header.php";
?>
	<main>
	<div class="signup-container">
		<div class="left-image"><img src="img/11.png"></div>


		<div class="right-form">
			<h2>Sign Up for a Kamaau Account</h2>
			<p>Create Your Account. <b>It's Free!</b></p>
			
			<?php
				if (isset($_GET['error'])) {
					if ($_GET['error'] == "emptyfields") {
						echo '<p class="signuperror">Fill in all fields!</p>';
					}
					elseif ($_GET['error'] == "invaliduidmail") {
						echo '<p class="signuperror">Invalid username and e-mail!</p>';
					}
					elseif ($_GET['error'] == "invaliduid") {
						echo '<p class="signuperror">Invalid username!</p>';
					}
					elseif ($_GET['error'] == "invalidmail") {
						echo '<p class="signuperror">Invalid e-mail!</p>';
					}
					elseif ($_GET['error'] == "passwordcheck") {
						echo '<p class="signuperror">Passwords do not match!</p>';
					}
					elseif ($_GET['error'] == "usertaken") {
						echo '<p class="signuperror">Username is already taken!</p>';
					}
				}
				else if (isset($_GET['signup'])) {
					if ($_GET['signup'] == "success") {
					echo '<p class="signupsuccess">Signup successful!</p>';
				}
				}
			?>

			<form class="signup-form" action="includes/signup.inc.php" method="POST">
				<input type = "text" name = "uid" placeholder="Username">
				<input type = "text" name = "email" placeholder="E-mail">
				<input type = "password" name = "pwd" placeholder="Password">
				<input type = "password" name = "pwd-repeat" placeholder="Repeat Password">
				<button type = "submit" name = "signup-submit">Sign Up</button>
			</form>
			<div class="mem-already">
			<p>Already have an account?<a href="index.php" class="green"> Login here</a></p>
			</div>
		</div>
	</div>
	</main>

<?php
	require "footer.php";
?>