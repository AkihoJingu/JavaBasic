<?php
$errMsg = array();
$isFirstView = TRUE;
if ($_POST['isFirstView']) {
    $isFirstView = FALSE;
}
if (! $isFirstView) {
    if ($_POST['name']) {
        $name = $_POST['name'];
    } else {
        $errMsg['name'] = "名前を入力してください<br>";
    }
    if ($_POST['pass']) {
        $pass = $_POST['pass'];
    } else {
        $errMsg['pass'] = "パスワードを入力してください<br>";
    }
}

?>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<title></title>
</head>
<body>
	<form action="index.php" method="post">
		<input type="hidden" name="isFirstView" value="false">
		<p>
			名前<input type="text" name="name" value="<?= $name ?>">
		</p>
		<p>
			パスワード<input type="password" name="pass" value="<?= $pass ?>">
		</p>
		<p>
			コメント
			<textarea name="comment"></textarea>
		</p>
		<input type="submit" value="送信">
	</form>
<?php
print $errMsg['name'];
print $errMsg['pass'];
?>
</body>
</html>