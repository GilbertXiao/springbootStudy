<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>index</title>
</head>
<body>

<table border="1px solid">
    <tr>
        <td>用户编号</td>
        <td>用户名称</td>
        <td>用户地址</td>
    </tr>
    <#list userList as user>
        <tr>
            <td>${user.id}</td>
            <td>${user.username}</td>
            <td>${user.address}</td>
        </tr>
    </#list>

    <tr>
        <td>用户编号</td>
        <td>用户名称</td>
        <td>用户地址</td>
    </tr>
    <#list userList as user>
        <tr>
            <td>${user.id}</td>
            <td>${user.username}</td>
            <td>${user.address}</td>
        </tr>
    </#list>
</table>
</body>
</html>