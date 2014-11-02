<!DOCTYPE html>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/bootstrap/3.3.0/css/bootstrap.min.css">
<link rel="stylesheet" href="/css/style.css">
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
<script language="javascript"> 
    function DoPost(place){
        $.post("/mark", { cell: place } );
        $(location).attr('href',"/");
    }
</script>
<html>
	<head>
		<title>Tic Tac Toe</title>
	</head>
	<body>
		<div class="container">
			<div class="row">
				<div class="col-md-12"></br></div>
			</div>
			<div class="row">
				<div class="col-md-4"></div>
				<div class="col-md-4">
					<h1 class="text-center">Tic Tac Toe</h1>
					<h2 class="text-center">This is better than diet coke</h2>
				</div>
				<div class="col-md-4"></div>
			</div>
			<div class="row"></br></div>
			<div class="row">
				<div class="col-md-4"></div>
				<div class="col-md-3 col-md-offset-1">
					<table class="tic">
						<tr>
							<td id="0" class="col-md-4" onclick="DoPost(0)">${zero}</td>
							<td id="1" class="col-md-4" onclick="DoPost(1)">${one}</td>
							<td id="2" class="col-md-4" onclick="DoPost(2)">${two}</td>
						</tr>
						<tr>
							<td id="3" class="col-md-4" onclick="DoPost(3)">${three}</td>
							<td id="4" class="col-md-4" onclick="DoPost(4)">${four}</td>
							<td id="5" class="col-md-4" onclick="DoPost(5)">${five}</td>
						</tr>		
						<tr>
							<td id="6" class="col-md-4" onclick="DoPost(6)">${six}</td>
							<td id="7" class="col-md-4" onclick="DoPost(7)">${seven}</td>
							<td id="8" class="col-md-4" onclick="DoPost(8)">${eight}</td>
						</tr>
					</table>
				</div>
				<div class="col-md-4"></div>
			</div>
			<div class="row">
				<div class="col-md-4"></div>
				<div class="col-md-4">
					<h3>thanks for playing</h3>
					<h5>I love you</h5>
				</div>
				<div class="col-md-4"></div>
			</div>
			<div class="row">
				<div class="col-md-4"></div>
				<div class="col-md-4">
					<button class="btn btn-info" id="play">Play</button>
					<button class="btn btn-warning" id="restart">Restart</button>
				</div>
				<div class="col-md-4"></div>
			</div>
		</div>
	</body>
</html>
