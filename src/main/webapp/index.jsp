<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Product Discount Calculator</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
<h2>Product Discount Calculator</h2>
<form action="/Calculate" method="post">
    <input type="text" name="Product Description" placeholder="Product Description"/><br/>
    <input type="text" name="List Price" placeholder="List Price"/><br/>
    <input type="text" name="Discount Percent" placeholder="Discount Percent" /><br/>
    <input type = "submit" value = "Calculate Discount"/>
</form>
</body>
</html>