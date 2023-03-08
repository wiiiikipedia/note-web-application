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
    <link rel="stylesheet" type="text/css" href="/static/css/style.css">
</head>
<body>
<header>
    <h1>
        Заметки
        <span>&#128204;</span>
    </h1>
</header>
<main>
    <form>
        <label for="note">Введите текст заметки:</label>
        <textarea id="note" name="note"></textarea>
        <button class="button btn btn-dark mx-1 d-none d-sm-block" type="submit">Сохранить</button>
    </form>
    <div id="notes-container">
        <h2>Ваши заметки:</h2>

        <div class="d-flex border-bottom flex-row p-3">
            <div class="d-flex flex-column col-12 col-sm-10 col-lg-9">
                <div class="d-flex flex-row align-items-center">
                    <a href="#">dikola/Курсовая</a>
                </div>
            </div>
            <div class="d-flex flex-column flex-grow-1">
                <div class="d-flex flex-row justify-content-end mb-2 align-items-center">
                    <button class="btn btn-dark btn-sm mx-1 d-none d-sm-block">Изменить
                    </button>
                    <button class="btn btn-dark btn-sm mx-1 d-none d-sm-block">Удалить
                    </button>
                </div>
            </div>
        </div>
        <div class="d-flex border-bottom flex-row p-3">
            <div class="d-flex flex-column col-12 col-sm-10 col-lg-9">
                <div class="d-flex flex-row align-items-center">
                    <a href="#">dikola/Курсовая</a>
                </div>
            </div>
            <div class="d-flex flex-column flex-grow-1">
                <div class="d-flex flex-row justify-content-end mb-2 align-items-center">
                    <button class="btn btn-dark btn-sm mx-1 d-none d-sm-block">Изменить
                    </button>
                    <button class="btn btn-dark btn-sm mx-1 d-none d-sm-block">Удалить
                    </button>
                </div>
            </div>
        </div>

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