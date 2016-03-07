<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
<script type="text/javascript">
function dan(){
	$.getJSON("looseSearch.do",
			{CHARS:$('#searchBox').val()},
			alert('ouch'),
		function(data){
				alert('ouch')
			}
		);
}
</script>
</head>
<body>
<input type="text" id="searchBox" />
<button onclick="dan();" >xoceno</button>
<div id="results" ><h1> text goes here</h1> </div>

</body>
</html>