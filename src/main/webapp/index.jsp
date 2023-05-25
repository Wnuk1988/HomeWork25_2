<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>My first uploading and downloading file</title>
</head>
<body style="background-color: cornflowerblue; text-align: center">
<h2 style="background-color: blue">Hello User!!!</h2>
<div>
    <h3 style="background-color: red; text-align: center"> Choose book to Upload in Server </h3>
    <form action="upload_book" method="post" enctype="multipart/form-data">
        <input type="file" name="file"/>
        <input style="background-color: darkgreen; text-align: center" type="submit" value="Upload Book"/>
    </form>
    <h3 style="background-color: darkorange; text-align: center"> Write book title to download from Server </h3>
    <form action="download_book" method="get">
        Book title: <input  type="text" name="title"/>
        <input style="background-color: deeppink; text-align: center" type="submit" value="Download book" />
    </form>
</div>
</body>
</html>
