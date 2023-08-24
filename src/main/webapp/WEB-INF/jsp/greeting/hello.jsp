<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Hello</title>
</head>
<body>
  Hello ${requestScope.user.username}!
  Hello userRead ${requestScope.userRead.username}!
  User Read ${requestScope.get("userRead")}
</body>
</html>