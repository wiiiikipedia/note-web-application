<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Note Web Application</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.5.0/css/all.css" integrity="sha384-B4dIYHKNBt8Bc12p+WXckhzcICo0wtJAoU8YZTY5qE0Id1GSseTk6S+L3BlXeVIU" crossorigin="anonymous">
    <link rel="stylesheet" type="text/css" href="/css/style.css">
</head>
<body>
<header>
    <div href="index">
        <h1>
            Заметки
            <span>&#128204;</span>
        </h1>
    </div>
</header>
<main>
    <div id="notes-container">
        <form method="put" action="/api/notes/${noteFromDatabase.getId()}/edit" modelAttribute="editNoteForm">
            <h2>Изменение заметки:</h2>
            <div class="formContent">
                <input name="noteHeader" value="${noteFromDatabase.getNoteHeader()}">
            </div>
            <div class="formContent txt">
                <input name="noteBody" value="${noteFromDatabase.getNoteBody()}">
            </div>
            <button class="button btn btn-dark mx-1 d-none d-sm-block" type="submit">Изменить</button>
        </form>
    </div>

</main>
<footer id="footer" class="bg text-center text-lg-start">
    <div class="text-center p-3" >
        2023 Copyright:
        <a class="text-dark" href="https://gitflic.ru/user/wiiiiiikipedia" >wiiiiiikipedia</a>
    </div>
</footer>
</body>
</html>