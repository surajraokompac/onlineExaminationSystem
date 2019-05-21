<!DOCTYPE html>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html lang="en">
<head>
<title>Bootstrap Example</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<style>
/* Remove the navbar's default margin-bottom and rounded borders */
.navbar {
	margin-bottom: 0;
	border-radius: 0;
}

/* Set height of the grid so .sidenav can be 100% (adjust as needed) */
.row.content {
	height: 450px
}

/* Set gray background color and 100% height */
.sidenav {
	padding-top: 20px;
	background-color: #f1f1f1;
	height: 100%;
}

/* Set black background color, white text and some padding */
footer {
	background-color: #555;
	color: white;
	padding: 15px;
}

/* On small screens, set height to 'auto' for sidenav and grid */
@media screen and (max-width: 767px) {
	.sidenav {
		height: auto;
	}
	.row.content {
		height: auto;
	}
}

#setQuestionLevel {
	border: 0.4px solid #ddd;
	border-radius:4px;
	top: 5px;
}

.main {
	padding: 0px;
	margin: 0px;
}

.dropdown-setlevel {
	
}
</style>
</head>
<body>

	<nav class="navbar navbar-inverse">
		<div class="container-fluid">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target="#myNavbar">
					<span class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="#">Logo</a>
			</div>
			<div class="collapse navbar-collapse" id="myNavbar">
				<ul class="nav navbar-nav">
					<li class="active"><a href="#">Home</a></li>
					<li><a href="#">About</a></li>
					<li><a id="addQuesBtn" href="#">Add Question</a></li>
					<li><a id="examBtn" href="#">Start Exam</a></li>
				</ul>
				<ul class="nav navbar-nav navbar-right">
					<li><a href="#"><span class="glyphicon glyphicon-log-in"></span>
							Login</a></li>
				</ul>
			</div>
		</div>
	</nav>

	<div class="container-fluid text-center">
		<div class="row content">
			<div class="col-sm-2 sidenav">
				<p>
					<a href="#">Link</a>
				</p>
				<p>
					<a href="#">Link</a>
				</p>
				<p>
					<a href="#">Link</a>
				</p>
			</div>
			<div class="col-sm-8 container main">
				<div id="addQuestion" class="" style="display: none">
					<h1>Add Question</h1>
					<div>
						<form:form class="form-inline" action="submitQuestion"
							commandName="questionDomain" method="post">
							<table>
								<tr>
									<td>Level of Question :</td>
									<td><form:input path="qType" /></td>
								</tr>
								<tr>
									<td colspan="2">Question :</td>
								</tr>
								<tr>
									<td colspan="2"><form:textarea path="qDescription" /></td>
								</tr>
								<tr>
									<td>Option 1 :</td>
									<td>Option 2 :</td>
								</tr>
								<tr>
									<td><form:input path="option1" /></td>
									<td><form:input path="option2" /></td>
								</tr>
								<tr>
									<td>Option 3 :</td>
									<td>Option 4 :</td>
								</tr>
								<tr>
									<td><form:input path="option3" /></td>
									<td><form:input path="option4" /></td>
								</tr>
								<tr>
									<td colspan="2">Right Ans :</td>
								</tr>
								<tr>
									<td><form:input path="rightAns" /></td>
									<td><input type="submit" value="submit" /></td>
								</tr>
							</table>
						</form:form>
					</div>
				</div>
				<div id="exam" class="col-sm-12 text-left">
					<div id="setQuestionLevel" class="col-sm-12">
						<div id="setQuestionLev">
							<div class="form-row">
								<div class="form-group col-md-12">
									<div class="col-sm-4"  style="margin-top:4px; margin-bottom:-10px">
										<select name="level" id="exampleForm2" class="form-control">
											<option>Select level</option>
											<option value="easy">Easy</option>
											<option value="medium">Medium</option>
											<option value="hard">Hard</option>
										</select>
									</div>
								</div>
							</div>

							<!-- one service should be call after select level -->

						</div>
					</div>
					<div id="questionDesc" class="col-sm-12">
						<div id="noQuetions">
							<nav aria-label="Page navigation example">
								<ul class="pagination">
									<li class="page-item"><a class="page-link" href="#"
										aria-label="Previous"> <span aria-hidden="true">&laquo;</span>
											<span class="sr-only">Previous</span>
									</a></li>
									<li class="page-item"><a class="page-link" href="#">1</a></li>
									<li class="page-item"><a class="page-link" href="#">2</a></li>
									<li class="page-item"><a class="page-link" href="#">3</a></li>
									<li class="page-item"><a class="page-link" href="#">4</a></li>
									<li class="page-item"><a class="page-link" href="#">5</a></li>
									<li class="page-item"><a class="page-link" href="#">6</a></li>
									<li class="page-item"><a class="page-link" href="#">7</a></li>
									<li class="page-item"><a class="page-link" href="#">8</a></li>
									<li class="page-item"><a class="page-link" href="#">9</a></li>
									<li class="page-item"><a class="page-link" href="#">10</a></li>
									<li class="page-item"><a class="page-link" href="#">11</a></li>
									<li class="page-item"><a class="page-link" href="#">12</a></li>
									<li class="page-item"><a class="page-link" href="#">13</a></li>
									<li class="page-item"><a class="page-link" href="#">14</a></li>
									<li class="page-item"><a class="page-link" href="#">15</a></li>
									<li class="page-item"><a class="page-link" href="#"
										aria-label="Next"> <span aria-hidden="true">&raquo;</span>
											<span class="sr-only">Next</span>
									</a></li>
								</ul>
							</nav>
						</div>
						<div id="questionD" class="container form-group">
							<!-- <div id="question" class="col-sm-12 ">
							    Question
							</div>
							<div id="option1" class="col-sm-6">o1</div>
							<div id="option2" class="col-sm-6">o2</div>
							<div id="option3" class="col-sm-6">o3</div>
							<div id="option4" class="col-sm-6">o4</div> -->
						</div>
					</div>
				</div>

			</div>
			<div class="col-sm-2 sidenav">
				<div class="well">
					<p>ADS</p>
				</div>
				<div class="well">
					<p>ADS</p>
				</div>
			</div>
		</div>
	</div>

	<footer class="container-fluid text-center">
		<p>Footer Text</p>
	</footer>
	<script type="text/javascript">
		$(document).ready(function() {
			$("#examBtn").click(function() {
				$("#exam").show();
				$("#addQuestion").hide();
			});
			$("#addQuesBtn").click(function() {
				$("#exam").hide();
				$("#addQuestion").show();
			});
		});
	</script>
</body>
</html>
